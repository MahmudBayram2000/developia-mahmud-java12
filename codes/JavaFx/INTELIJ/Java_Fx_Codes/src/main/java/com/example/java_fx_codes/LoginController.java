package com.example.java_fx_codes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField Username;

    @FXML
    private PasswordField Password;

    @FXML
    protected void onLogin() {
        String fakeusername = "Mahmud";
        String fakepassword = "123";
        String inputusername = Username.getText();
        String inputpassword = Password.getText();
        if (fakeusername.equals(inputusername) && fakepassword.equals(inputpassword)) {
            System.out.println("Complete");
        } else
            System.out.println("Error");
    }

    @FXML
protected void onSignup() throws  Exception{
    Stage stage=new Stage();
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("signup.fxml"));
    Scene scene = new Scene(fxmlLoader.load() );
    stage.setTitle("New Teacher page");
    stage.setScene(scene);
    stage.show();
}

}

