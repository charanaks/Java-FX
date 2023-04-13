package com.example.controllerscommunication;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Controller1 {
    @FXML
    TextField nameTextField;
    //Dummy comment
    //Dummy comment 2
    private Stage stage;
    private Parent root;
    private Scene scene;
    public void login(ActionEvent e) throws IOException {

        String name = nameTextField.getText();
        System.out.println(name);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("wishing-page.fxml"));
        root = fxmlLoader.load();

        Controller2 controller2 = fxmlLoader.getController();
        controller2.showName(name);

        stage = (Stage) ((Node)e.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}