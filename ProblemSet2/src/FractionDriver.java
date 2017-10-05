import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;

public class FractionDriver {
    public static void main(String args[])
    {

        int userNumOne, userDenomOne, userNomTwo, userDenomTwo;
        String fractionText="";

        userNumOne = Integer.parseInt(JOptionPane.showInputDialog("Please enter your Numerator:"));
        userDenomOne = Integer.parseInt(JOptionPane.showInputDialog("Please enter your denominator"));


        userNomTwo =Integer.parseInt(JOptionPane.showInputDialog("Please enter your second Numerator:"));
        userDenomTwo = Integer.parseInt(JOptionPane.showInputDialog("Please enter your second Denominator:"));

        Fraction nullFraction = new Fraction();

        Fraction myFirstFraction = new Fraction(userNumOne, userDenomOne);
        Fraction mySecondFraction = new Fraction(userNomTwo, userDenomTwo);

        Fraction multiplied = Fraction.multiply(myFirstFraction, mySecondFraction);
        Fraction divided = Fraction.divide(myFirstFraction, mySecondFraction);
        Fraction added = Fraction.add(myFirstFraction, mySecondFraction);
        Fraction subtracted =  Fraction.subtract(myFirstFraction, mySecondFraction);

        fractionText += "\n\nTesting the no argument Constructor...." + nullFraction.toString();
        fractionText += "\n\nTesting the first Fraction....." + myFirstFraction.toString();
        fractionText += "\n\nTesting the second Fraction....." + mySecondFraction.toString();

        fractionText += "\n\nThe value of " + myFirstFraction.toString() + " / " + mySecondFraction.toString() + " is " +
                divided.toString();

        fractionText += "\n\nThe value of " + myFirstFraction.toString() + " * " + mySecondFraction.toString() + " is " +
                multiplied.toString();

        fractionText += "\n\nThe value of " + myFirstFraction.toString() + " + " + mySecondFraction.toString() + " is " +
                added.toString();

        fractionText += "\n\nThe value of " + myFirstFraction.toString() + " - " + mySecondFraction.toString() + " is " +
                subtracted.toString();

        JTextArea myText = new JTextArea();
        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        myText.setFont(myFont);

        myText.append(fractionText);

        JOptionPane.showMessageDialog(null, myText,"Fractions boiiii", JOptionPane.PLAIN_MESSAGE);

        System.exit(0);
    }
}
