import java.applet.Applet;
import java.awt.Graphics;

public class FirstApplet extends Applet{
	
	public void paint(Graphics g) {
		g.drawString("Welcome", 150, 150);
	}
	
}
/* 
<applet code="FirstApplet.class" width="300" height="300"> 
</applet> 
*/ 
