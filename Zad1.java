import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Zad1 {
    private static void zrobOkno() {
        JFrame okno = new JFrame("Aplikacja");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel jPanel = new JPanel();
        JButton jButton = new JButton("Wybierz kolor");
        jPanel.add(jButton);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c;
                c = JColorChooser.showDialog(null,"",Color.PINK);
                jPanel.setBackground(c);
            }
        });
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
