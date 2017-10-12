/**
 * Created by t00139303 on 12/10/2017.
 */
public class VendingMachine {

    private int cans, tokens;

    public int getCans()
    {
        return cans;
    }

    public int getTokens()
    {
        return tokens;
    }

    public void setCans(int cans)
    {
         this.cans = cans;
    }

    public void setTokens(int tokens)
    {
        this.tokens = tokens;
    }

    public VendingMachine(int cans, int tokens)
    {
        setCans(cans);
        setTokens(tokens);
    }

    public VendingMachine()
    {
        this(0,0);
    }

    public String toString()
    {
        String text = "Cans: " + cans + "\nTokens: " + tokens;

        return text;
    }
}
