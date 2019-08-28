package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField txtName;

    @FXML
    private Button btnFirstName;

    @FXML
    private Label lblName;

    @FXML
    void showName(MouseEvent event) {
        // test if the button works
        // System.out.println("in showName");

        String name;
        name = txtName.getText();
        //System.out.println(name);
        lblName.setText(name);
    }

}
