import javax.swing.JOptionPane;

public class LoopWithinASentinel {
    public static void main(String[] args) {

        String userOne="", userTwo="", choice="", sign="";
        float numberOne=0, numberTwo=0, total=0;
        int selectChoice=0, selectChoiceTwo=0, sentinelControl=0;

        while (sentinelControl==0) {
            choice = JOptionPane.showInputDialog("Plesae select from the following " +
                    "simple mathematical equations you would like to perform\n\nA " +
                    "for Addition\nS for Subtraction\nM for Multiplication\nD for " +
                    "Division");

            choice = choice.toLowerCase();

            sign ="";

            switch (choice) {
                case "a": {
                    userOne = JOptionPane.showInputDialog("Please enter the first number");
                    numberOne = Float.parseFloat(userOne);

                    userTwo = JOptionPane.showInputDialog("Please enter the second number");
                    numberTwo = Float.parseFloat(userTwo);

                    total = numberOne + numberTwo;
                    sign = "+";
                    break;
                }

                case "s": {
                    userOne = JOptionPane.showInputDialog("Please enter the first number");
                    numberOne = Float.parseFloat(userOne);

                    userTwo = JOptionPane.showInputDialog("Please enter the second number");
                    numberTwo = Float.parseFloat(userTwo);

                    total = numberOne - numberTwo;
                    sign = "-";
                    break;
                }
                case "m": {
                    userOne = JOptionPane.showInputDialog("Please enter the first number");
                    numberOne = Float.parseFloat(userOne);

                    userTwo = JOptionPane.showInputDialog("Please enter the second number");
                    numberTwo = Float.parseFloat(userTwo);

                    total = numberOne * numberTwo;
                    sign = "x";
                    break;
                }
                case "d": {
                    userOne = JOptionPane.showInputDialog("Please enter the first number");
                    numberOne = Float.parseFloat(userOne);

                    userTwo = JOptionPane.showInputDialog("Please enter the second number");
                    numberTwo = Float.parseFloat(userTwo);

                    total = numberOne / numberTwo;
                    sign = "/";
                    break;
                }
            }

            selectChoice = JOptionPane.showConfirmDialog(null,
                    "You would like to do the sum " + userOne + sign + userTwo +
                            "\n\nAre you happy with your choice?", "Simple Sums Ltd.",
                    JOptionPane.YES_NO_OPTION);

            if(selectChoice == JOptionPane.YES_OPTION)
            {
                JOptionPane.showMessageDialog(null,
                        "The answer to your question is " + total ,
                        "Simple Sums Ltd.", JOptionPane.INFORMATION_MESSAGE);

                selectChoiceTwo = JOptionPane.showConfirmDialog(null,
                        "Would you like to perform another sum?",
                        "Simple Sums Ltd.", JOptionPane.YES_NO_OPTION);
                if(selectChoiceTwo==JOptionPane.YES_OPTION)
                    sentinelControl=0;
                else {
                    sentinelControl++;
                    JOptionPane.showMessageDialog(null,
                            "Thanks for using this software!", "Simple Sums ltd.",
                            JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                        "Cool Bro! Thanks for giving us a try!", "Simple Sums ltd",
                        JOptionPane.INFORMATION_MESSAGE);

                sentinelControl++;
            }


        }
        System.exit(0);
    }
}

