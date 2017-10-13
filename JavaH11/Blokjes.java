package JavaH11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Damien on 05/09/2017.
 */
public class Blokjes extends Applet {
    public void init() {}

    public void paint(Graphics g) {
        int x = 20;
        int y = 20;
        int teller;

        for (teller = 1; teller <= 5; teller++) {
            x += 20;
            y += 20;
            g.drawRect(x, y, 20, 20);
        }
    }
}

