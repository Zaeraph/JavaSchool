package JavaH11;

/**
 * Created by Damien on 05/09/2017.
 */
import java.awt.*;
import java.applet.*;


public class Vertical extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 1;
        int x = 0;

        while(teller <= 10) {
            x += 20;
            g.drawLine(x , 50, x, 300 );
            g.drawString("" + teller, x, 45 );
            teller++;
        }
    }
}