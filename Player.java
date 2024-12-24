package practice;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

private int y=300;
public int yVelocity;

private int height=60 ;
private int width=15;




void setYVelocity(int speed){
	
	yVelocity= speed;
}
public void update(){
	
	
	
	if(y>0&y<540)
		y=y+yVelocity;
		//y=Velocity
	
	
}
public void paint(Graphics g)
{
	


	g.setColor(Color.WHITE);

g.fillRect(1, y, width, height);

}
}
