/**
 * Created by t00139303 on 26/09/2017.
 */
import javax.swing.JOptionPane;
public class problem7 {
    public static void main(String[] args) {

        String userNumber="";
        int userNumberAsInteger=0;

        while(!userNumber.equals("-1"))
        {
            userNumber = JOptionPane.showInputDialog("Please enter a value in which you would like to determine is even or not! " +
                    "( -1 to exit)");

            if(isValidInteger(userNumber))
            {
                userNumberAsInteger = Integer.parseInt(userNumber);

                if(isEven(userNumberAsInteger))
                    JOptionPane.showMessageDialog(null, "The number you entered is even!",
                            "isEven() Calculator", JOptionPane.INFORMATION_MESSAGE);

                else
                    JOptionPane.showMessageDialog(null, "The number you entered is not even!",
                            "isEven() Calculator", JOptionPane.INFORMATION_MESSAGE);
            }

        }

        JOptionPane.showMessageDialog(null, "Thanks for using the system", "isEven() Calculator",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static boolean isValidInteger(String a){

        int i=0;
        boolean valid=false;

        for(i=0;i<a.length();i++)
            if(!Character.isDigit(a.charAt(i)))
                break;

        if(i==a.length())
            valid=true;

        return valid;
    }

    public static boolean isEven(int a) {
        boolean valid=false;

        if(a%2==0)
            valid=true;

        return valid;
    }
}
