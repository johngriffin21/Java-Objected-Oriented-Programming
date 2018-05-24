//Add setters and getters to your bank account class
public class BankAccount 
{
    double balance;
    
    public BankAccount(double b)
    {
        balance = b;
    }
    
    public BankAccount()
    {
        balance = 100.00;
    }
  
    public void withdraw(double amount) 
    {
        balance = balance - amount;
    }
    public void deposit(double d_amount) 
    { 
        balance = balance + d_amount;
    }
    public void setBalance(double new_balance)
    {
        balance = new_balance;
    }
    public double getBalance()
    {
       return balance;
    }
}