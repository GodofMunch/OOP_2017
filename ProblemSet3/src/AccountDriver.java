import javax.swing.*;

/**
 * Created by t00139303 on 26/10/2017.
 */
public class AccountDriver {

    public static void main(String args[]) {
        SavingsAccount myAccTest = new SavingsAccount();

        System.out.print(myAccTest.toString());


        String name = JOptionPane.showInputDialog("Please enter your name");
        int accNum = Integer.parseInt(JOptionPane.showInputDialog("Please enter you Account Number"));

        String choice = JOptionPane.showInputDialog("Welcome " + name + ". " +
                "\n\nPress 'B' to display balance\nPress 'L' to lodge money to your account " + accNum +
                "\nPress 'W' to withdraw money from your account " + accNum +
                "\n\nPress 'Q' to quit\n\n");

        boolean exit = false;

        if(Character.toUpperCase(choice.charAt(0))=='Q')
            exit = true;

        double balance = 0;

        SavingsAccount myAcc = new SavingsAccount(name, accNum, balance);

        myAcc.setBalance(balance);
        while (!exit) {
            myAcc.setBalance(balance);

            choice = choice.toUpperCase();

            char ch = choice.charAt(0);

            switch (ch) {
                case 'B': {
                    JOptionPane.showMessageDialog(null, "Your balance is " +
                            String.format("€ %.2f ",balance), "Bank Account", JOptionPane.INFORMATION_MESSAGE);

                    break;
                }
                case 'L': {
                    double lodge = Double.parseDouble(JOptionPane.showInputDialog("Please " +
                            "enter how much you wish to lodge"));

                    balance += lodge;

                    JOptionPane.showMessageDialog(null, "Thank you!");

                    break;
                }
                case 'W': {
                    double withdraw = Double.parseDouble(JOptionPane.showInputDialog("Please " +
                            "enter how much you wish to withdraw"));

                    if(withdraw > balance) {
                        JOptionPane.showMessageDialog(null,
                                "Sorry! You have insufficient funds");

                        JOptionPane.showMessageDialog(null, "Thank you!");
                    }

                    else
                        balance -= withdraw;

                    break;
                }

                case 'Q': {
                    exit = true;

                    break;
                }

                default: {
                    JOptionPane.showMessageDialog(null,
                            "Invalid Choice!, Please choose again", "Savings Account",
                            JOptionPane.ERROR_MESSAGE);

                    break;
                }
            }

            choice = JOptionPane.showInputDialog("\n\nPress 'B' to display balance\n" +
                    "Press 'L' to lodge money to your account " + accNum +
                    "\nPress 'W' to withdraw money from your account " + accNum +
                    "\n\nPress 'Q' to quit\n\n");
        }

        JOptionPane.showMessageDialog(null, "GoodBye, Thank you for using the System",
                "Savings Account", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
