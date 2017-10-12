/**
 * Created by t00139303 on 12/10/2017.
 */

import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class VendingMachineDriver {
    public static void main(String args[])
    {
        int cans=0, tokens=0, desiredCans;
        String adminPassword = "password", passwordGuess="", adminName = "Dave", baMhaithLeat;

        JOptionPane.showMessageDialog(null, "Machine is empty. Please contact admin");
        passwordGuess = JOptionPane.showInputDialog("Please enter admin password??");

        if(passwordGuess.equals(adminPassword))
        {
            JOptionPane.showMessageDialog(null, "Welcome " + adminName +
                    " Please enter the cans into the machine");

            cans = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of cans you entered:"));

            VendingMachine myMachine = new VendingMachine(cans, 0);

            while(cans!=0)
            {
                JOptionPane.showMessageDialog(null, "Press enter to use machine");

                baMhaithLeat = JOptionPane.showInputDialog("Would you like a can? (y/n)");

                if(baMhaithLeat.equals("y"))
                {
                    desiredCans = Integer.parseInt(JOptionPane.showInputDialog("How many cans would you like?"));

                    if(desiredCans>cans)
                    {
                        myMachine.setCans(cans - desiredCans);
                        myMachine.setTokens(tokens + desiredCans);
                    }
                    else
                        JOptionPane.showMessageDialog(null,
                                "Sorry! we don't have that many cans!");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "GoodBye!");
                }

                JOptionPane.showMessageDialog(null, myMachine.toString());
            }
        }
        else
            JOptionPane.showMessageDialog(null, "Invalid Password!, GoodBye");

    System.exit(0);

    }
}
