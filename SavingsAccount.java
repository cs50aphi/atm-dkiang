public class SavingsAccount
{
    int balance;
    double rate;

    public SavingsAccount()
    {
        balance = 10;
        rate = 0.16;
    }

    public SavingsAccount(int amount)
    {
        balance = amount;
    }

    public void withdraw(int amount)
    {
        balance -= amount;
    }
}