package main;

import inputs.KeyboardInputs;
import inputs.MouseInputs;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import static utilz.Constants.PlayerConstants.*;
import static utilz.Constants.Directions.*;

// JPanel is the painting inside the frame
public class GamePanel extends JPanel {
    private MouseInputs mouseInputs;

    public GamePanel() { // Constructor
        // Adding a new instance of KeyboardInputs as a KeyListener
        // "this" is a reference to the current instance of the class. In this case,
        // it's passed to the KeyboardInputs instance so that it knows which GamePanel it is associated with.
        mouseInputs = new MouseInputs(this);
        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }
    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }
    public void updateGame() {
    }

        public void paintComponent (Graphics g){ // This is what's inside the paint
            super.paintComponent(g);
       }
            super.paintComponent(g);
            game.render(g);
}