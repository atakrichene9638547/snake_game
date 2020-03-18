package snake;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class serpent extends JPanel implements KeyListener  {
	
	private int x = 100;
	private int y=100;
	private  int cote =20;
	private final int coef =10; 
	private  int vitesseX=1 ; 
	private int vitesseY= 0 ;
	
	public int getCoef(){
		return coef; 
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x= x;
	}
	public int getY() {
		return y ; 
	}
	public void setY( int y) {
		this.y = y ;
	}

	public void draw(Graphics g) {
		
		Graphics graph2 = (Graphics2D) g ;
		graph2.fillRect(x, y, cote, cote);
	}
	
	 serpent (int x , int y , int cote) {
		 this.x= x;
		 this.y=y;
		 this.cote = cote;
	  }
	 
	 private void move() {  //3_change direction
		 this.x = this.x + this.vitesseX; 
		 this.y = this.y + this.vitesseY;
	 }	
	 
	 private void dir(int x, int y) { //2_change vitesse
		 this.vitesseX +=x*coef;
		 this.vitesseY +=y*coef;
	 }
	 
	 public void update() { //4_à mettre dans fenestra
		 while(true)
		 {
			 this.move() ;
		 }	 
	 }
	@Override
	public void keyPressed(KeyEvent e) { // 1_donne instruction
		// TODO Auto-generated method stub
		int keyCode = e.getKeyCode() ;
		switch(keyCode) {
		case KeyEvent.VK_Z :
			  this.dir(0,-1) ;
			  break ;
		case KeyEvent.VK_S :
			  this.dir(0, 1);
			  break;
		case KeyEvent.VK_D :
			this.dir(1, 0);
			break ; 
		case KeyEvent.VK_Q :
			this.dir(-1, 0);
			break;
		default : 
			
		}
		
	}
	
	//public apple pomme = new apple();
	public void eatApple(apple pomme) {
		double dist =Math.sqrt(Math.pow(this.x-pomme.getX(),2)+
				Math.pow(this.y-pomme.getY(),2));
		
		if (dist <3) {
			double x = Math.random()*600;
			double y = Math.random()*600; 
			pomme.setX((int)x);
			pomme.setY((int)y);
		}
		
	}
	
	public boolean gameOver() {
		if(this.x== 600 || this.y==600) {
		return true ; 
		}
		else return false ;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}

