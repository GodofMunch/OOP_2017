import javax.swing.*;
import java.awt.*;

public class Message {
    public static void main(String[] args) {

        String message, sender, recipient, email;
        JTextArea myText = new JTextArea();
        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        myText.setFont(myFont);

        sender = JOptionPane.showInputDialog("Please enter your User Name");
        recipient = JOptionPane.showInputDialog("Hello " + sender + "! Please enter the email of the Sender");

        message = JOptionPane.showInputDialog("Please enter your message");

        Email myEmail = new Email(sender, recipient);

        email = myEmail.toString();
        email += "\n\n\n" + message;

        myText.append(email);

        JOptionPane.showMessageDialog(null, myText);

        System.exit(0);
    }
}
