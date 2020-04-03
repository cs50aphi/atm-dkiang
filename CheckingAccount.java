public class CheckingAccount
{
    int balance;

    public CheckingAccount()
    {
        balance = 10;
    }

    public CheckingAccount(int amount)
    {
        balance = amount;
    }

    public void deposit(int amount)
    {
        balance += amount;
    }
}