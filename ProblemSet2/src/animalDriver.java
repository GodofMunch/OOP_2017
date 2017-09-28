import javax.swing.*;
import java.awt.*;

/**
 * Created by t00139303 on 28/09/2017.
 */
public class animalDriver {
    public static void main(String[] args) {

        String[] continentArray = new String[7];
        String details = "";
        JTextArea myText = new JTextArea();
        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        myText.setFont(myFont);

        continentArray[0] = "EurAsia";
        continentArray[1] = "Africa";
        continentArray[2] = "South America";
        continentArray[3] = "North America";
        continentArray[4] = "Australia";
        continentArray[5] = "Arctic";
        continentArray[6] = "Antarctic";

        Animal myAnimal = new Animal();
        Animal myAnimal2 = new Animal("Lion", continentArray, 12, 650.00);

        details = myAnimal.toString();
        details += "\n\n";
        details += myAnimal2.toString();

        myText.append(details);

        JOptionPane.showMessageDialog(null, myText);

        System.exit(0);
    }
}
