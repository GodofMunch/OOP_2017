/**
 * Created by t00139303 on 21/09/2017.
 */

import javax.swing.*;
import java.awt.*;

public class problem6 {
    public static void main(String[] args) {

        int cube;
        String cubeList;
        JTextArea myTextArea = new JTextArea(20,10);
        Font myFont = new Font(Font.MONOSPACED, Font.PLAIN, 12);

        cubeList = String.format("%-10s%-10s\n%-10s%-10s", "Number", "Cube", "------", "------");

        for(int i=1;i<=15;i++)
        {
          cube = myCubeCalculator(i);

          cubeList = String.format("\n%-10d%-10d", i, cube);

          JTextArea.append(cubeList);
        }
    }

    public static int myCubeCalculator(int i)
    {
        int cube = Math.pow(i,3);

        return cube;
    }
}
