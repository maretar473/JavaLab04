import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zad2 extends JPanel {

    public Zad2(){
        setBackground(Color.WHITE);
        setForeground(Color.CYAN);
    }

    private static void zrobOkno() {
        JFrame okno = new JFrame("Aplikacja");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setContentPane(new kolo());
        okno.setBounds(800, 150, 460, 350);
        okno.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                zrobOkno();
            }
        });
    }
}

class kolo extends JPanel {

    private final int SRED = 24;

    protected void paintComponent(Graphics g) {
        for (int x = 0; x < (getSize().width - SRED); x += SRED) {
            for (int y = 0; y < (getSize().height - SRED); y += SRED) {
                int cz = (int) (Math.random() * 256);
                int zn = (int) (Math.random() * 256);
                int nb = (int) (Math.random() * 256);
                g.setColor(new Color(cz, zn, nb));
                g.fillOval(x, y, SRED, SRED);
            }
        }
    }
}