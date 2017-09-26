/**
 * Created by t00139303 on 26/09/2017.
 */

import javax.swing.JOptionPane;
public class problem9 {
    public static void main(String[] args) {

        double[] calfWeight = new double[10], floatPart = new double[10];

        for (int i = 0; i < 10;i++) {
            calfWeight[i] = randomDoublePopulator();
            floatPart[i] = randomDoublePopulator();
            floatPart[i] = floatPart[i]/100;
            calfWeight[i] = calfWeight[i] + floatPart[i];
           // System.out.print("\n" + calfWeight[i]);
        }

        JOptionPane.showMessageDialog(null, "" +);

    }

    public static double randomDoublePopulator(){

        int x = (int) (Math.random()*300+200);
        double randomNumber = Double.parseDouble(String.valueOf(x));

        return randomNumber;
    }
}
