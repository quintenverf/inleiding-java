package H11;

import java.applet.Applet;
import java.awt.*;

public class H11_9 extends Applet {
    int teller = 0;
    int x = 200;
    int y = 200;
    int height = 10;
    int width = 10;

    public void init() {

    }

    public void paint(Graphics g) {
        setBackground(Color.gray);
        y = 50;
        x = 50;
        for (teller = 0; teller<8; teller++) {
            y+=10;
            x-=50;
            for (int kolom = 0; kolom < 8; kolom++) {

                if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6) {
                    g.setColor(Color.black);
                    g.fillRect(x, y, width, height);
                } else {
                    g.setColor(Color.white);
                    g.fillRect(x, y, width, height);
                }
               x += width;
            }
        }
    }
}
// TODO 11.9 ben er bijna maar weet niet hoe ik verder moet.