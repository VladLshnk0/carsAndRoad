package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.Button;
import java.io.IOException;

public class SecondScene{

    ObservableList<String> numR = FXCollections.observableArrayList("1", "2", "3");

    @FXML
    private TextField greenLight_Length;

    @FXML
    private TextField carsPerMin;

    @FXML
    private Button goOn;

    @FXML
    private ComboBox numOfRoads;

    @FXML
    private CheckBox turnAllowBox;

    @FXML
    private CheckBox TrafficLights_WorkBox;

    @FXML
    private void initialize(){
        numOfRoads.setValue("1");
        numOfRoads.setItems(numR);
    }

    @FXML
    void goOnAction(ActionEvent actionEvent){
        System.out.println("Светофоры включены: " + getTrafficLight());
        System.out.println("Повороты на красный включены: " + getTurnAllow());
        System.out.println("Количество полос движения: " + getNumberOfRoads());
        ThirdScene ts = new ThirdScene();
        ts.action();
    }

    boolean turnAllow = false;
    boolean trafficLight = false;

    @FXML
    void handleTurnAllowBox(){
        if(turnAllowBox.isSelected()){
            turnAllow = true;
        }
    }

    @FXML
    void handleTrafficLightBox(){
        if(TrafficLights_WorkBox.isSelected()){
            trafficLight = true;
        }
    }

    public boolean getTurnAllow(){
        handleTurnAllowBox();
        return turnAllow;
    }

    public boolean getTrafficLight(){
        handleTrafficLightBox();
        return trafficLight;
    }

    public int getNumberOfRoads(){
        int i = 1;

        if(numOfRoads.getValue().equals("2")){
            i = 2;
        }
        if(numOfRoads.getValue().equals("3")){
            i = 3;
        }
        return i;
    }
}


