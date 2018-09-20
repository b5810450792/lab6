import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class Controller {
    @FXML
    TableView<ExpenseIncome> tableView;
    @FXML
    TableColumn<ExpenseIncome,String> idate;
    @FXML
    TableColumn<ExpenseIncome,Double> imoney;
    @FXML
    TableColumn<ExpenseIncome,String> itype;
    @FXML
    TableColumn<ExpenseIncome,String> idetail;
    @FXML
    TableColumn<ExpenseIncome,Double> ibalance;
    @FXML
    TextField date;
    @FXML
    TextField money;
    @FXML
    TextField type;
    @FXML
    TextField detail;
    @FXML
    Label label;
    private ExpenseIncome expenseIncome;
    private ObservableList<ExpenseIncome> data = FXCollections.observableArrayList();
    private Balance b = new Balance();

    @FXML
    public void initialize(){
        idate.setCellValueFactory(new PropertyValueFactory<ExpenseIncome,String>("rdate"));
        imoney.setCellValueFactory(new PropertyValueFactory<ExpenseIncome,Double>("rmoney"));
        itype.setCellValueFactory(new PropertyValueFactory<ExpenseIncome,String>("rtype"));
        idetail.setCellValueFactory(new PropertyValueFactory<ExpenseIncome,String>("rdetail"));
        //ibalance.setCellValueFactory(new PropertyValueFactory<ExpenseIncome,Double>("rbalance"));
        tableView.setItems(data);

    }
    @FXML
    public void clickExpense(ActionEvent event){
        expenseIncome = new ExpenseIncome(date.getText(),Double.parseDouble(money.getText()),type.getText(),detail.getText(),b.getTotal());
        FileConnect fileConnect =new FileConnect();
        fileConnect.writeFileExpense(expenseIncome,b);
        label.setText(b.getTotal()+"");
        data.add(expenseIncome);
    }

    @FXML
    public void clickIncome(ActionEvent event){
        expenseIncome = new ExpenseIncome(date.getText(),Double.parseDouble(money.getText()),type.getText(),detail.getText(),b.getTotal());
        FileConnect fileConnect =new FileConnect();
        fileConnect.writeFileIncome(expenseIncome,b);
        label.setText(b.getTotal()+"");
        data.add(expenseIncome);

    }
}
