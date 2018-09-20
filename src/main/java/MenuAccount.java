import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuAccount {
    @FXML
    TextField textField;


    @FXML
    public void initialize() {
        FileConnect fileConnect = new FileConnect();
        fileConnect.readFile();
    }

    @FXML
    public void clickExpenseGoToNextPage(ActionEvent event){
        Button next = (Button) event.getSource();

        Stage stage = (Stage) next.getScene().getWindow();

        FXMLLoader loader = new FXMLLoader(getClass().getResource("ExpenseIncome.fxml"));
        try {
            stage.setScene(new Scene(loader.load(), 604, 403));
            stage.show();
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }
}
