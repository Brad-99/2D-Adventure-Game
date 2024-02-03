package ui;

import gamestates.Gamestate;
import utilz.LoadSave;

import java.awt.image.BufferedImage;

public class MenuButton {
    private int xPos, yPos, rowIndex;
    private Gamestate state;
    private BufferedImage[] imgs;

    public MenuButton(int xPos, int yPos, int rowIndex, Gamestate state) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.rowIndex = rowIndex;
        this.state = state;
        loadImgs();
    }

    private void loadImgs() {
        imgs = new BufferedImage[3];
        BufferedImage temp = LoadSave.GetSpriteAtlas(LoadSave.MENU_BUTTONS);
        for(int i = 0; i < imgs.length; i++)
            temp.getSubimage(i, i, i, i)
    }
}
