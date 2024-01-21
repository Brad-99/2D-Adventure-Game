package inputs;

import main.GamePanel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import static utilz.Constants.Directions.*;

public class KeyboardInputs implements KeyListener {

    private GamePanel gamePanel;
    public KeyboardInputs(GamePanel gamePanel) { // Now we have game panel access inside keyboardInputs
        this.gamePanel = gamePanel;
    }
    // Whenever we press w/s/a/d we change some value in game panel class
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.getGame().getPlayer().setUp(false);
                break;
            case KeyEvent.VK_A:
                gamePanel.getGame().getPlayer().setLeft(false);
                break;
            case KeyEvent.VK_S:
                gamePanel.getGame().getPlayer().setDown(false);
                break;
            case KeyEvent.VK_D:
                gamePanel.getGame().getPlayer().setRight(false);
                break;
        }
    }
    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                gamePanel.getGame().getPlayer().setUp(True);
                break;
            case KeyEvent.VK_A:
                gamePanel.getGame().getPlayer().setLeft(True);
                break;
            case KeyEvent.VK_S:
                gamePanel.getGame().getPlayer().setDown(True);
                break;
            case KeyEvent.VK_D:
                gamePanel.getGame().getPlayer().setRight(True);
                break;
        }
    }
}
