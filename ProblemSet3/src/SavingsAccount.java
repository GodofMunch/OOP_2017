
public class SavingsAccount extends BankAccount {

    private double balance;


    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public SavingsAccount()
    {
        this("", 0,0.0);
    }

    public SavingsAccount(String name, int accNum, double balance)
    {
        super(name, accNum);
        setBalance(balance);
    }
    public String toString()
    {
        String text = String.format(super.toString() + "\n%-20s%10.2f", "Balance :", getBalance());

        return text;
    }



    public double calcTax()
    {
        return balance*.985;
    }

    public void lodge(double balance)
    {
        setBalance((getBalance() + balance));
    }

    public void withdraw(double balance)
    {
        setBalance((getBalance() - balance));
    }

}