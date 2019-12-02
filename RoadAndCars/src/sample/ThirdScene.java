package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

public class ThirdScene{
    public void action(){
        try {
            Pane root = FXMLLoader.load(getClass().getResource("thirdScene.fxml"));
            Stage stage = new Stage();

            Group group = new Group();

            Car car = new Car();
            Rectangle carObj = car.movingStraight();
            Rectangle carObj2 = car.movingTurn();

            stage.setTitle("Roads");
            root.getChildren().addAll(carObj, carObj2);

            stage.setScene(new Scene(root, 400, 400));
            stage.show();
        }
        catch (IOException  e) {
            e.printStackTrace();
        }
    }

    TrafficLights trafficLights = new TrafficLights();
    Boolean canIGo = trafficLights.lightSettings();

}


