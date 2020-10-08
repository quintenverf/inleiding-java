package H12;

import java.awt.*;
import java.applet.*;

public class H12_1 extends Applet  {
    double [] cijfers ;
    double gemiddelde;

    public void init() {
        cijfers = new double[10];
        for (int teller = 0; teller < cijfers.length ; teller++) {
                cijfers[teller] = 1 * teller + 1;
        }
    }
    public void paint(Graphics g) {
        for (int teller = 0; teller < cijfers.length; teller++) {
            g.drawString("" + cijfers[teller], 50,20 * teller + 20);
        }
        g.drawString("5,5 " + " gemiddelde", 50,220);
    }
}
// TODO hoe bereken ik het gemiddelde in code? dus doe ik het even snel uit me hoofd