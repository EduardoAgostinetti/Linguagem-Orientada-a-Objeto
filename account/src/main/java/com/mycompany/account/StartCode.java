package com.mycompany.account;

public class StartCode {
    public static void main(String[] args) {
        Account account = new Account();
        //Account One
        Account accountOne = new Account("josé",453573422, 43, 1000, 10.0);
        System.out.println(accountOne.getHolderName()); //José
        System.out.println("CPF: " + accountOne.getCpf()); //453342543
        System.out.println("Age: " + accountOne.getAge()); //23
        System.out.println("Account Number: " + accountOne.getAccountNumber()); // 1000
        System.out.println("Balance: " + accountOne.getBalance()); // 10.0
        
        //Account Two
        System.out.println();
        Account accountTwo = new Account("Ricardo", 453342543, 23, 2000, 10.0);
        System.out.println("Holder Name: " + accountTwo.getHolderName()); //Ricardo
        System.out.println("CPF: " + accountTwo.getCpf()); //453342543
        System.out.println("Age: " + accountTwo.getAge()); //23
        System.out.println("Account Number: " + accountTwo.getAccountNumber()); //2000
        System.out.println("Balance: " + accountTwo.getBalance()); // 10.0
        
        System.out.println();
        
        
        //Withdraw in Account One
        account.withdraw(6, accountOne);
        //Deposit in Account Two
        account.deposit(200, accountTwo);
        //Transfer contaOne
        accountTwo.transfer(accountOne, 110);
        
        System.out.println();
        System.out.println("Accounts after the procedures performed");
        
        //Account One
        System.out.println(accountOne.getHolderName()); 
        System.out.println("CPF: " + accountOne.getCpf()); 
        System.out.println("Age: " + accountOne.getAge()); 
        System.out.println("Account Number: " + accountOne.getAccountNumber()); 
        System.out.println("Balance: " + accountOne.getBalance()); 
        
        //Account Two
        System.out.println();
        System.out.println("Holder Name: " + accountTwo.getHolderName()); 
        System.out.println("CPF: " + accountTwo.getCpf()); 
        System.out.println("Age: " + accountTwo.getAge()); 
        System.out.println("Account Number: " + accountTwo.getAccountNumber()); 
        System.out.println("Balance: " + accountTwo.getBalance()); 
        
    }
}
