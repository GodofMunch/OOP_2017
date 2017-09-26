import java.util.Scanner;

public class problem5 {
    public static void main(String args[]) {
        int numberOne = 0, numberTwo = 0;
        String user;
        char ch;
        Scanner input = new Scanner(System.in);

        System.out.print("Please choose which simple mathematic equation you " +
                "would like to perform: \n\n'a' for addition\n's' for subtraction " +
                "\n'm' for multiplication \n'd' for division\n\nPlease enter your choice: ");
        user = input.nextLine().toLowerCase();
        ch = user.charAt(0);

        switch (ch) {
            case 'a': {
                System.out.print("Please enter your first number: ");
                numberOne = input.nextInt();

                System.out.print("Please enter your second number: ");
                numberTwo = input.nextInt();

                System.out.print("The answer to your question is " + (numberOne + numberTwo));
                break;
            }

            case 's': {
                System.out.print("Please enter your first number: ");
                numberOne = input.nextInt();

                System.out.print("Please enter your second number: ");
                numberTwo = input.nextInt();

                System.out.print("The answer to your question is " + (numberOne - numberTwo));
                break;
            }

            case 'm': {
                System.out.print("Please enter your first number: ");
                numberOne = input.nextInt();

                System.out.print("Please enter your second number: ");
                numberTwo = input.nextInt();

                System.out.print("The answer to your question is " + (numberOne * numberTwo));
                break;
            }

            case 'd': {
                System.out.print("Please enter your first number: ");
                numberOne = input.nextInt();

                System.out.print("Please enter your second number: ");
                numberTwo = input.nextInt();

                System.out.print("The answer to your question is " + (numberOne / numberTwo));
                break;
            }

            default:{
                System.out.print("Error! Please run program again to re-enter!!");
                break;
            }
        }
    }
}