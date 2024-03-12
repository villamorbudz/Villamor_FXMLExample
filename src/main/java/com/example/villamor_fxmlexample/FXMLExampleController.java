package com.example.villamor_fxmlexample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import java.io.IOException;
public class FXMLExampleController {
    @FXML
    GridPane loginGridPane;
    @FXML
    Button logOutBtn;
    @FXML ColorPicker cpPicker;
    @FXML protected void handleSubmitButtonAction(ActionEvent event) throws IOException {
        Parent homeView = FXMLLoader.load(FXMLExample.class.getResource("home-view.fxml"));
        VBox v = (VBox) loginGridPane.getParent();
        v.getChildren().remove(loginGridPane);
        v.getChildren().add(homeView);
    }

    @FXML protected void logOut(ActionEvent event) throws IOException {
        Parent logInView = FXMLLoader.load(FXMLExample.class.getResource("fxml_example.fxml"));
        AnchorPane v = (AnchorPane) logOutBtn.getParent();
        v.getChildren().remove(logOutBtn);
        v.getChildren().remove(cpPicker);
        v.getChildren().add(logInView);
    }
}
