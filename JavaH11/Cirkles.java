package JavaH11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Damien on 05/09/2017.
 */
public class Cirkles extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int a = 300;
        int b = 400;
        int c = 10;
        int d = 10;

        for(teller = 1; teller <=50; teller++){
            a -= 5;
            b -= 5;
            c += 10;
            d += 10;
            g.drawOval(a, b, c ,d);
        }

    }
}


