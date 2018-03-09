package spaceInvaders;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player extends Models implements Commons {

    private final int START_Y = 540;
    private final int START_X = 300;

    private final String playerImg = "src/ship.png";
    private int width;

    public Player() {

        initPlayer();
    }

    private void initPlayer() {
        
        ImageIcon ii = new ImageIcon(playerImg);

        width = ii.getImage().getWidth(null);

        setImage(ii.getImage());
        setX(START_X);
        setY(START_Y);
    }

    public void act() {
        
        x += dx;
        
        if (x <= 2) {
            x = 2;
        }
        
        if (x >= BOARD_WIDTH - 2 * width) {
            x = BOARD_WIDTH - 2 * width;
        }
    }

    public void keyPressed(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
        
            dx = -2;
        }

        if (key == KeyEvent.VK_RIGHT) {
        
            dx = 2;
        }
    }

    public void keyReleased(KeyEvent e) {
        
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
        
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
        
            dx = 0;
        }
    }
}