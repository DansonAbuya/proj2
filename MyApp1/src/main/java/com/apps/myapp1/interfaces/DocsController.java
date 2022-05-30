package com.apps.myapp1.interfaces;

import com.apps.myapp1.utilities.MyConnections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

public class DocsController implements Initializable {
    @FXML
    private TextField CardNoID;

    @FXML
    private PasswordField PinNumberId;

    Stage dialogStage = new Stage();
    Scene scene;

    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public DocsController() {
        connection = MyConnections.connectdb();
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        String CardNumber=CardNoID.getText().toString();
        String pin = PinNumberId.getText().toString();

        String sql = "SELECT * FROM Customers WHERE Card_Number = ? and Pin_Number = ?";

        try{
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, CardNumber);
            preparedStatement.setString(2, pin);
            resultSet = preparedStatement.executeQuery();
            if(!resultSet.next()){
                infoBox("Enter Correct Card-Number and Pin", "Failed", null);
            }else{

                infoBox("Login Successfull", "Success", null);
                Node source = (Node) event.getSource();
                dialogStage = (Stage) source.getScene().getWindow();
                dialogStage.close();
                scene = new Scene(FXMLLoader.load(getClass().getResource("FXMLMenu.fxml")));
                dialogStage.setScene(scene);
                dialogStage.show();
            }

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void infoBox(String infoMessage, String titleBar, String headerMessage)
    {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titleBar);
        alert.setHeaderText(headerMessage);
        alert.setContentText(infoMessage);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}

