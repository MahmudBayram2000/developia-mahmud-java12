package com.example.java_fx_codes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SignupController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextField name;

    @FXML
    private TextField surname;

    @FXML
    private  TextField adress;

    @FXML
    private TextField phone;

    @FXML
    private TextField email;


    @FXML
    protected void onSave() {
        String fakename = "Mahmud";
        String fakesurname = "Bayramov";
        String fakeadress ="Nefchiler";
        String fakephone="0508508587";
        String fakeemail="mahmudbayramov371@gmail.com";
        String inputname=name.getText();
        String inputsurname=surname.getText();
        String inputadress=adress.getText();
        String inputphone=phone.getText();
        String inputemail=email.getText();
        if (fakename.equals(inputname) && fakesurname.equals(inputsurname) && fakeadress.equals(inputadress) && fakephone.equals(inputphone) && fakeemail.equals(inputemail)){
            System.out.println("Saved");
        }
        else
            System.out.println("Not Saved");

    }
    @FXML
protected void onSignup() throws  Exception{
    Stage stage=new Stage();
    FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("signup.fxml"));
    Scene scene = new Scene(fxmlLoader.load() );
    stage.setTitle("New teacher page");
    stage.setScene(scene);
    stage.show();

}

}


