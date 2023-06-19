package cscmssitcoding;

import java.util.ArrayList;

public class No88 {
    public static void main(String[] args) {
         //DO NOT MODIFY!!
        // Create SavingAccounts
        SavingAccount s1 = new SavingAccount(3000);
        SavingAccount s2 = new SavingAccount(1000);
        SavingAccount s3 = new SavingAccount(2000);

        // Create 1st Customer
        BankCustomer b1 = new BankCustomer("Tutor", 15);
        b1.AddAccount(s1);
        s1.withdraw(200);
        s1.deposit(500);
        b1.AddAccount(s2);
        System.out.println(b1.getName());
        System.out.println(b1.getTotalBalance());
        b1.AddAccount(s3);
        System.out.println(b1.getTotalBalance());
        s1.withdraw(200);
        s1.deposit(500);

        // Create 2nd Customer
        BankCustomer b2 = new BankCustomer("Boy", 15);
        System.out.println(b2.getName());
        System.out.println(b2.getTotalBalance());
        b2.AddAccount(s1);
        s2.deposit(5000);
        s2.withdraw(200);
        b2.AddAccount(s2);
        System.out.println(b2.getTotalBalance());
    }
}
class BankCustomer extends Customer{
    //Write you code here
    private ArrayList<SavingAccount> acc=new ArrayList<SavingAccount>();
    public BankCustomer(String name, int age){
        super(name, age);
    }
    public void AddAccount(SavingAccount a){
        acc.add(a);

    }
    public double getTotalBalance(){
        double gtb=0;
        for(SavingAccount a: acc){
            gtb+=a.getBalance();
        }
        return gtb;
    }
    
  }
  
  class Customer{
    //Write you code here
    private int age;
    private String name;
    public Customer(String name,int age){
        this.name=name;
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setName(String name){
        this.name=name;
    }
  }
  
  class SavingAccount{
    //Write you code here
    private double balance;
    public SavingAccount(){

    }
    public SavingAccount(double d){
        this.balance=d;
    }
    public void deposit(double a){
        this.balance+=a;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public void withdraw(double a){
        this.balance-=a;
    }
  }
  
  