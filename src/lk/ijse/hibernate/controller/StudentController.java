package lk.ijse.hibernate.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import lk.ijse.hibernate.business.BOFactory;
import lk.ijse.hibernate.business.BOType;
import lk.ijse.hibernate.business.SuperBO;
import lk.ijse.hibernate.business.custom.impl.StudentBOimpl;
import lk.ijse.hibernate.dto.StudentDTO;

import java.sql.Date;

public class StudentController{
    public TextField txtId;
    public TextField txtaddress;
    public TextField txtcontact;
    public TextField txtdob;
    public TextField txtGender;
    public TextField txtname;
    public Button btnadd;
    public Button btnupdate;
    public Button btnremove;
    public Button btnfind;

    StudentBOimpl studentBOimpl = BOFactory.getInstance().getBO(BOType.STUDENT);

    public void searchOnAction(ActionEvent actionEvent) {
    }

    public void btnaddOnAxction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtname.getText();
        String address = txtaddress.getText();
        String contact = txtcontact.getText();
        String dob = txtdob.getText();
        String gender = txtGender.getText();

        StudentDTO student = new StudentDTO(id, name, address, contact, dob, gender);

        try {
            boolean added = studentBOimpl.addStudent(student);

            if (added){
                new Alert(Alert.AlertType.CONFIRMATION,"Added Successfully").showAndWait();
            }else {
                new Alert(Alert.AlertType.WARNING,"Ooops!").showAndWait();
            }
            txtId.clear();
            txtname.clear();
            txtaddress.clear();
            txtcontact.clear();
            txtdob.clear();
            txtGender.clear();

            txtId.requestFocus();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void btnupdateOnAction(ActionEvent actionEvent) {
    }

    public void btnremoveOnAction(ActionEvent actionEvent) {
    }

    public void btnfindOnAction(ActionEvent actionEvent) {
    }
}
