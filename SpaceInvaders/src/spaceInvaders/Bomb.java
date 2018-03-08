package spaceInvaders;

import javax.swing.ImageIcon;

public class Bomb extends Model {

    private final String shotImg = "src/images/shot.png";
    private final int H_space = 6;
    private final int V_space = 1;

    public Bomb() {
    }

    public Bomb(int x, int y) {

        initShot(x, y);
    }

    private void initShot(int x, int y) {

        ImageIcon ii = new ImageIcon(shotImg);
        setImg(ii.getImage());
        
        setX(x + H_space);
        setY(y - V_space);
    }
}
