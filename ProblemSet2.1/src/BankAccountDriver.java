import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextArea;

public class BankAccountDriver {
    public static void main(String[] args) {

        String name="";
        BankAccount[] accountList = new BankAccount[100];
        int accountNo=0, i=0, dialogOption;
        double balance = 0.0;
        boolean intention=true;

        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 20);
        JTextArea myTextArea = new JTextArea();
        myTextArea.setFont(myFont);

        while(intention) {
            name = JOptionPane.showInputDialog("Please enter your name");
            accountNo = Integer.parseInt(JOptionPane.showInputDialog("Please enter your acc/no"));
            balance = Double.parseDouble(JOptionPane.showInputDialog("What is your expected balance"));

            BankAccount userAccount = new BankAccount(name, accountNo, balance);

            accountList[i] = userAccount;
            i++;

            myTextArea.append(userAccount.toString() + "\n\n");

            dialogOption = JOptionPane.showConfirmDialog(null,
                    "Would you like to enter another account?",
                    "Accounts", JOptionPane.YES_NO_OPTION);

            if(dialogOption==JOptionPane.NO_OPTION)
                intention = false;
        }
        JOptionPane.showMessageDialog(null, myTextArea);

        System.exit(0);
    }


}
