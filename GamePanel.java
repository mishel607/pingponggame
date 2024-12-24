package practice;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;

import javax.swing.Timer;
import javax.swing.JPanel;


public class GamePanel extends JPanel implements ActionListener,KeyListener {
	
	Ball ball= new Ball();
	Player player=new Player();
	Player2 player2 =new Player2();
public 	GamePanel(){
		
	
	Timer time = new Timer(50,this);
	time.start();
	this.addKeyListener(this);
	this.setFocusable(true);
	
}


public void update(){
	
	ball.update();
	player.update();
	player2.update();
	
}
		public  void paintComponent(Graphics g){
		g.setColor(Color.BLACK);
		g.fillRect(0,0,600,600);
		ball.paint(g);
		player.paint(g);
		player2.paint(g);
		
	}

		public void actionPerformed(ActionEvent e) {
			
			update();
			repaint();
		}



	
		public void keyPressed(KeyEvent e) {
			if (e.getKeyCode()==KeyEvent.VK_UP)
			player.setYVelocity(-2);
			
			if(e.getKeyCode()==KeyEvent.VK_DOWN)
			player.setYVelocity(2);
			
			 if(e.getKeyCode()==KeyEvent.VK_A)
				
				player2.setYVelocity(-2);
			if(e.getKeyCode()==KeyEvent.VK_Z)
				player2.setYVelocity(2);
				
		}



		
		public void keyReleased(KeyEvent e) {
			
		}



		
		public void keyTyped(KeyEvent e) {
			
			
		}
	
	
}
	

