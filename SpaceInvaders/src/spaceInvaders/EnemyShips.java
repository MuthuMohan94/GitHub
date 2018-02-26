package space_Invaders;

import javax.swing.ImageIcon;

public class EnemyShips extends Model implements CommonInterface{

	String alienIconLocation= "space_invader_alien_icon.png";
	// Constructor
	EnemyShips(int x, int y)
	{
		InitEnemyShips(x,y);
	}
	
	void InitEnemyShips(int x,int y)
	{
		this.x = x;
        this.y = y;
        //bomb = new Bomb(x, y);
        ImageIcon Enemy_icon = new ImageIcon(alienIconLocation);
        setIcon(Enemy_icon.getImage());

	}
	
	// fire enemyshot 
	//EnemyShot fireEnemyShot()
	
}
