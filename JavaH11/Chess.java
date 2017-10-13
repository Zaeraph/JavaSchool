package JavaH11;

import java.applet.Applet;
import java.awt.*;

/**
 * Created by Damien on 05/09/2017.
 */
public class Chess extends Applet {
    public void init() {setBackground(Color.DARK_GRAY);
    }

    public void paint(Graphics g) {
        int x;
        int y = 50;

        for(int rij= 0; rij < 4; rij++) {
                x = 50;
                y += 30;
            for (int kolom = 0; kolom < 8; kolom++) {


                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 30, 30);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 30, 30);
                }
                x += 30;
            }
            x = 50;
            y += 30;
            for (int kolom = 0; kolom < 8; kolom++) {
                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.white);
                    g.fillRect(x, y, 30, 30);
                } else {
                    g.setColor(Color.black);
                    g.fillRect(x, y, 30, 30);
                }
                x += 30;
            }
        }

    }
}
