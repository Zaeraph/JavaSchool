import java.awt.*;
import java.applet.*;

public class Dikzakken extends Applet {

    public void inint(){
    }

    public void paint(Graphics g){
        g.drawLine(80, 20, 80, 200);
        g.drawLine(280, 200, 80,200);
        g.setColor(Color.red);
        g.fillRect(110, 128, 40, 72);
        g.setColor(Color.BLUE);
        g.fillRect(170, 20, 40,180);
        g.setColor(Color.orange);
        g.fillRect(230, 66, 40, 134);

        g.setColor(Color.black);
        g.drawString("Valerie", 110, 215);
        g.drawString("Jeroen", 170, 215);
        g.drawString("Hans", 230, 215);

        g.drawString("100", 55, 30);
        g.drawString("80", 55, 65);
        g.drawString("60", 55, 100);
        g.drawString("40", 55, 135);
        g.drawString("20", 55, 170);
        g.drawString("0", 55, 205);

    }


}
