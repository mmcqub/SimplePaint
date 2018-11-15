import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

public class Canvas extends JPanel implements ActionListener {

    private static final int CANVAS_WIDTH = SimplePaint.FRAME_WIDTH;
    private static final int CANVAS_HEIGHT = SimplePaint.FRAME_HEIGHT;
    private static final long SEED = 90; //Seed to be used by the random generator
    static final Random random = new Random(SEED); //random generator to be used by all classes. Seed can be changed for different results.
    private ArrayList<Shape> shapeArrayList;

    //Public Constructor
    public Canvas() {
        setPreferredSize(new Dimension(SimplePaint.FRAME_WIDTH, SimplePaint.FRAME_HEIGHT));
        shapeArrayList = new ArrayList<>();
    }

    //This method iterates through a pre filled ArrayList of shapes and paints each shape in the canvas
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Shape s : shapeArrayList) {
            s.draw(g);
        }
    }

    //This method is called when the user clicks the 'repaint' button.
    //It creates a new ArrayList of shapes and then paints them to the canvas.
    @Override
    public void actionPerformed(ActionEvent e) {
        newPainting();
        repaint();
    }

    //This method creates an ArrayList of shapes, that is then used to paint the canvas.
    void newPainting() {

        shapeArrayList.clear();

        int k; // Used to store the value of the how many shapes to print.
        k = random.nextInt(40) + 10; //Here we have between 10 and 40 shapes being added to the ArrayList
        for (int i = 0; i < k; i++) {

            int shapeChooser = random.nextInt(3);

            switch (shapeChooser) {
                case 0:
                    shapeArrayList.add(new CircleShape(CANVAS_WIDTH, CANVAS_HEIGHT));
                    break;
                case 1:
                    shapeArrayList.add(new TriangleShape(CANVAS_WIDTH, CANVAS_HEIGHT));
                    break;
                case 2:
                    shapeArrayList.add(new LineShape(CANVAS_WIDTH, CANVAS_HEIGHT));
                    break;

            }

        }
    }
}

