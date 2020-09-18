package H08;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H081 extends Applet {
    Button knop;
    Button refreshknop;
    TextField textvak;
    Label stickertje;


    public void init() {
        refreshknop = new Button(" refresh ");
        add(refreshknop);

        knop = new Button(" submit ");
        add(knop);

        textvak = new TextField("",30);
        add(textvak);

        stickertje = new Label("cant hide forever");
        add(stickertje);

        // aansluiter
        knop.addActionListener(new KnopListener());
        refreshknop.addActionListener(new KnopListener());

    }

    public void paint(Graphics g) {
//         setBackground(Color.black);
//         g.setColor(Color.white);

        // reset knop
         refreshknop.setLocation(30, 200);
         refreshknop.setSize(60,30);


         // okey knop
         knop.setLocation(120, 200);
         knop.setSize(60,30);


         // textvak
        textvak.setLocation(30,20);
        textvak.setSize(300,150);

        //sticker text
        stickertje.setLocation(20,230);
        stickertje.setSize(300,150);


    }

    private void clearFields(){
        stickertje.setText(".");


    }

    class KnopListener implements ActionListener{

        public void actionPerformed( ActionEvent e ){
//            String delete = textvak.getText();
//            refreshknop. setLabel(delete);

            // afblijven
            String message = textvak.getText();
            stickertje.setText(message);

            repaint();


        }
    }
}
// het lukt niet om die refresh knop te laten refreshen >:(