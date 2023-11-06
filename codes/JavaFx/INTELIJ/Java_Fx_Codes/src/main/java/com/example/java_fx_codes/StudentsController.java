package com.example.java_fx_codes;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;


public class StudentsController implements Initializable {

   @FXML
    private TableView<Student> studentsTable;

   @FXML
   private TableColumn <Student,Integer> idColumn;

   @FXML
    private TableColumn<Student, String> nameColumn;

   @FXML
    private TableColumn<Student, String> surnameColumn;

   @FXML
    private TableColumn <Student,String> addressColumn;

   @FXML
   private TableColumn <Student,String> emailColumn;

   @FXML
    private TableColumn<Student,String> phoneColumn;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        surnameColumn.setCellValueFactory(new PropertyValueFactory<>("surname"));
        addressColumn.setCellValueFactory(new PropertyValueFactory<>("address"));
        phoneColumn.setCellValueFactory(new PropertyValueFactory<>("phone"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        StudentsRepository repository = new StudentsRepository();

        ObservableList<Student> data = FXCollections.observableArrayList();
        try {
            data.addAll(repository.findAll());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        studentsTable.setItems(data);

    }

}








