/*Write an applet program which accepts number of ovals user wants to display using 
  parameter tag and draws ovals in different positions*/

import java.awt.*;
import java.applet.*;

/*<applet code="Solution_12.class" height="800" width="1860"> 
	<param name="numOvals" value="10">
  </applet>*/

public class Solution_12 extends Applet {
    private int numOvals;

    public void init() {
        String numOvalsStr = getParameter("numOvals");
        numOvals = Integer.parseInt(numOvalsStr);
    }

    public void paint(Graphics g) {
        for (int i = 0; i < numOvals; i++) {
            int x = (int)(Math.random() * 300);
            int y = (int)(Math.random() * 300);
            int w = (int)(Math.random() * 100);
            int h = (int)(Math.random() * 100);
            g.drawOval(x, y, w, h);
        }
    }
}
