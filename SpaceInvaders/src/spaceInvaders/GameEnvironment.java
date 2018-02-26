package space_Invaders;


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameEnvironment extends JPanel implements CommonInterface{
	// set dimensions
	protected final static int noOfDeaths=3;
	protected final static int speed=5;
	protected Dimension board;
	
	protected Player player;
	/*
	 * protected final static int movementDirection;
	 * protected final static int speed;
	 * dimensions 
	 */
	
	GameEnvironment()
	{
		initializeBoard();
	}
	
	void initializeBoard()
	{
		board = new Dimension(boardWidth, boardLength);
        setBackground(Color.black);
        player= new Player();
	}
	
	void drawAliens()
	{
		
	}
	
	void drawPlayer(Graphics draw_graphics)
	{
	{   
		//Player.paintIcon(this, draw_graphics, player.getXPos(), player.getYPos());
		draw_graphics.drawImage(player.getIcon(), player.getXPos(), player.getYPos(), this);
    }

    /*if (player.getIsDead()) {

        player.die();
        ingame = false;
    }*/
		
	}
	
	void drawShot()
	{
		
	}
	
	void drawEnemnyShot()
	{
		
	}
	
	void drawComponent()
	{
	
	}
	
	void endOfGame()
	{
	
	}
	
	void setSpeed(int speed)
	{
	
	}
	
	int getSpeed()
	{
	    return 0;
	}

}
