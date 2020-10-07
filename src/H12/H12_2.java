package H12;

import java.applet.Applet;
import java.awt.*;

public class H12_2 extends Applet {
    Button buttons;
    double [] amount;

    public void init() {
        buttons = new Button();
        buttons.setLabel("sii");
        add(buttons);
        for (int teller = 0; teller < amount.length; teller++) {
            amount[teller] = 1 * teller + 1;
        }
    }

    public void paint(Graphics g) {
        for (int teller = 0; teller < amount.length; teller++) {
            g.drawString("" + buttons, 50,20 * teller + 20);
        }
    }
}
