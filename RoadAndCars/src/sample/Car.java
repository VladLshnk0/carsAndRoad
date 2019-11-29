package sample;


import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Car {
    BufferedImage img = null;
    public void loadImage() throws IOException {
        img = ImageIO.read(new File("assist/car1.png"));
    }
}
