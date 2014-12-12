import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/***
 * 
 * @author Daniel Lagazo
 * @version 0.1
 * @since December 12, 2014
 * This will be our project for CIE 123. We will build a game incrementally.
 * We will add characters and artificial intelligence. By the end of the course,
 * you will have developed a full-blown, fully-documented game.
 */


public class MyFirstJavaGame extends Applet implements MouseListener  {
	
	public void init()
	{
		addMouseListener(this);
	}
	
	public void paint (Graphics g)
	   {
		
			int width = getWidth();
			int height = getHeight();
			
			
			System.out.println("The screen width is: " + width);
			System.out.println("The screen height is: " + height);
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, 800, 500);
			
			g.setColor(Color.YELLOW);
			g.fillRect(0, 0, 800/12, 500/8);
			
			g.setColor(Color.YELLOW);
			g.fillRect(800-(800/12), 0, 800/12, 500/8);
			
			g.setColor(Color.YELLOW);
			g.fillRect(0, 500-(500/8), 800/12, 500/8);
			
			g.setColor(Color.YELLOW);
			g.fillRect(800-(800/12), 500-(500/8), 800/12, 500/8);
	   }

	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("X coordinate: " + e.getX());
		System.out.println("Y coordinate: " + e.getY());
		if((e.getX() >= 0) && (e.getY()>=0)  && (e.getX() <= (800/12)) && (e.getY() <= (500/8)))
			System.out.println("Yellow box top left corner is clicked");
		else if((e.getX() >= (800/12*11)) && (e.getY()>=0)  && (e.getX() <= 800) && (e.getY() <= (500/8)))
			System.out.println("Yellow box top right corner is clicked");
		else if((e.getX() >= 0) && (e.getY()>=(500/8*7))  && (e.getX() <= (800/12)) && (e.getY() <= 500))
			System.out.println("Yellow box bottom left corner is clicked");
		else if((e.getX() >= (800/12*11)) && (e.getY()>=(500/8*7))  && (e.getX() <= 800) && (e.getY() <= (500/8)))
			System.out.println("Yellow box bottom right corner is clicked");
	}

	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
