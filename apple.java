package snake;
import java.awt.*;
public class apple {
	private int x,y,cote ; 
	public apple() {
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x ;
	}
	public int getY() {
		return y;
	}
	public void  setY(int y) {
		this.y = y ; 
	}
	public int getCote() {
		return cote;
	}
	
	
 public void draw(Graphics g ) {
	 g.setColor(Color.red);
	 g.fillRect(x, y, cote, cote);
 }
}
