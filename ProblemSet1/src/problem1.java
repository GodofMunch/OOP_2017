/**
 * Created by t00139303 on 19/09/2017.
 */
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;
public class problem1 {
    public static void main(String[] args) {

        float userAsFloat=1, conversionRate=0, result;

        conversionRate = Float.parseFloat(JOptionPane.showInputDialog("Please enter in GBP how much the euro is worth today"));

        while(userAsFloat!=0.00f)
        {
            userAsFloat = Float.parseFloat(JOptionPane.showInputDialog("Please enter how many pounds you would like to convert"));

            result = userAsFloat * conversionRate;

            if(userAsFloat!=0f)
            JOptionPane.showMessageDialog(null, String.format("%.2f", userAsFloat) + "€ is equal to " +
            String.format("%.2f", result) + "£", "Dave's Converter", JOptionPane.INFORMATION_MESSAGE);

            else
                JOptionPane.showMessageDialog(null, "Thank you!", "Dave's Converter",
                        JOptionPane.INFORMATION_MESSAGE);
        }

    }
}
