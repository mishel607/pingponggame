package practice;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Pong extends JFrame{
	JFrame window =new JFrame();
	JLabel lib =new JLabel();
	
	
public	Pong (){
		
		
	window.setTitle("ping pong game");
	window.setSize(600,600);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	window.add( new GamePanel());
	window.setVisible(true);

		
		
	}
	
	

	public static void main(String[] args) {
		
		
		Pong pong =new Pong();
		
	}

}
