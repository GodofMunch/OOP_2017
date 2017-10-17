public class BankAccount {

    private String name;
    private double balance;
    private int accountNo;

    public int getAccountNo()
    {
         return accountNo;
    }

    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public void setAccountNo(int accountNo)
    {
        this.accountNo = accountNo;
    }

    public BankAccount()
    {
        this ("", 0, 0.0);
    }

    public BankAccount(String name, int accountNo, double balance)
    {
        setAccountNo(accountNo);
        setName(name);
        setBalance(balance);
    }

    public String toString()
    {
        String text;

        text = String.format("%-20s: %d\n%-20s: €%.2f\n%-20s: %s","Account Number",
                getAccountNo(),"Balance", getBalance(), "Account Holder", getName());

        return text;
    }

    public void lodgeMoney(double lodgeAmount)
    {
        setBalance((getBalance() + lodgeAmount));
    }

    public void withdrawMoney(double withdrawAmount)
    {
        if(withdrawAmount<getBalance())
            setBalance((getBalance() - withdrawAmount));
    }
}
