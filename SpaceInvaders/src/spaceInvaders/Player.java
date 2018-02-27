import javax.swing.ImageIcon;

public class Player extends Model implements CommonInterface  {
	// starting position of the player when the game starts
    private int startXPos = 200;
    private int startYPos = 340;

    private final String playerImg = "src/img/ship.png";


    public Player() {
        initPlayer();
    }
	
	void initPlayer(){		
		ImageIcon playerIcon= new ImageIcon(playerImg);
		setImg(playerIcon.getImage());
		setX(startXPos);
		setY(startYPos);		
	}
	

}