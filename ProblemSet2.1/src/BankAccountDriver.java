import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class BankAccountDriver {
    public static void main(String[] args) {

        String name="";
        int accountNo=0;
        double balance = 0.0;

        name = JOptionPane.showInputDialog("Please enter your name");
        accountNo = Integer.parseInt(JOptionPane.showInputDialog("Please enter your acc/no"));
        balance = Double.parseDouble(JOptionPane.showInputDialog("What is your expected balance"));

        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 20);
        JTextArea myTextArea = new JTextArea();
        myTextArea.setFont(myFont);

        BankAccount userAccount = new BankAccount(name, accountNo, balance);

        BankAccount myEmptyBank = new BankAccount();

        myTextArea.append(userAccount.toString());

        JOptionPane.showMessageDialog(null, myTextArea);
    }


}
