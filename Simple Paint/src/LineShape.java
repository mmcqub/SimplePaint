import java.awt.*;

public class LineShape extends Shape {

    int maxX;
    int maxY;

    //Public constructor
    public LineShape(int maxX, int maxY){
        super(maxX,maxY);
        this.maxX = maxX;
        this.maxY = maxY;
    }

    @Override
    void draw(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(shapeColor);
        g2.setStroke(new BasicStroke(10));
        boolean chooser1 = random.nextBoolean();
        boolean chooser2 = random.nextBoolean();
        if(chooser1) {
            g2.drawLine(0, random.nextInt(maxY), random.nextInt(maxX), 0);
        }
        else{
            g2.drawLine(random.nextInt(maxX),0,maxX,random.nextInt(maxY));
        }

        if(chooser2){
            int rand = random.nextInt(maxY);
            g2.drawLine(0,rand,maxX,rand);
        }

        else{
            int rand = random.nextInt(maxX);
            g2.drawLine(rand,0,rand,maxY);
        }
    }

}
