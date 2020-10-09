package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H12_6 extends Applet {
    double inputdouble;
    boolean typed = true;
    boolean found;
    int index = 0;
    int totalfound = 0;
    String string = "";
    TextField tekstvak = new TextField("", 10);
    Button button = new Button("OK");
    double[] numbers = { 31, 31, 31, 31, 41 , 41, 41 , 59, 59, 59, 26, 26,53, 53, 53, 53, 59};

    public void init() {
        add(tekstvak);
        add(button);
        button.addActionListener(new knopListener() );
    }
    public void paint(Graphics g) {
        if (typed == true){return;}
        found = false;
        int teller = 0;
        while (teller < numbers.length){
            if (numbers[teller] == inputdouble) {
                found = true;
                totalfound +=1;
                index = teller;
                break;
            }
            teller++;
            System.out.println(teller);
        }
        if (found == true){
            g.drawString("your worth "+ inputdouble + " is " + totalfound + " times found", 20,50);
            totalfound = 0;
        }
        else {
            g.drawString("your worth is not found. ", 40,50);
        }
    }
    class knopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            typed = false;
            string = tekstvak.getText();
            inputdouble = Double.parseDouble(string);
            repaint();
        }
    }
}
