package JavaH11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Damien on 05/09/2017.
 */
public class TafelDrie extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller;
        int totaal = 0;
        int drie = 3;
        int y = 30;

        for(teller = 1; teller <= 10; teller++){
            y += 20;
            totaal = teller * drie;
            g.drawString(teller + " x " + drie + " = " + totaal , 50, y);
        }
    }

}