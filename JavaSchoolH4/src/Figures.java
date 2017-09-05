/**
 * Created by Damien on 04/09/2017.
 */
import java.awt.*;
import java.applet.*;

public class Figures extends Applet{

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(10, 10, 50, 10);
        g.drawRect(10, 30, 80 , 50);
        g.drawRoundRect(10, 90, 80, 50, 30, 30);
        g.setColor(Color.magenta);
        g.fillRect(100, 30, 75, 35);
        g.setColor(Color.black);
        g.drawOval(100, 30, 70, 30);
        g.setColor(Color.magenta);
        g.fillOval(100, 90, 70, 30);
        g.setColor(Color.black);
        g.drawOval(190, 30, 70, 30);
        g.setColor(Color.magenta);
        g.fillArc(190, 30, 70, 30, 0, 45);
        g.setColor(Color.black);
        g.drawArc(190, 70, 50, 50, 90, 360);

    }
}