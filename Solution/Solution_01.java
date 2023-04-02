/*
Define a class to represent a bank account. Include the following members: 

Data Members:
a.Name of the Depositor
b.Account Number
c.Type of Account
d.Balance amount in the account

Data Methods:
a.To assign initial values
b.To deposit an amount
c.To withdraw an amount 
d.To display name and balance.
*/
//package practice;
import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Random;   
 
class Bank
{
    public String nameOfDepositor;
    public int accNumber;
    public String accType;
    public double balanceAmount;
     
    public void assignValues(String nameOfDepositor, String accType, double balanceAmount)
    {
        this.nameOfDepositor=nameOfDepositor;
        this.accType=accType;
        this.balanceAmount=balanceAmount;
         
        Random random = new Random();
        this.accNumber=random.nextInt(1000000);
        System.out.println("Your new account number is: "+accNumber);
    }
    public void depositAmount(double amount)
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account to deposit\nNote:please assign values to create an account");
        else
        {
            balanceAmount+=amount;
            System.out.println("Amount deposited successfully...");
        }
    }
    public void withdrawAmount(double amount)
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account to credit\nNote:please assign values to create an account");
        else if(balanceAmount>amount)
        {
            balanceAmount-=amount;
            System.out.println("Amount credited successfully...");
        }
        else
			System.out.println("! Insufficient balance");
    }
    public void displayDetails()
    {
        if(accNumber==0)
            System.out.println("!You don't have bank account\nNote:please assign values to create an account");
        else
        {
		    System.out.println("Name of the Depositor: "+nameOfDepositor);
            System.out.println("Balance amount in the account: "+balanceAmount);
        }
    }
    public void getInput()
    {
        System.out.println("How can i help you?");
        System.out.println("1. Open account");
        System.out.println("2. Deposit amount");
        System.out.println("3. Withdraw amount");
        System.out.println("4. Account details");
        System.out.println("5. Exit");
        System.out.print("Please Enter Your choose : ");
    }
}
class  Solution_01
{
    public static void main(String[] s) throws IOException
    {
        System.out.println(":::::::::::: WELCOME TO BANK OF BARODA ::::::::::::");
        Bank newAccount=new Bank();
         
        Scanner scan=new Scanner(System.in);
        boolean process=true;
        int continueState=0;
         
        while(continueState!=5)
        {
            newAccount.getInput();
            int currentProcess=scan.nextInt();
             
            if(currentProcess==1)
            {
				System.out.println("*******************************************************");
                System.out.print("Enter your name: ");
                String nameOfDepositor=scan.next();
                System.out.print("Enter your account type: ");
                String accType=scan.next();
                System.out.print("Enter your opening balance: ");
                double  balanceAmount=scan.nextDouble();
                newAccount.assignValues(nameOfDepositor, accType, balanceAmount);
            }
            else if(currentProcess==2)
            {
				System.out.println("*******************************************************");
                System.out.print("Enter amount to deposit: ");
                newAccount.depositAmount(scan.nextDouble());
            }
            else if(currentProcess==3)
            {
				System.out.println("*******************************************************");
				System.out.println("Your current Balance in the account: "+newAccount.balanceAmount);
                System.out.print("Enter amount to withdraw: ");
                newAccount.withdrawAmount(scan.nextDouble());
            }
            else if(currentProcess==4)
            {
				System.out.println("*******************************************************");
                newAccount.displayDetails();
            }
            else if(currentProcess==5)
            {
				System.out.println("*******************************************************");
                continueState=5;
                System.out.println("THANK YOU FOR VISITING OUR BANK.");
            }
			System.out.println();
			System.out.println("X X X X X X X X X X X X X X X X X X X X X X X X X X X X");
			System.out.println();
        }
		System.out.println("---------------------------------------------------------------------------------------------");
    }
}