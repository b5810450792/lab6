import javafx.beans.property.SimpleDoubleProperty;
        import javafx.beans.property.SimpleIntegerProperty;
        import javafx.beans.property.SimpleStringProperty;
        import javafx.collections.FXCollections;
        import javafx.collections.ObservableList;
        import javafx.fxml.FXML;
        import javafx.scene.control.TableColumn;
        import javafx.scene.control.TableView;
        import javafx.scene.control.TextField;

public class ExpenseIncome{
    private SimpleStringProperty rdate;
    private SimpleDoubleProperty rmoney;
    private SimpleStringProperty rtype;
    private SimpleStringProperty rdetail;
    private SimpleDoubleProperty rbalance;

    public ExpenseIncome(String sdate,Double smoney,String stype,String sdetail,Double sbalance){
        rdate = new SimpleStringProperty(sdate);
        rmoney = new SimpleDoubleProperty(smoney);
        rtype = new SimpleStringProperty(stype);
        rdetail = new SimpleStringProperty(sdetail);
        rbalance = new SimpleDoubleProperty(sbalance);
    }


    public String getRdate() {
        return rdate.get();
    }
    public void setRdate(String v){
        rdate.set(v);
    }
    public double getRmoney() {
        return rmoney.get();
    }
    public void setRmoney(Double v){
        rmoney.set(v);
    }
    public String getRtype() {
        return rtype.get();
    }
    public void setRtype(String v){
        rdate.set(v);
    }
    public String getRdetail() {
        return rdetail.get();
    }
    public void setRdetail(String v){
        rdetail.set(v);
    }
    public Double getBalance(){
        return  rbalance.get();
    }
    public void setBalance(Double v){
        rbalance.set(v);
    }

}
