package H12;

import java.applet.Applet;
import java.awt.*;

public class H12_4 extends Applet {
    boolean found;
    TextField tekstvak;
    Button knop;
    double[] numbers;
    double search;

    public void init() {
        numbers = new double[10];
        found = false;
        for (int teller = 0; teller < numbers.length ; teller++) {
            numbers[teller] = 1 * teller + 1;

            if (numbers[teller] == search){
                found = true;
            }
            teller++;
        }
        tekstvak = new TextField("", 10);
        add(tekstvak);

        knop = new Button("OK");
        add(knop);
    }
    public void paint(Graphics g) {
        for (int teller = 0; teller < numbers.length; teller++) {
            g.drawString("" + numbers[teller], 50,20 * teller + 20);

            if (found = true){
                g.drawString("gevonden. ", 20,50);
            }
            else{
                g.drawString("niet gevonden ", 20,50);
            }
        }
    }
}
