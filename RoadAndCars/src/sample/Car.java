package sample;


import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.IOException;

public class Car {
    Rectangle carObj = new Rectangle(175, 0, 20, 35);

    public Rectangle movingStraight() throws IOException {
        KeyValue xValue = new KeyValue(carObj.xProperty(), 175);
        KeyValue yValue = new KeyValue(carObj.yProperty(), 400);

        KeyFrame keyFrame = new KeyFrame(Duration.millis(1450), xValue, yValue);

        Timeline timeline = new Timeline();
        timeline.getKeyFrames().addAll(keyFrame);
        timeline.play();

        return carObj;
    }

    public Rectangle movingTurn() {
        Rectangle carObj = new Rectangle(147, 0, 35, 20);
        carObj.setFill(Color.RED);

        Polyline polyline = new Polyline();
        polyline.getPoints().addAll(new Double[]{147.0, 0.0, 145.0, 135.0, -20.0, 137.0});

        PathTransition pathTransition = new PathTransition();
        pathTransition.setDuration(Duration.millis(1800));
        pathTransition.setPath(polyline);
        pathTransition.setNode(carObj);
        pathTransition.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
        pathTransition.play();

        return carObj;
    }

}
