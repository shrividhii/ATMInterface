
package atmmachine;

import java.util.Scanner;

class ATM
{
    float Balance;
    int PIN = 1234;
    
    public void checkpin()
    {
        System.out.println("enter your pin");
        Scanner sc = new Scanner(System.in);
        
        int enteredpin = sc.nextInt();
        if(enteredpin==PIN)
        {
            menu();
        }
        else
        {
            System.out.println("enter a valid pin");
        }
    }
    
    public void menu()
    {
        System.out.println("enter your choice");
        System.out.println("1. Check Account Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        
        if(opt==1)
        {
            checkBalance();
        }
        else if(opt==2)
        {
            withDrawMoney();
        }
        else if(opt==3)
        {
            depositMoney();
        }
        else if(opt==4)
        {
            return;
        }
        else
        {
            System.out.println("enter a valid choice");
        }
        
    }
    
    public void checkBalance()
    {
        System.out.println("Balance" + Balance);
        menu();
    }
    
    public void withDrawMoney()
    {
        System.out.println("enter amount to withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount>Balance)
        {
            System.out.println("insufficient balance");
        }
        else
        {
            Balance = Balance-amount;
            System.out.println("Money withdrawal successfull");
        }
        menu();
    }
    
    public void depositMoney()
    {
        System.out.println("enter the amount");
        Scanner sc = new Scanner(System.in);
        
        float amount = sc.nextFloat();
        Balance=Balance+amount;
        System.out.println("Money deposited successfully");
        
        menu();
    }
}
public class ATMMachine 
{
    public static void main(String[] args) 
    {
       ATM obj = new ATM();
       obj.checkpin();
    }
    
}
