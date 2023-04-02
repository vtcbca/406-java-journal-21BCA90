/*Create an applet which displays a solid square having red colour. Display name of your college 
  within the square with font style =’Times New Roman’, font size=50 and font colour=’Yellow’.*/
  
import java.awt.*;
import java.applet.*;

//<applet code="Solution_11.class" height="800" width="1860"> </applet>

public class Solution_11 extends Applet {
	
    public void paint(Graphics g) {

        g.setColor(Color.red);
        g.fillRect(200,200,400,400);

        g.setColor(Color.yellow);
        Font font = new Font("Times New Roman", Font.PLAIN, 50);
        g.setFont(font);
        FontMetrics metrics = g.getFontMetrics(font);
        int x = (200 - metrics.stringWidth("My College")) / 2;
        int y = ((200 - metrics.getHeight()) / 2) + metrics.getAscent();
        g.drawString("VTCBCSR", 300+x, 300+y);
		
    }
}

