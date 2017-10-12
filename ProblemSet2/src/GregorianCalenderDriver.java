import javax.swing.*;
import java.util.*;

public class GregorianCalenderDriver {
    public static void main(String[] args) {

        int daysBetween=12, bMonths, bYears, bDate, aMonths, aYears, aDate, j=0;
        int[] slashes = new int[2];
        String borrowDate, dueDate, text = "";

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

        GregorianCalendar myCal = new GregorianCalendar(bDate, bMonths, bYears);

        dueDate = JOptionPane.showInputDialog("Please enter the due date of the book in the for of dd/mm/yyyy");

        j=0;

        for(int i=0;i<borrowDate.length();i++)
        {
            if(borrowDate.charAt(i)=='/')
            {

                slashes[j] = i;
                j++;
            }
        }

        aDate = Integer.parseInt(dueDate.substring(0,2));
        aMonths = Integer.parseInt(dueDate.substring((slashes[0] + 1), slashes[1]));
        aYears = Integer.parseInt(dueDate.substring((slashes[1]+1),dueDate.length()));

        GregorianCalendar myCal2 = new GregorianCalendar(aDate, aMonths, aYears);

        if(myCal.get(Calendar.YEAR) > myCal2.get(Calendar.YEAR))
        {
            text += "This book is late goddamit";
        }

        else
        {
            daysBetween = myCal2.get(Calendar.DAY_OF_YEAR) - myCal.get(Calendar.DAY_OF_YEAR);

            if(daysBetween >=14)
                text += "This book is late goddamit";

            else
                text += "Goddamit you read that quick";
        }

        JOptionPane.showMessageDialog(null, text);

        System.exit(0);

    }
}