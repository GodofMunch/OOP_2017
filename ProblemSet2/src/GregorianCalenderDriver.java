import java.awt.Font;
import javax.swing.JOptionPane;
import java.util.Calendar;

public class GregorianCalenderDriver {
    public static void main(String[] args) {

        int daysBetween=12, bMonths, bYears, bDate, aMonths, aYears, aDate, j=0;
        int[] slashes = new int[2];
        String borrowDate;

        borrowDate = JOptionPane.showInputDialog("Please enter the date the book was borrowed in the form dd/mm/yyyy");

        for(int i=0;i<borrowDate.length();i++)
        {
            if(borrowDate.charAt(i)=='/')
            {
                slashes[j] = i;
                j++;
            }
        }

        bDate = Integer.parseInt(borrowDate.substring(0,2));
        bMonths = Integer.parseInt(borrowDate.substring((slashes[0]+1),slashes[1]));
        bYears = Integer.parseInt(borrowDate.substring(slashes[1]+1, borrowDate.length()));

        GregorianCalender myCal = new GregorianCalender(bDate, bMonths, bYears);

        System.out.print(myCal.toString());

    }
}