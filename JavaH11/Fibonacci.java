package JavaH11;

import java.applet.Applet;
import java.awt.*;


/**
 * Created by Damien on 05/09/2017.
 */
public class Fibonacci extends Applet{

    public void init() {}

    public void paint(Graphics g) {
        int n=0, a=1, b, fn, e=0;
        int x = 20;
        int y = 0;

        for(fn=0; fn < 20; ++fn){
            y += 15;
            b=n+a;
            n=a;
            a=b;
            g.drawString("" + b, x, y );
        }


        }
    }

