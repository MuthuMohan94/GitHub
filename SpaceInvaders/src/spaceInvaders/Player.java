package space_Invaders;

import javax.swing.ImageIcon;

public class Player extends Model implements CommonInterface  {
	
	//protected String playerIconLocation="space_invader_player_icon.png";
    protected String playerIconLocation="src/space_Invaders/space_invader_player_icon.png";
	//protected String playerIconLocation="src/space_Invaders/space_invader_player.png";
	protected final int startXPos=150 ;
	protected final int startYPos=150;
	protected int width;
	// Constructor
	Player()
	{
		initPlayer();
	}
	
	void initPlayer()// two ints in bracket 
	{
		
		ImageIcon player_image= new ImageIcon(playerIconLocation);
		
		//width= player_image.getIconWidth(null);
		width= player_image.getImage().getWidth(null);
		setIcon(player_image.getImage());
		setXPos(startXPos);
		setYPos(startYPos);
		
		
	}
	
	void firePlayerShot()
	{
		
	}
	
	//void keyListener(KeyEvent)

}
