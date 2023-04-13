import javax.swing.JOptionPane;
public class Slajd45 {
    public static void main(String[] args){
        String pytanie="Czy zapisać zmiany na dysku?";
        String tytul="Zapisywanie dokumentu ";
        String komunikat="";
        int odpowiedz=JOptionPane.showConfirmDialog(null, pytanie, tytul,
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        switch (odpowiedz){
            case JOptionPane.YES_OPTION: komunikat="TAK";break;
            case JOptionPane.NO_OPTION: komunikat="NIE";break;
            default: komunikat="???"; break;
        }
        System.out.println("Odpowiedź: "+komunikat);
    }
}
