package src;

import java.awt.*;

public class TurtleCheckerboard {
    public static void main(String[] args) {
        World world = new World(500, 500);
        Turtle tomTurle = new Turtle(world);
        tomTurle.setColor(Color.blue);

        tomTurle.penUp();
        tomTurle.moveTo(50, 50); // moveTo(x,y) command
        tomTurle.setHeading(0);
        tomTurle.penDown();

        for (int y = 0; y < 4; y++) {

            for (int x = 0; x < 4; x++) {
                tomTurle.drawSquare();
                tomTurle.penUp();
                tomTurle.moveTo((x + 1) * 100 + 50, y * 100 + 50);
                tomTurle.penDown();
            }

            tomTurle.penUp();
            tomTurle.moveTo(50, (y + 1) * 100 + 50);
            tomTurle.penDown();
            tomTurle.setVisible(true);
        }
    }
}