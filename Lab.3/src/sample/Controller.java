package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.util.Scanner;
public class Controller {
    public Button btmMain;
    public TextField txtLicznik;
    int clickCounter = 0;


    public void onBtmAction(ActionEvent actionEvent) {
        System.out.println("Kliknięcie nr." + ++clickCounter);
        if (clickCounter == 1)
            btmMain.setText("I jeszcze raz");
        if (clickCounter >= 0) {
            txtLicznik.setText("Klikow: " + clickCounter);
        }
    }
}