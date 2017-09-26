/**
 * Created by t00139303 on 21/09/2017.
 */

import javax.swing.*;
import java.awt.*;

public class problem6 {
    public static void main(String[] args) {

        double cube;
        String cubeList;
        JTextArea myTextArea = new JTextArea(20,10);
        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);
        myTextArea.setFont(myFont);
        cubeList = String.format("%-10s%-10s\n%-10s%-10s", "Number", "Cube", "------", "------");

        for(int i=1;i<=15;i++)
        {
          cube = myCubeCalculator(i);

          cubeList = String.format("\n%-10d%-10.0f", i, cube);

          myTextArea.append(cubeList);
        }

        JOptionPane.showMessageDialog(null, myTextArea, "Cube Calculator",
                JOptionPane.PLAIN_MESSAGE);
    }

    public static double myCubeCalculator(int i)
    {
        double cube = Math.pow(i,3);

        return cube;
    }
}
