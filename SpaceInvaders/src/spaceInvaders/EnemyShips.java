package spaceInvaders;

import javax.swing.ImageIcon;

public class EnemyShips extends Models {

    private Bomb bomb;
    private final String alienImg = "src/alien1.png";

    public EnemyShips(int x, int y) {

        initAlien(x, y);
    }

    private void initAlien(int x, int y) {

        this.x = x;
        this.y = y;

        bomb = new Bomb(x, y);
        ImageIcon ii = new ImageIcon(alienImg);
        setImage(ii.getImage());
    }

    public void act(int direction) {
        
        this.x += direction;
    }

    public Bomb getBomb() {
        
        return bomb;
    }

    public class Bomb extends Models {

        private final String bombImg = "src/bomb.png";
        private boolean destroyed;

        public Bomb(int x, int y) {

            initBomb(x, y);
        }

        private void initBomb(int x, int y) {

            setDestroyed(true);
            this.x = x;
            this.y = y;
            ImageIcon ii = new ImageIcon(bombImg);
            setImage(ii.getImage());

        }

        public void setDestroyed(boolean destroyed) {
        
            this.destroyed = destroyed;
        }

        public boolean isDestroyed() {
        
            return destroyed;
        }
    }
}
