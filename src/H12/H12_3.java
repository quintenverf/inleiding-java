package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_3 extends Applet {

    TextField textvak1;
    TextField textvak2;
    TextField textvak3;
    TextField textvak4;
    TextField textvak5;
    double input1;
    double input2;
    double input3;
    double input4;
    double input5;
    double output1;
    double output2;
    double output3;
    double output4;
    double output5;


    public void init() {
        textvak1 = new TextField("", 10);
        add(textvak1);

        textvak2= new TextField("", 10);
        add(textvak2);

        textvak3 = new TextField("", 10);
        add(textvak3);

        textvak4 = new TextField("", 10);
        add(textvak4);

        textvak5 = new TextField("", 10);
        add(textvak5);

        textvak1.addActionListener( new textvaklistener());
        textvak2.addActionListener( new textvaklistener());
        textvak3.addActionListener( new textvaklistener());
        textvak4.addActionListener( new textvaklistener());
        textvak5.addActionListener( new textvaklistener());
    }
    public void paint(Graphics g) {
        textvak1.setLocation(102, 10);
        textvak2.setLocation(102,30);
        textvak3.setLocation(102, 50);
        textvak4.setLocation(102,70);
        textvak5.setLocation(102,90);

        input1 = 0.0;
        input2 = 0.0;
        input3 = 0.0;
        input4 = 0.0;
        input5 = 0.0;
    }
    class textvaklistener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            input1 = Double.parseDouble(textvak1.getText());
            input2 = Double.parseDouble(textvak2.getText());
            input3 = Double.parseDouble(textvak3.getText());
            input4 = Double.parseDouble(textvak4.getText());
            input5 = Double.parseDouble(textvak5.getText());
            output1 = input1;
            output2 = input2;
            output3 = input3;
            output4 = input4;
            output5 = input5;
            textvak1.setText( "" + output1);
            textvak2.setText("" +  output2);
            textvak3.setText("" + output3);
            textvak4.setText("" + output4);
            textvak5.setText("" + output5);
        }
    }
}
// TODO ik ben er net achter gekomen hoe ik dit in een loop moet zetten maar dit werkt ook.... kinda
// TODO heb het geprobeert met arrays.sort maar weet de volgorde niet precies