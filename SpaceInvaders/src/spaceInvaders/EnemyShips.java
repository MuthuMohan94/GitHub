import javax.swing.ImageIcon;

public class EnemyShips extends Model{
    private Bomb bomb;
    private String enemyImg = "src/img/alien1.png";

    // Constructor
	EnemyShips(int x, int y){
		initEnemyShips(x,y);
	}
	
	void initEnemyShips(int x,int y){
		//set location
		this.x = x;
        this.y = y;
        //get the icon attached
        ImageIcon enemyIcon = new ImageIcon(enemyImg);
        setImg(enemyIcon.getImage());
        //assign a bomb to it
        bomb = new Bomb(x, y);
	}
	
    //position an alien in horizontal direction, every round the alient goes down by 1 unit
    public void move_down(int direction) {       
        this.x += direction;
    }

    //is called when the alien is about to drop a bomb
    public Bomb getBomb() {       
        return bomb;
    }
    
 
    // Each alien has a bomb
	public class Bomb extends Model {
		private String bombImg = "src/img/bomb.png";
		private boolean destroyed; //set to true if 1. it reaches to the ground 2. at the beginning of the game 
		
		public Bomb(int x, int y) {
			initBomb(x, y);
		}
		
		private void initBomb(int x, int y) {
			this.x = x;
			this.y = y;
			setDestroyed(true);
			ImageIcon ii = new ImageIcon(bombImg);
			setImg(ii.getImage());
		}
		
		public void setDestroyed(boolean destroyed) {       
			this.destroyed = destroyed;
		}

		public boolean isDestroyed() {       
			return destroyed;
		}
	}
	
}
