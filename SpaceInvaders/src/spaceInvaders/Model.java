import java.awt.Image;

//define the properties & mutators of icons like EnemyShips, Player
public class Model {
	protected int x;
	protected int y;
	protected Image img;
	protected boolean isVisible;
	protected boolean isdead;
//    protected int dx;

	public Model(){
		isVisible = true;  //set everything to visible when first initialized
	}
	
	public void setX(int x){
		this.x = x;
	}

	public int getX(){
		return x;	
	}

	public void setY(int y){
		this.y = y;
	}

	public int getY(){
		return y;
	}
	
	public void die(){
		isVisible = false;  //hide the image if the icon is dead
	}
	
	public void setIsDead(boolean isdead){
		this.isdead = isdead;
	}
	public boolean getIsDead(){
		return isdead;
	}
	
    public boolean isVisible() {    
        return isVisible;
    }
	public void setVisibility(boolean isVisible){
		this.isVisible = isVisible;
	}

	public void setImg(Image img){ 
		this.img = img;    //attach the icon to the model object
	}

	public Image getImg(){
		return img;
	}
}
