// ATM Driver by Douglas Kiang
import java.util.Scanner;

public class ATM
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        CheckingAccount checking = new CheckingAccount();
        SavingsAccount savings = new SavingsAccount();
        System.out.println("Greetings and how may I serve you?");
        boolean done = false;
        do
        {
            System.out.print("Do you want to: (D)eposit, (W)ithdraw, (C)heck Balance, (T)ransfer, (Q)uit?");
            String response = in.nextLine();
            switch (response)
            {
                case "d":
                case "D":
                    int account;
                    int amount;
                    do
                    {
                        System.out.print("Deposit from: (1)Checking or (2)Savings?");
                        account = in.nextInt();
                    }
                    while (account < 1 || account > 2);
                    do
                    {
                        System.out.print("How many credits do you want to deposit?");
                        amount = in.nextInt();
                    }
                    while (amount < 0 || amount > 100000);
                    if (account == 1)
                    {
                        checking.deposit(amount);
                    }
                    else
                    {
                        savings.deposit(amount);
                    }
                    break;
            }
        }
        while (!done);
        System.out.println("Thank you for your business. Goodbye!");
    }
}