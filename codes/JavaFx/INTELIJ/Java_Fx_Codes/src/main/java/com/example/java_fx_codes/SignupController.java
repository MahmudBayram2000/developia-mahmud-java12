package com.example.java_fx_codes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class SignupController {

    @FXML
    private TextField name;

    @FXML
    private TextField surname;

    @FXML
    private TextField address;

    @FXML
    private TextField phone;

    @FXML
    private TextField usernameTF;

    @FXML
    private PasswordField passwordPF;

    @FXML
    private Label messageLabel;

    @FXML
    protected void onSave() throws Exception {

        String nameD = name.getText();
        String surnameD = surname.getText();
        String addressD = address.getText();
        String phoneD = phone.getText();
        String username = usernameTF.getText();
        String password = passwordPF.getText();

// check teacher data validation
        if (nameD.length() < 2) {
            messageLabel.setText("Ad min 2 simvol olmalidir");
            return;
        }

        if (surnameD.length() < 2) {
            messageLabel.setText("Soyad min 2 simvol olmalidir");
            return;
        }

        if (username.length() < 2) {
            messageLabel.setText("username min 2 simvol olmalidir");
            return;
        }
        if (password.length() < 2) {
            messageLabel.setText("Parol min 2 simvol olmalidir");
            return;
        }

        // check if username already exists
        SignupService service = new SignupService();
        boolean exists = service.checkUsername(username);
        if (exists) {
            messageLabel.setText("bu username artiq istifade olunub");
            return;
        }

        // save data
        Teacher t = new Teacher(0, nameD, surnameD, addressD, phoneD, "");
        t.setUsername(username);
        t.setPassword(password);
        service.save(t);messageLabel.setText("qeydiyyat getdi");

    }

}




