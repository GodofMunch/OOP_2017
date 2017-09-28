import javax.swing.*;
import java.awt.*;

public class library {
    public static void main(String[] args) {

        String userName, userISBN;
        double userPrice;
        int userPages;

        userName = JOptionPane.showInputDialog("Please enter the name of the Book");
        userISBN = JOptionPane.showInputDialog("Please enter the ISBN of the Book").toUpperCase();
        userPages = Integer.parseInt(JOptionPane.showInputDialog("Please enter how many pages in the Book"));
        userPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the book"));

        JTextArea myText = new JTextArea();
        Font myFont = new Font(Font.MONOSPACED,Font.PLAIN,12);
        myText.setFont(myFont);

        Book2 bk1 = new Book2();
        Book2 bk2 = new Book2(userName,userISBN,userPages,userPrice);
        myText.append(bk1.toString());
        myText.append("\n\n");
        myText.append(bk2.toString());

        JOptionPane.showMessageDialog(null,myText);

        System.exit(0);
    }
}
