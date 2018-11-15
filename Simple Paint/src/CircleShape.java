import java.awt.*;

public class CircleShape extends Shape {
    protected int radius;

    //Public constructor
    public CircleShape(int maxX, int maxY){
        super(maxX,maxY);
        radius = random.nextInt(maxX/4);
    }

    @Override
    void draw(Graphics g){
        g.setColor(shapeColor);
        g.fillArc(shapeLocX,shapeLocY,radius,radius,0,360);
    }
}
