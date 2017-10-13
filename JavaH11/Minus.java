package JavaH11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Damien on 05/09/2017.
 */
public class Minus extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int y = 30;

        for(teller = 20; teller >= 10; teller--){
            y += 20;
            g.drawString("" + teller, 50, y);
        }
    }

}