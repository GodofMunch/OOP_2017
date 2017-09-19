/**
 * Created by t00139303 on 13/09/2017.
 */
import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {

        String name;
        float taxableIncome, taxDue=0, net=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter the amount of taxable income you earned this year: ");
        taxableIncome = input.nextFloat();

        if(taxableIncome<=20000.00)
        {
            taxDue = 0;
            net = taxableIncome;
        }
        else if(taxableIncome>=20000.01 && taxableIncome<=36000)
        {
            taxDue = (36000-taxableIncome)*.2f;
            net = taxableIncome-taxDue;
        }

        else if(taxableIncome>=36000.01)
        {
            taxDue = (36000 - 20000.01f) * .2f + (taxableIncome - 36000.01f)*.41f;
            net = taxableIncome-taxDue;
        }

        System.out.print("\nName: " + name + "\nTax due: " + taxDue + "\nNet Income: " + net);
    }
}
