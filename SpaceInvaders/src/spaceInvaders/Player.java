package spaceInvaders;

import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Player extends Model implements CommonInterface  {
	// starting position of the player when the game starts
    private int startXPos = 200;
    private int startYPos = 340;

    private final String playerImg = "src/img/ship.png";
    private int Width;


    public Player() {
        initPlayer();
    }
	
	void initPlayer(){		
		ImageIcon i= new ImageIcon(playerImg);
		Width = i.getImage().getWidth(null);
		setImg(i.getImage());
		setX(startXPos);
		setY(startYPos);		
	}
	
	public void act()
	{
		
		x+=d;
		if(x<=2) {
			x=2;
		}
		if(x>=BOARD_WIDTH-2*Width)
		{
			x=BOARD_WIDTH-2*Width;
		}
	}
	public void keypressed(KeyEvent e)
	{
		int k=e.getKeyCode();
		// if left cursor key pressed
		if(k==KeyEvent.VK_LEFT)
		{
			d=-2;
		}
		//if right cursor key pressed
		if(k==KeyEvent.VK_RIGHT)
		{
			d=2;
		}
	}
	// if both keys are released
	public void keyreleased(KeyEvent e)
	{
		int k=e.getKeyCode();
		if(k==KeyEvent.VK_LEFT)
		{
			d=0;
		}
	if(k==KeyEvent.VK_RIGHT)
	{
		d=0;
	}
	}

}
