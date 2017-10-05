public class Fraction {
    private int numerator, denominator;

    public int getNumerator()
    {
        return numerator;
    }

    public int getDenominator()
    {
        return denominator;
    }

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }

    public Fraction(int numerator, int denominator)
    {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Fraction()
    {
        this(0,1);
    }

    public String toString()
    {
        String text = (getNumerator() + " / " +  getDenominator());

        return text;
    }

    public static Fraction multiply(Fraction fractionOne, Fraction fractionTwo)
    {
        int num1, num2, denom1, denom2, numAns, denomAns;

        num1 = fractionOne.getNumerator();
        num2 = fractionTwo.getNumerator();
        denom1 = fractionOne.getDenominator();
        denom2 = fractionTwo.getDenominator();

         numAns = num1 * num2;
         denomAns = denom1*denom2;

         Fraction multiplied = new Fraction(numAns, denomAns);

         return multiplied;
    }

    public static Fraction divide(Fraction fractionOne, Fraction fractionTwo)
    {
        int num1, num2, denom1, denom2, numAns, denomAns;

        num1 = fractionOne.getNumerator();
        num2 = fractionTwo.getNumerator();
        denom1 = fractionOne.getDenominator();
        denom2 = fractionTwo.getDenominator();

        numAns = num1*denom2;
        denomAns = denom1 * num2;

        Fraction divided = new Fraction(numAns, denomAns);

        return divided;
    }

    public static Fraction add(Fraction fractionOne, Fraction fractionTwo)
    {
        int num1, num2, denom1, denom2, numAns, denomAns;

        num1 = fractionOne.getNumerator();
        num2 = fractionTwo.getNumerator();
        denom1 = fractionOne.getDenominator();
        denom2 = fractionTwo.getDenominator();

        numAns = (denom2*num1) + (denom1*num2);
        denomAns = (denom1 * denom2);

        Fraction added = new Fraction(numAns, denomAns);

        return added;
    }

    public static Fraction subtract(Fraction fractionOne, Fraction fractionTwo)
    {
        int num1, num2, denom1, denom2, numAns, denomAns;

        num1 = fractionOne.getNumerator();
        num2 = fractionTwo.getNumerator();
        denom1 = fractionOne.getDenominator();
        denom2 = fractionTwo.getDenominator();

        numAns = (denom2*num1)-(denom1*num2);
        denomAns = (denom1*denom2);

        Fraction subtracted = new Fraction(numAns, denomAns);

        return subtracted;
    }
}
