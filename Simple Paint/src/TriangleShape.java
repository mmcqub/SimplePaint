import java.awt.*;

public class TriangleShape extends Shape {
    int maxX;
    int maxY;
    //Public Constructor
    public TriangleShape(int maxX, int maxY) {
        super(maxX, maxY);
        this.maxX = maxX;
        this.maxY = maxY;
    }

    @Override
    void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(shapeColor);
        g2.setStroke(new BasicStroke(3));

        int randx1 = random.nextInt(maxX);
        int randy1 = random.nextInt(maxY);
        int randx2 = random.nextInt(maxX);
        int randy2 = random.nextInt(maxY);
        int randx3 = random.nextInt(maxX);
        int randy3 = random.nextInt(maxY);

        g2.drawLine(randx1,randy1,randx2,randy2);
        g2.drawLine(randx2,randy2,randx3,randy3);
        g2.drawLine(randx3,randy3,randx1,randy1);

    }
}


