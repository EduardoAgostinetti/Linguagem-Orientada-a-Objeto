package com.mycompany.account;


public class Account extends People {
    
//Privates Variables   

private int accountNumber;
private double balance;

    //Void Contructor
    public Account(){
    
    }
    // Constructor with parameters
    public Account(String holderName,int cpf, int age, int accountNumber, double balance){
        
    super(holderName, cpf, age);
    this.accountNumber = accountNumber;
    this.balance = balance;
    
    }

    
    
    
    public int getAccountNumber(){
        return this.accountNumber;
    }
    
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getBalance(){
        return this.balance;
    }
    
    public double setBalance(double balance){
        this.balance = balance;
        return balance;
    }
    
    public void withdraw (double value, Account account){
        if (value > 0) {
            if (account.balance < value) {
                System.out.println("It's not possible to withdraw this amount");
                
            } else {
                account.balance = account.balance - value;
                System.out.println("whitdraw performed successfully!");
               
            }
        } else {
            System.out.println("It's not possible to withdraw this amount");
        }
    }
    
    public void deposit(double value, Account account){
        
            account.balance = account.balance + value;
            System.out.println("deposit made successfully !");
        
        
    }
    
    public void transfer(Account destinationAccount, double value) {
        if(value > 0  && value <= this.balance) {
            destinationAccount.balance += value;
            this.balance -= value;
            System.out.println("Transfer performed successfully!");
        } else {
            System.out.println("Cannot transfer values ​​that are negative or equal to 0.");
        }
    }
 
}
