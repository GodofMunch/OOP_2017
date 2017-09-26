/**
 * Created by t00139303 on 26/09/2017.
 */

import javax.swing.JOptionPane;
public class problem9 {
    public static void main(String[] args) {

        double[] calfWeight = new double[10], floatPart = new double[10];
        String weightList="";
        double lightest=0, average=0, total=0;
        int  numberUnder250=0;
        double over400 = 0, percentageOver400=0;

        for (int i = 0; i < 10;i++) {
            calfWeight[i] = randomDoublePopulator();
            floatPart[i] = randomDoublePopulator();
            floatPart[i] = floatPart[i]/100;
            calfWeight[i] = calfWeight[i] + floatPart[i];
            System.out.print("\n" + calfWeight[i]);

            total += calfWeight[i];

            if(i<9)
                weightList += calfWeight[i] + " , ";
            else
                weightList += calfWeight[i];

            if(i==0)
                lightest = calfWeight[i];

            if(calfWeight[i]>=400)
                over400++;

            if(calfWeight[i]<=lightest)
                lightest=calfWeight[i];

            if(calfWeight[i]<250f)
                numberUnder250++;
        }

        System.out.print("\n\n" + over400);

        average = total/calfWeight.length;
        percentageOver400 = (over400/calfWeight.length)*100/1;



        JOptionPane.showMessageDialog(null, "Weights : " + weightList +
                "\nNumber under 250kg :" + numberUnder250 + "\nPercentage over 400kg : " + percentageOver400 + "%" +
                "\nLightest animal : " + lightest + " kg \nAverage Weight : " + String.format("%.2f", average) + " kg");

    }

    public static double randomDoublePopulator(){

        int x = (int) (Math.random()*400+100);
        double randomNumber = Double.parseDouble(String.valueOf(x));

        return randomNumber;
    }
}
