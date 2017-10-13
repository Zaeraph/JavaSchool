package Challenge;
//Java Challenge 8
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DikzakkenV2 extends Applet{
        int V; // int V is voor Valerie.
        int J; // int J is voor Jeroen.
        int H; // int H is voor Hans.
        int height; // int height is voor Valerie.
        int height2; //int height2 is voor Jeroen.
        int height3; //int height3 is voor Hans.
        Button button;
        Label labelV;
        Label labelJ;
        Label labelH;
        TextField Text; //Text = Tekstvlak.
        TextField Text2;
        TextField Text3;

        public void init (){
            Text = new TextField(5);
            Text2 = new TextField(5);
            Text3 = new TextField( 5);
            button = new Button("toon");
            ButtonListener bl = new ButtonListener();
            button.addActionListener( bl );
            labelV = new Label("Valerie");
            labelJ = new Label("Jeroen");
            labelH = new Label("Hans");

            add(labelV);
            add(Text);
            add(labelJ);
            add(Text2);
            add(labelH);
            add(Text3);
            add(button);
        }

        public void paint(Graphics g){
            g.drawLine(80, 40, 80, 250);
            g.drawLine(280, 250, 80,250);
            g.setColor(Color.red);
            g.fillRect(110, V, 40, height);
            g.setColor(Color.BLUE);
            g.fillRect(170, J, 40,height2);
            g.setColor(Color.orange);
            g.fillRect(230, H , 40, height3);

            g.setColor(Color.black);
            g.drawString("Valerie", 110, 265);
            g.drawString("Jeroen", 170, 265);
            g.drawString("Hans", 230, 265);

            g.drawString("200", 55, 50);
            g.drawString("180", 55, 70);
            g.drawString("160", 55, 90);
            g.drawString("140", 55, 110);
            g.drawString("120", 55, 130);
            g.drawString("100", 55, 150);
            g.drawString("80", 55, 170);
            g.drawString("60", 55, 190);
            g.drawString("40", 55, 210);
            g.drawString("20", 55, 230);
            g.drawString("0", 55, 250);
        }
        class ButtonListener implements ActionListener{
            public void actionPerformed(ActionEvent e) {
                height = Integer.parseInt(Text.getText());
                height2 = Integer.parseInt(Text2.getText());
                height3 = Integer.parseInt(Text3.getText());
                V = 250 - height;
                J = 250 - height2;
                H = 250 - height3;
                repaint();
            }
        }
}
