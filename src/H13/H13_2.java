package H13;

import java.applet.Applet;
import java.awt.*;

public class H13_2 extends Applet {

    int x = 0;
    int y = 0;
    int width = 40;
    int height = 20;

    public void init() {
        setBackground(Color.white);
        setSize(1000, 500);

    }

    public void paint(Graphics g) {
        tekenmuur(g, 10, 10);

    }

    void tekenmuur(Graphics quinten, int x1, int y1) {
        quinten.setColor(Color.red);
        for (int tellerHorizontal = 25; tellerHorizontal > 0; tellerHorizontal--) {
            for (int tellervertical = 0; tellervertical < 25; tellervertical++) {
                quinten.setColor(Color.red);
                quinten.fillRect(x, y, width, height);
                quinten.setColor(Color.black);
                quinten.drawRect(x, y, width, height);
                x += width;
            }
            y += 20;
            x = 1;
        }

//        while (teller < 25) {
//            while (teller2 < 25){
//                quinten.drawRect(x, y, width, 20);
//                teller2++;
//                x += width;
//            }
//            y += 20;
//            teller++;
//            teller2 = 0;
//            x = 0;
//        }
//        teller =0;
//        while (teller < 25) {
//            quinten.drawRect(x, y, width, 20);
//            x += 40;
//            y += 0;
//            teller++;
//        }
//        x += width;
    }
}
