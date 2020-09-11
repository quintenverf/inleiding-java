package h02;

/*

@(#)Show.java 1.0 03/02/26

*

Voorbeeld 2.1

*

*/

//importeer de benodigde klassen uit de Java bibliotheek
import java.awt.*;
import java.applet.*;

//een klasse met de naam Show van het type Applet
public class H021 extends Applet {

    //een (lege) methode die de Applet initialiseert
    public void init() {
        setBackground(new color (255,237,220));

    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.setColor(new color1(199,180,32));
        g.drawString("quinten verf, jawel dat ben ik", 50, 60);
    }

    public static class color1 extends Color {
        public color1(int i, int i1, int i2) {
            super(199,180,32);
        }
    }

    public static class color extends Color {
        public color(int i, int i1, int i2) {
            super(32,129,199);
        }
    }
}