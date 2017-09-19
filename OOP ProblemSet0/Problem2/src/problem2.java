/**
 * Created by t00139303 on 13/09/2017.
 */

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {

        String firstName, lastName, initial;
        int distance;
        float totalOwed;
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your first name: ");
        firstName = input.nextLine();

        System.out.print("Please enter your last name: ");
        lastName = input.nextLine();

        System.out.print("Please enter your initial: ");
        initial = input.nextLine();

        System.out.print("Please enter what distance you travelled: ");
        distance = input.nextInt();

        if(distance<=10)
        {
            totalOwed = distance*.07f;
        }
        else
        {
            totalOwed = (distance*.1f) +.7f;
        }

        System.out.print("Your Name: " + firstName + "\" " + initial + "\" " + lastName +
           "\nMoney Owed: EUR " + String.format("%.2f", totalOwed));
    }
}
