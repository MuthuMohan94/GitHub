package spaceInvaders;

import javax.swing.JFrame;

public class SpaceInvaders extends JFrame implements CommonInterface {
	
	SpaceInvaders() {
		initializeUI();
	}
	
	public void initializeUI() {
		add(new GameEnvironment());
		setTitle("Space Invaders");
		setSize(500,500);
		setResizable(false);
	}

	public static void main(String[] args) {
		SpaceInvaders game = new SpaceInvaders();
		game.setVisible(true);
		game.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
