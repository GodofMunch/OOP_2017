import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {

        String user;
        int userNumber=0, total=0, i=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number (q to quit): ");
        user = input.nextLine();

        while(!user.equals("q"))
        {
            userNumber = Integer.parseInt(user);

            total += userNumber;
            i++;

            System.out.print("Please enter another number: ");
            user = input.nextLine();
        }

        if(i>0)
        {
            System.out.print("\nThe total of the numbers you entered is " + total +
            "\nYou entered " + i + " numbers");
        }

        else
        {
            System.out.print("\nYou didn't enter any numbers, Thanks for your co-operation...");
        }
    }
}
