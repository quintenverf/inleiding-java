package H11;


import java.applet.Applet;
import java.awt.*;

public class H11_8 extends Applet {
    int teller = 0;
    int y = 200;
    int x = 200;
    int width = 10;
    int height = 10;

    public void init() {

    }

    public void paint(Graphics g) {
        while (teller<100){
            g.drawOval(x,y,width,height);
            x -= 0;
            y -=0;
            width += 20;
            height += 20;
            teller ++;

        }
    }
}
