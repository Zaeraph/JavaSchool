package JavaH11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Damien on 05/09/2017.
 */
public class Honderd extends Applet{
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int a = 60;
        int b = 60;
        int c = 10;
        int d = 10;

        for(teller = 1; teller <=100; teller++){
            c += 10;
            d += 10;
            g.drawOval(a, b, c ,d);
        }

    }
}

