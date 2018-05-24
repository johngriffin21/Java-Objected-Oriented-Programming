//Add a deposit method to your BankAccount class
public class BankAccount 
{
    double balance = 0;
    public BankAccount(double b)
    {
        balance = b;
    }
    public void withdraw(double amount) 
    {
        balance = balance- amount;
    }
    public void deposit(double d_amount) 
    { 
        balance = balance + d_amount;
    }
}