package com.example.java_fx_codes;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;


public class LoginController {

        @FXML
        private TextField Username;
        @FXML
        private PasswordField Password;


        @FXML
        protected void onLogin() throws SQLException, IOException {
            LoginRepository loginRepository= new LoginRepository();

            String inputUsername = Username.getText();
            String inputPassword = Password.getText();

            if (loginRepository.checkUser(inputUsername, inputPassword)) {

                Stage stage = new Stage();
                FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("students.fxml"));
                Scene scene = new Scene(fxmlLoader.load());
                stage.setTitle("students page");
                stage.setScene(scene);
                stage.show();
            } else {
                System.out.println("Information is false");
            }

        }
        @FXML
        public void onSignup() throws Exception {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("signup.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("New Teacher login");
        stage.setScene(scene);
        stage.show();
}
}

