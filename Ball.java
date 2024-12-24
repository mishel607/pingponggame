package practice;

import java.awt.Color;
import java.awt.Graphics;

public class Ball {
private int x=300;
private int y=300;


private int xVelocity=5;
private int yVelocity=2;


public void update(){

x=x+xVelocity;
y=y+yVelocity;

 if (x>=600 || x<=0)
	xVelocity=1;
else if (y>=0 || y>=600)
	yVelocity=1;

	;

}
public void paint(Graphics g){
	
	
	g.setColor(Color.RED);
	g.fillOval(x,y,20,20);
	
}
}
