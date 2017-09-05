import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet{
    public void inint(){
    }
    public void paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(80, 40, 50, 110);
        g.setColor(Color.red);
        g.fillArc(92, 50, 25, 25, 90, 360);
        g.setColor(Color.orange);
        g.fillArc(92, 85, 25, 25, 90, 360);
        g.setColor(Color.green);
        g.fillArc(92, 120, 25, 25, 90, 360);
    }
    }