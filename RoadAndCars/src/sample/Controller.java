package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Controller {

    @FXML
    private Button nextButton;

    @FXML
    private TextField redLight_Lenght;

    @FXML
    private TextField carsPerMin;

    @FXML
    void goOnAction(ActionEvent actionEvent){
            Parent root;
            try {
                root = FXMLLoader.load(getClass().getResource("secondScene.fxml"));
                Stage stage = new Stage();
                stage.setTitle("My New Stage Title");
                stage.setScene(new Scene(root, 400, 400));
                stage.show();
                System.out.println("Длинна горения красного света: " + getRedLightLength());
                System.out.println("Частота появления машин в минуту: " + getCarsPerMinute());
            }
            catch (IOException e) {
                e.printStackTrace();
            }
    }

    public int getRedLightLength(){
        try{
            int redLightLength = Integer.parseInt(redLight_Lenght.getText());
            return redLightLength;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        finally {
            return 5;
        }
    }

    public int getCarsPerMinute(){
        try{
            int carsPerMinute = Integer.parseInt(carsPerMin.getText());
            return carsPerMinute;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        finally {
            return 5;
        }
    }

}

