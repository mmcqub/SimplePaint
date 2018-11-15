import javax.swing.*;
import java.awt.*;

public class SimplePaint {
    private JFrame frame; //This is the main frame
    private JButton repaintButton; //This button repaints new shapes in the canvas
    private Canvas canvas; //Here is the canvas where the actual shapes are drawn

    public static final int FRAME_HEIGHT = 450;
    public static final int FRAME_WIDTH = 800;

    //Public Constructor
    public SimplePaint(){
        frame = new JFrame("Simple Paint");
        frame.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        canvas = new Canvas();
        repaintButton = new JButton("Repaint");
        repaintButton.addActionListener(canvas);  //Adds a listener to the repaintButton
        frame.add(repaintButton, BorderLayout.SOUTH); //Places new button at the bottom of frame
        frame.add(canvas);
        //This three need to be at the bottom of the code to work correctly
        frame.pack();
        canvas.newPainting();
        frame.setLocationRelativeTo(null); //Positions frame in the middle of the screen.
        frame.setVisible(true);
    }

}


