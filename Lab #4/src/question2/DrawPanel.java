package question2;

import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    // draw an X from the corners of the panel
    public void paintComponent(Graphics g) {
        // call paintComponent to ensure the panel displays correctly
        super.paintComponent(g);

        // total width
        int width = getWidth();

        // total height
        int height = getHeight();

        // draw a line from the upper-left to the lower-right
        g.drawLine(0, 0, width, height);

        // draw a line from the lower-left to the upper-right
        g.drawLine(0, height, width, 0);

        g.drawLine(width/2, 0, width/2, height);
        g.drawLine(0, height/2, width, height/2);
    }
}