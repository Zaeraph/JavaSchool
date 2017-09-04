import java.awt.*;
import java.applet.*;

public class NaamRWB extends Applet {

    public void init() {

    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Damien", 50, 60 );
        g.setColor(Color.red);
        g.drawString("Out", 50, 70 );
    }
}