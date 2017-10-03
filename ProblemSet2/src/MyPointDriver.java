import javax.swing.*;
import java.awt.*;

/**
 * Created by t00139303 on 28/09/2017.
 */
public class MyPointDriver {
    public static void main(String[] args) {

        String  user;
        int userX=0, userY=0;

        JTextArea myText = new JTextArea();
        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        myText.setFont(myFont);
        MyPoint p1 = new MyPoint(userX,userY);
        MyPoint p2 = new MyPoint();
        boolean valid = true;

        user = JOptionPane.showInputDialog("Please enter up if you would like to move vertically, " +
        "left if you would like to move horizontally, or both if you would like to do both");

        if(user.equals("up")) {
            userX = Integer.parseInt(JOptionPane.showInputDialog("Please enter how much you would like to move horizontally"));

            p1.moveHorizontally(userX);

            myText.append(p1.toString());

        }

        else if(user.equals("left")) {
            userY = Integer.parseInt(JOptionPane.showInputDialog("Please enter how much you would like to move vertically"));

            p1.moveVertically(userY);

            myText.append(p1.toString());
        }

        else if(user.equals("both")) {

            userX = Integer.parseInt(JOptionPane.showInputDialog("Please enter how much you would like to move horizontally"));
            userY = Integer.parseInt(JOptionPane.showInputDialog("Please enter how much you would like to move vertically"));

            p2.translate(userX,userY);

            myText.append(p2.toString());
        }



        else {
            JOptionPane.showMessageDialog(null, "You entered nothing");
            valid = false;
        }

        if(valid)
        JOptionPane.showMessageDialog(null, myText);

        System.exit(0);

    }
}
