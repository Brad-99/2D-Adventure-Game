package main;

import java.awt.Graphics;
import javax.swing.JPanel;

// JPanel is the painting inside the frame
public class GamePanel extends JPanel {

    public GamePanel() {
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawRect();
    }

}
