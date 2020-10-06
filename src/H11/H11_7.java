package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_7 extends Applet {
    int teller = 0;
    int y = 200;
    int x = 200;
    int width = 10;
    int height = 10;

    public void init() {

    }
    public void paint(Graphics g) {
        while (teller<50){
            g.drawOval(x, y, width, height);
            y -= 10;
            x -= 10;
            width += 20;
            height += 20;
            teller++;
        }
    }
}
