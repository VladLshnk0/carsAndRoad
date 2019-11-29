package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;

import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class SecondScene extends Application{
    static Stage stage;     //Очень важно static иначе не работает

    public void start(Stage primaryStage) throws  Exception {
        Scene sceneTwo = new Scene(FXMLLoader.load(getClass().getResource("secondScene.fxml")));
        Scene sceneThree = new Scene(FXMLLoader.load(getClass().getResource("thirdScene.fxml")));

        stage.setScene(sceneTwo);
        stage.show();

        sceneTwo.setOnMouseClicked(e -> {
            stage.setScene(sceneThree);
        });
    }
}
