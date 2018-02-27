import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.*;

public class GameEnvironment extends JPanel implements CommonInterface{
    private Dimension board;
    private ArrayList<EnemyShips> enemies;
    private Player player;

    private int ENEMY_X = 150;
    private int ENEMY_Y = 5;
    
    private boolean game_active = true; //see if game is still going
	
	public GameEnvironment(){
		initializeBoard();
	}
	
	private void initializeBoard(){
		board = new Dimension(BOARD_WIDTH, BOARD_HEIGHT);
        setBackground(Color.black);
        startGame();
	}

    public void startGame() {
    	//create 24 Aliens
    	enemies = new ArrayList<EnemyShips>();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
            	EnemyShips e = new EnemyShips(ENEMY_X + 18 * j, ENEMY_Y + 18 * i);
            	enemies.add(e);
            }
        }
        //create player
        player = new Player();
    }
	
    public void drawEnemys(Graphics g) {
        for (EnemyShips e: enemies) {
            if (e.isVisible()) {
                g.drawImage(e.getImg(), e.getX(), e.getY(), this);
            }
            if (e.getIsDead()) {
            	e.die();
            }
        }
    }
     
    public void drawPlayer(Graphics g) {
        if (player.isVisible()) {           
            g.drawImage(player.getImg(), player.getX(), player.getY(), this);
        }

        if (player.getIsDead()) {
            player.die();
            game_active = false;
        }
    }
    
    
    @Override
    //draw the ground, aliens, player,shot, and bombs.
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
 
        //board & ground
        g.setColor(Color.black);
        g.fillRect(0, 0, board.width, board.height);
        g.setColor(Color.white);
    	g.drawLine(0, GROUND, BOARD_WIDTH, GROUND);
        
    	//players & enemy        
    	if(game_active) {
        	drawEnemys(g);
        	drawPlayer(g);
        }
    }



}