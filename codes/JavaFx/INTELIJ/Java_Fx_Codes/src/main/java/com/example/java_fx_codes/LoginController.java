package com.example.java_fx_codes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LoginController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField password;

    @FXML
    protected void onLogin() {
        String fakeUsername="Mahmud";
        String fakePass="123";

        String inputUsername=username.getText();
        String inputPassword=password.getText();

        if(fakeUsername.equals(inputUsername) && fakePass.equals(inputPassword)){
            System.out.println("Login");
        }else{
            System.out.println("information is false");
        }

    }

    @FXML
    public void onSignup() throws  Exception{
        Stage stage=new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("signup.fxml"));
        Scene scene = new Scene(fxmlLoader.load() );
        stage.setTitle("New Teacher login");
        stage.setScene(scene);
        stage.show();
    }
}

