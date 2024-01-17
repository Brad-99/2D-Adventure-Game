package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JPanel;

// JPanel is the painting inside the frame
public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta = 100, yDelta = 100;

    public GamePanel() { // Constructor
        // Adding a new instance of KeyboardInputs as a KeyListener
        // "this" is a reference to the current instance of the class. In this case,
        // it's passed to the KeyboardInputs instance so that it knows which GamePanel it is associated with.
        addKeyListener(new KeyboardInputs(this));
        mouseInputs = new MouseInputs(this);
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeXDelta(int value) {
        this.xDelta += value;
        repaint();
    }

    public void changeYDelta(int value) {
        this.yDelta += value;
        repaint();
    }

    public void setRectPos(int x, int y) {
        this.xDelta = x;
        this.yDelta = y;
        repaint();
    }

    public void paintComponent(Graphics g) { // This is what's inside the paint
        super.paintComponent(g);

        g.fillRect(xDelta, yDelta, 200, 50);
    }

}
