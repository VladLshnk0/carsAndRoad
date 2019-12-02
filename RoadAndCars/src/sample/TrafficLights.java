package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class TrafficLights {

    public int lengthSettings(){
        Controller controller = new Controller();
        return (1000 * controller.getRedLightLength());
    }

    public boolean lightSettings(){
        boolean canIGo = true;
        return canIGo;
    }

}
