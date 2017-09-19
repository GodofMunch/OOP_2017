/**
 * Created by t00139303 on 13/09/2017.
 */

import java.util.Scanner;

public class problemOne {
    public static void main(String[] args) {

        String name, className;
        int snacksDesired;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.print("Please enter what class you are in: ");
        className = input.nextLine();

        System.out.print("Please enter how many snacks you would like: ");
        snacksDesired = input.nextInt();

        System.out.print("\nName: " + name + "\nClass: " + className + "\nSnacks: " + snacksDesired +
        "\n\nThe cost of your transaction is : EUR" + 2*snacksDesired);
    }
}
