import java.awt.*;
import java.util.Random;

/**
 * The is the class that all the other shapes will use as a basis.
 * This class will randomize the properties that all shapes have in common.
 * I.e the shapes position and colour(which includes opacity)
 */

abstract class Shape {
    protected int shapeLocX; //x co-ordinate of the shape
    protected int shapeLocY; //y co-ordinate of the shape
    protected Color shapeColor; //Color of the shape
    protected Random random = Canvas.random;
    private static final int RGB_BOUND = 255;

    //Public Constructor
    public Shape(int maxX, int maxY) {
        //We set the shapes co-ordinates randomly with an upper bound of the frame.
        //I.e the shapes position cannot be outside the frame
        shapeLocX = random.nextInt(maxX);
        shapeLocY = random.nextInt(maxY);

        int red = random.nextInt(RGB_BOUND);
        int green = random.nextInt(RGB_BOUND);
        int blue = random.nextInt(RGB_BOUND);
        int opacity = random.nextInt(RGB_BOUND);

        shapeColor = new Color(red, green, blue, opacity);
    }
    abstract void draw(Graphics g);
}
