package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H082 extends Applet {

    Button men;
    Button women;
    int counter, counter2;

    public void init(){
        // count of men
        men = new Button(" men ");
        add(men);
        counter = 1;
        // count of women
        women = new Button(" women ");
        add(women);
        counter2 = 1;

        // to connect of the actionlistener
        men.addActionListener(new KnopListener());
        women.addActionListener(new knopvrouw());

    }

    public void paint(Graphics g){
        men.setSize(200,200);
        men.setLocation(30,40);
        men.setLabel("men " + counter);
        women.setSize(200,200);
        women.setLocation(240,40);
        women.setLabel("women" + counter2);

    }

    class KnopListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            System.out.print("klik " + counter);
            counter++;



            repaint();
        }
    }
    class knopvrouw implements ActionListener{

        public void actionPerformed(ActionEvent e) {



            System.out.println("klak" + counter2);
            counter2++;

            repaint();
        }
    }

}
