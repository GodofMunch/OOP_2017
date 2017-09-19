/**
 * Created by t00139303 on 19/09/2017.
 */
import javax.swing.*;

public class problem2 {
    public static void main(String[] args) {
        String list="Yards     Inches\n\n------     ------\n";
        int yards=0, inches=0;
        JTextArea myTextArea = new JTextArea(100, 100);
        myTextArea.append(list);

        for(int i=0;i<10;i++)
        {
            yards++;
            inches+=36;
            list = "\n" + yards + "     " + inches;
            myTextArea.append(list);
        }



        JOptionPane.showMessageDialog(null, myTextArea, "Yards Count" , JOptionPane.PLAIN_MESSAGE);
    }
}
