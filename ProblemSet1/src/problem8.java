
import javax.swing.JOptionPane;
public class problem8 {
    public static void main(String[] args) {
        String[] numbers = new String[10];

        for(int i=0;i<numbers.length;i++)
            numbers[i] = JOptionPane.showInputDialog("Please enter an integer");

        JOptionPane.showMessageDialog(null, "The first value of the array is " +
        numbers[0] + "\nThe fifth value of the array is " + numbers[4]);

        System.exit(0);
    }

}
