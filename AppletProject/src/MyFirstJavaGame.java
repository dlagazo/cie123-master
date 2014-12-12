import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class MyFirstJavaGame extends Applet {
	public void paint (Graphics g)
	   {
			int width = getWidth();
			int height = getHeight();
			
			System.out.println("The screen width is: " + width);
			System.out.println("The screen height is: " + height);
	   }
}
