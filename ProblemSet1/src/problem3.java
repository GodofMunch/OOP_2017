/**
 * Created by t00139303 on 19/09/2017.
 */
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.*;

public class problem3 {
    public static void main(String[] args) {

        float length, breadth, costPerSqM, area ,cost;
        String name;
        JTextArea myTextArea = new JTextArea(30,30);
        Font myFont = new Font(Font.MONOSPACED,Font.PLAIN,12);

        name = JOptionPane.showInputDialog("Please enter your name");
        myTextArea.append("Quotation for " + name + " :\n");
        myTextArea.setFont(myFont);
        length = Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of your room"));
        breadth = Float.parseFloat(JOptionPane.showInputDialog("Please enter the breadth of your room"));
        area = length*breadth;
        costPerSqM = Float.parseFloat(JOptionPane.showInputDialog("Please enter how much the carpet costs per square meter"));
        cost = area*costPerSqM;


        String formattedData = String.format("%-40s%.2f m.\n%-40s%.2f m.\n%-40s%.2f sq. m.\n%-40s%.2f euro\n%-40s%.2f euro",
                "Length of room", length, "Breadth of room", breadth, "Total Area of the room", area, "Cost per square metre of carpet",
                costPerSqM, "Total Cost of the carpet", cost);

        myTextArea.append(formattedData);

        JOptionPane.showMessageDialog(null, myTextArea, "Carpet Cost Calculator", JOptionPane.PLAIN_MESSAGE);
    }
}
