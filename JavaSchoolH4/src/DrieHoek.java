import java.awt.*;
import java.applet.*;

public class DrieHoek extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        g.drawLine(200, 200, 100, 200);
        g.drawLine(200, 200, 150, 150);
        g.drawLine(150, 150, 100, 200);

    }
}