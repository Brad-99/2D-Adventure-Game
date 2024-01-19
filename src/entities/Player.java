package entities;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

public class Player extends Entity {


    private BufferedImage[][] animations;
    public Player(float x, float y) {
        super(x, y);
    }

    public void update() {
    }

    public void render() {

    }
    private void loadAnimations() {
        InputStream is = getClass().getResourceAsStream("/player_sprites.png");
        try {
            img = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close(); // free up resources & avoid problems
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        animations = new BufferedImage[9][6];
        for(int j = 0; j < animations.length; j++)
            for(int i = 0; i < animations[j].length; i++)
                animations[j][i] = img.getSubimage(i*64, j*40, 64, 40);
    }
}


