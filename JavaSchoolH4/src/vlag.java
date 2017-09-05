import java.awt.*;
import java.applet.*;

public class vlag extends Applet {

    public void init() {

    }
    public void paint(Graphics g){
        g.setColor(Color.red);
        g.fillRect(30, 20, 100, 20);
        g.setColor(Color.white);
        g.fillRect(30, 40, 100, 20);
        g.setColor(Color.BLUE);
        g.fillRect(30, 60, 100, 20);
        g.setColor(Color.black);
        g.drawRect(30, 20, 100, 60);

        g.setColor(Color.orange);
        g.drawLine(30, 20, 30, 200);
    }
}
