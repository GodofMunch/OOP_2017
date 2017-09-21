import javax.swing.*;

/**
 * Created by t00139303 on 21/09/2017.
 */
public class problem5 {
    public static void main(String[] args) {
       int a=1,b=6,c=-16;
       double xPositive, xNegative, answerNegative, answerPositive;

       xPositive = positiveEquation(a,b,c);
       xNegative = negativeEquation(a,b,c);

       answerPositive = quadraticEquationSolver(xPositive);
       answerNegative = quadraticEquationSolver(xNegative);


       JOptionPane.showMessageDialog(null, "The answer to the positive equation where x " +
                       "is = to " + xPositive + " is: " + answerPositive + "\nThe answer to the negative equation " +
                       "where x is = to " + xNegative + " is : " + answerNegative,"Quadratic Equation Solver",
                       JOptionPane.INFORMATION_MESSAGE);
    }

    public static double positiveEquation(int a, int b, int c){
        double x;

        x = (-b + (Math.sqrt(Math.pow(b,2)-4*a*c)))/2*a;

        return x;
    }

    public static double negativeEquation(int a,int b, int c)
    {
        double x = (- b - (Math.sqrt(Math.pow(b,2) - 4*a*c)))/2*a;

        return x;
    }

    public static double quadraticEquationSolver(double x)
    {
        double ans = Math.pow(x,2) + (6*x) - 16;

        return ans;
    }

}
