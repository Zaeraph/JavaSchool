import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wereldtijden extends Applet {

    TextField Text;
    Button button;
    Label label;
    int input, b, c, d, f;

    public void init() {

        Text = new TextField(5);
        button = new Button(" Toon wereld tijden");
        button.addActionListener(new ButtonListener());
        label = new Label("Voer een uur in");


        add(label);
        add(Text);
        add(button);
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            String invoer = Text.getText();
            input = Integer.parseInt(invoer);

            b = input - 1;
            c = input + 8;
            d = input - 9;
            f = input + 9;
            if(b >=24){
                b-=24;}
            if(c >=24){
                c-=24;}
            if(d >=24){
                d-=24;}
            if(f >=24){
                f-=24;}

            if(b <0){
                b+=24;}
            if(c <0){
                c+=24;}
            if(d <0){
                d+=24;}
            if(f <0){
                f+=24;}

            repaint();
        }
    }

    public void paint(Graphics g) {
        {
            if (input >= 0 && input <=23 ){
                g.drawString("Tijd in London : " + b + ":00 uur", 50, 60);
                g.drawString("Tijd in Tokyo : " + c + ":00 uur", 50, 70 );
                g.drawString("Tijd in LA : " + d + ":00 uur", 50, 80);
                g.drawString("Tijd in Sydney : " + f + ":00 uur", 50, 90);
            }
        }
    }
}