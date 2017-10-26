public abstract class BankAccount implements iTransactable ,iTaxable {

    protected String name;
    protected int accNum;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public int getAccNum() {
        return accNum;
    }

    public BankAccount() {
        this("Unknown", 0);
    }

    public BankAccount(String name, int accNum)
    {
        setName(name);
        setAccNum(accNum);
    }

    public String toString()
    {
        String text;

        text = String.format("\n%-20s%10s\n%-20s%10d", "Name :", getName(), "Account Number :", getAccNum());

        return text;
    }

}
