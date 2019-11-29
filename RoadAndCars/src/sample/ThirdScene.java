package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;

public class ThirdScene {
    static Stage stage;

    public void start(Stage primaryStage) throws  Exception {
        Parent root = FXMLLoader.load(getClass().getResource("thirdScene.fxml"));
        Scene scene = new Scene(root);

        Car car = new Car();
        car.loadImage();

        stage=primaryStage;          //заносим в поле
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @FXML
    public void okButton(ActionEvent event) throws Exception {     //Это событие кнопки
        stage.close();      //Закрываете окно
    }
}
