import java.awt.Color;
import javax.swing.*;

public class Slajd12 {
    private static void zrobOkno() {
        JFrame okno = new JFrame("Aplikacja");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.PINK);
        okno.setContentPane(jPanel);
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

//class PanelZawartoscA extends JPanel {
//    public PanelZawartoscA() {
//        setBackground(Color.PINK);
//    }
//}
