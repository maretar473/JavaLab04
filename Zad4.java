import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

public class Zad4 extends JPanel{
    final int SREDNICA=24;
    int koloX, koloY;
    public Zad4() {
        setFocusable(true);
        addKeyListener(new ObslugaKlawiatury());
    }
    class ObslugaKlawiatury implements KeyListener{
        public ObslugaKlawiatury() { }
        @Override
        public void keyTyped(KeyEvent e) { }
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
                case KeyEvent.VK_DOWN: koloY+=5;break;
                case KeyEvent.VK_UP: koloY-=5;break;
                case KeyEvent.VK_LEFT: koloX-=5;break;
                case KeyEvent.VK_RIGHT: koloX+=5;break;
            }
            repaint();//metoda odrysowuje element na powierzchni panelu
        }
        @Override
        public void keyReleased(KeyEvent e) { }
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(koloX, koloY, SREDNICA, SREDNICA);
    }

    private static void zrobOkno() {
        JFrame okno = new JFrame("Aplikacja");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //okno.setContentPane();
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