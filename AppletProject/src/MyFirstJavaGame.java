import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/***
 * 
 * @author Daniel Lagazo
 * @version 0.1
 * @since December 12, 2014
 * This will be our project for CIE 123. We will build a game incrementally.
 * We will add characters and artificial intelligence. By the end of the course,
 * you will have developed a full-blown, fully-documented game.
 */


public class MyFirstJavaGame extends Applet {
	
	
	public void paint (Graphics g)
	   {
		
			int width = getWidth();
			int height = getHeight();
			
			System.out.println("The screen width is: " + width);
			System.out.println("The screen height is: " + height);
	   }
}
