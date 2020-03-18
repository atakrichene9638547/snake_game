package snake;

import java.awt.*;
import javax.swing.JFrame;




public class fenestra extends JFrame   {
	
	private int height =600;
	private int width =600;
		public  int getHeight() {
			return height ; 
		}
		public int getWidth() {
			return width ;
		}
		
		public void khsertYaBhim(serpent snake) {
			if (snake.gameOver()) {
				System.exit(-1);
			}
		}
	fenestra() {
		setBounds(250,250,height,width) ;
		setTitle("Snake");
		setVisible(true);
		double x = Math.random()*600;
		double y = Math.random()*600; 
		serpent snake = new serpent((int)x,(int)y,20) ; 
		//snake.update() ;
		/*int col = (height/ snake.getCoef());
		int row = (width/ snake.getCoef()) ;*/
		//khsertYaBhim(snake) ;

		
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	}

}
