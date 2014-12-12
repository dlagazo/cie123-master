import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;


public class MyFirstJavaGame extends Applet {
	public void paint (Graphics g)
	   {
	      g.drawString ("Hello World", 50, 50);
	      g.setColor(Color.blue);
	      g.fillRect(0, 0, 50, 50);
	      //g.drawRect(0, 0, 50, 50);
	   }
}
