package space_Invaders;

import java.awt.Image;

public class Model 
{
protected boolean isVisible;
protected Image icon;
protected int x;
protected int y;
protected boolean isdead;
Model()
{
	isVisible= true;
}

void die()
{
	isVisible= false;
}

void setVisibility(boolean isVisible)
{
 this.isVisible= isVisible;
}

void setIcon(Image icon)
{
	this.icon=icon;
}

Image getIcon()
{
	return icon;
}

void setXPos(int x)
{
	this.x=x;
}

int getXPos()
{
	return x;
}

void setYPos(int y)
{
	this.y=y;
}

int getYPos()
{
	return y;
}

void setIsDead(boolean isdead)
{
	this.isdead=isdead;
}

boolean getIsDead()
{
	return isdead;
}

}
