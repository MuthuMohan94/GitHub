package space_Invaders;


import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameEnvironment extends JPanel implements CommonInterface{
	// set dimensions
	protected final static int noOfDeaths=3;
	protected final static int speed=5;
	protected Dimension board;
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
	}
	
	void drawAliens()
	{
		
	}
	
	void drawPlayer()
	{
		
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
