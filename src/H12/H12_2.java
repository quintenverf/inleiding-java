package H12;

import java.applet.Applet;
import java.awt.*;

public class H12_2 extends Applet {
    Button buttons;
    Button[] amount;

    public void init() {
        buttons = new Button();
        buttons.setLabel("sii");
        amount = new Button[25];
        add(buttons);
        for (int teller = 0; teller < amount.length; teller++) {
            amount[teller] = new Button();
        }
        for (int teller = 0; teller < amount.length; teller++) {
            add(amount[teller]);
        }
    }

    public void paint(Graphics g) {

    }
}
