package spaceInvaders;

// Main function is inside this 
import java.awt.EventQueue;

import javax.swing.JFrame;

public class SpaceInvaders extends JFrame implements CommonInterface {
	
	public SpaceInvaders() {
		initializeUI();
	}
	
	public void initializeUI() {
		add(new GameEnvironment());
		setTitle("Space Invaders");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setLocationRelativeTo(null);
		setResizable(false); // set the window size fixed
	}

	public static void main(String[] args) {
    		SpaceInvaders game = new SpaceInvaders();
    		game.setVisible(true);

	}

}

