package practice;

import java.awt.Color;
import java.awt.Graphics;

public class Player2 {

	
	
	


private int y=400;
public int yVelocity;

private int height=60 ;
private int width=15;




void setYVelocity(int speed){
	
	yVelocity= speed;
}
public void update(){
	
	
	y=y+yVelocity;
	
	
}
public void paint(Graphics g)
{
	


	g.setColor(Color.WHITE);

g.fillRect(565, y, width, height);

}
}

	
	
	
	
	
	
	
	
	
	
	

