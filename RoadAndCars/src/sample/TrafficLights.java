package sample;

public class TrafficLights {
    public void settings(){
        Controller controller = new Controller();
        int redLight_Length = controller.getRedLightLength();
        int greenLight_Length = controller.getGreenLightLength();
    }
}
