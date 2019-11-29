package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import javax.swing.*;


public class Controller {

    @FXML
    private Button nextButton;

    @FXML
    private TextField redLight_Lenght;

    @FXML
    private TextField greenLight_Length;

    @FXML
    private TextField carsPerMin;

    @FXML
    void goOnAction(Action event){
        try{
            SecondScene secondScene = new SecondScene();
            secondScene.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getRedLightLength(){
        int redLightLength = Integer.parseInt(redLight_Lenght.getText());
        return redLightLength;
    }

    public int getGreenLightLength(){
        int greenLightLength = Integer.parseInt(greenLight_Length.getText());
        return greenLightLength;
    }

    public int getCarsPerMinute(){
        int carsPerMinute = Integer.parseInt(carsPerMin.getText());
        return carsPerMinute;
    }
}

