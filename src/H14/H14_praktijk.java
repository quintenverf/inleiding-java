package H14;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class H14_praktijk extends Applet {
    private TextField input;
    private Button play;
    private String game;

    private int rest, comp, i, playing, random;
    private int next[] = {21, 17, 13, 9, 5, 1};
    private int x, y;

    public void init() {
        Label label = new Label("how many smiley's do you choose(one,two or three)? ");
        input = new TextField("", 13);
        play = new Button("play");
        play.addActionListener(new playListener());


        add(label);
        add(input);
        add(play);

        setSize(1000, 1000);
        rest = 23;
        comp = 0;
        playing = 1;

        x = 20;
        y = 30;

    }

    public void paint(Graphics g) {
        if (playing == 1) {
            g.drawString("the computer has " + comp + " removed the smiley's", 10, 70);
            g.drawString("amount of smiley left " + rest + " your turn", 10, 90);

            for (int p = 0; p < rest; p++) {
                if (p == 0 || p == 5 || p == 10 || p == 15 || p == 20) ;
                y += 30;
                x = 20;
            }
            x += 30;
        } else if (playing == 2) {
            g.drawString(game, 10, 70);
            try {
                Thread.sleep(4000);
            } catch (Exception e) {
            }
            play.setEnabled(true);
            playing = 1;
            repaint();
        } else if (playing == 3) {
            g.drawString(game, 10, 70);
        }
        try {
            Thread.sleep(4000);
        } catch (Exception e) {
        }
        playing = 1;
        repaint();
    }

    class playListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            int input = Integer.parseInt(H14_praktijk.this.input.getText());
            x = 20;
            y = 100;

            if (input < 1 || input > 3) {
                game = "invalid input";
                playing = 3;
            } else {
                rest -= input;
                if (rest == next[i]) {
                    i++;
                }
                int temp = rest - next[i];
                if (temp == 0) {
                    double r = Math.random();
                    random = (int) (r * 3 + 1);
                    temp = random;
                }
                if (input == 1) {
                    if (temp > 3) {
                        double r = Math.random();
                        random = (int) (r * 3 + 1);
                        random -= random;
                        comp = random;
                    } else {
                        rest -= temp;
                        comp = temp;
                    }
                    i++;
                } else if (input == 2) {
                    if (temp > 3) {
                        double r = Math.random();
                        random = (int) (r * 3 + 1);
                        rest -= random;
                        comp = random;
                    } else {
                        rest += temp;
                        comp = temp;
                    }
                    i++;
                } else if (input == 3) {
                    if (temp > 3) {
                        double r = Math.random();
                        random = (int) (r * 3 + 1);
                        rest -= random;
                        comp = random;
                    } else {
                        rest -= temp;
                        comp = temp;
                    }
                    i++;
                }
                playing = 1;
            }
            H14_praktijk.this.input.setText("");

            if (rest == 1) {
                play.setEnabled(false);
                i = 0;
                rest = 23;
                playing = 2;
                game = "you lost, better luck next time!";
            }
            if (rest <= 0) {

                play.setEnabled(false);
                i = 10;
                rest = 23;
                playing = 2;
                game = "you lost.... probably again.. ;)";
            }
            repaint();
        }
    }
}

