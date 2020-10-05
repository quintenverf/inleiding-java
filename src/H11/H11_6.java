package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_6 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        int teller;
        int y = 0;
        int x = 0;

        for (teller = 0; teller < 5; teller++) {
            y += 20;
            x += 20;
            g.drawOval(50, y, y, y);
        }
    }
}
