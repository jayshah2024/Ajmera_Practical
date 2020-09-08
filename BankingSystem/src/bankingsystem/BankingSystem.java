/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;
import java.sql.DriverManager;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author Jay
 */
public class BankingSystem {

   
    public void credit(){
        
    }
    public void debit(){
        
    }
    
    public void checkingsAccount(){
        
    }
    public void savingAccounts(){
        
    }
    
    public void showBalance(){
        
    }
    
    public static void main(String[] args) throws ClassNotFoundException {
        int token;
        ArrayList<Integer> SavingsAdd=new ArrayList<Integer>();
        ArrayList<Integer> SavingsExtract=new ArrayList<Integer>();
        ArrayList<Integer> CheckingsAdd=new ArrayList<Integer>();
        ArrayList<Integer> CheckingsExtract=new ArrayList<Integer>();
        ArrayList<Integer> creditAdd=new ArrayList<Integer>();
        ArrayList<Integer> debitAdd=new ArrayList<Integer>();
        ArrayList<Integer> creditExtract=new ArrayList<Integer>();
        ArrayList<Integer> debitExtract=new ArrayList<Integer>();
        int savings=1000,checkings=1000,credit=1000,debit=1000;
        Class.forName("oracle.jdbc.driver.OracleDriver");
        DriverManager registerDriver;
        registerDriver = DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
        String url=jdbc:derby://localhost:1527/transanctions
        
        
        do{
    
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your card 1) Press 1 for Debit 2) Press 2 for Credit");
        int card=scan.nextInt();
        System.out.println("Enter amount in multiple of 500");
        int amount=scan.nextInt();
        if (amount%500!=0)
        {  
            System.out.println("Error in amount");
            System.out.println("Please enter amount in multiple of 500");
            amount=scan.nextInt();
        }
        System.out.println("Press 1 for Savings account and 2 for Checkings account");
        int account=scan.nextInt();
        System.out.println("Enter 1 for adding money and press 2 for extracting money");
        int transaction=scan.nextInt();
        
       
        
        if (transaction==1)
        {
            if(account==1)
            {
                if (card==1)
                {
                    savings=savings + amount;
                    debit=debit+amount;
                    SavingsAdd.add(amount);
                    debitAdd.add(amount);
                    
                }
                else
                {
                    savings=savings + amount;
                    credit=credit+amount;
                    SavingsAdd.add(amount);
                    creditAdd.add(amount);
                }
               
            }
            else
            {
                if (card==1)
                {
                    checkings=checkings + amount;
                    debit=debit+amount;
                    CheckingsAdd.add(amount);
                    debitAdd.add(amount);
                    
                }
                else
                {
                    checkings=checkings + amount;
                    credit=credit+amount;
                    CheckingsAdd.add(amount);
                    creditAdd.add(amount);
                }
               
            }
        }
        else
        {
         if(account==1)
            {
                if (card==1)
                {
                    savings=savings - amount;
                    debit=debit-amount;
                    SavingsExtract.add(amount);
                    debitExtract.add(amount);
                    
                }
                else
                {
                    savings=savings - amount;
                    credit=credit-amount;
                    SavingsExtract.add(amount);
                    creditExtract.add(amount);
                }
               
            }
            else
            {
                if (card==1)
                {
                    checkings=checkings - amount;
                    debit=debit-amount;
                    CheckingsExtract.add(amount);
                    debitExtract.add(amount);
                    
                }
                else
                {
                    checkings=checkings - amount;
                    credit=credit-amount;
                    CheckingsExtract.add(amount);
                    creditExtract.add(amount);
                }
               
            }
        }
        System.out.println("Savings balance =" + savings);
        System.out.println("Checkings balance =" + checkings);
        System.out.println("Credit card balance =" + credit);
        System.out.println("Debit card balance =" + debit);
        System.out.println("Transaction while adding in savings account" + SavingsAdd);
        System.out.println("Transaction while adding in checkings account" + CheckingsAdd);
        System.out.println("Transaction while adding through debit card" + debitAdd);
        System.out.println("Transaction while adding through credit card" + creditAdd);
        System.out.println("Transaction while extracting in savings account" + SavingsExtract);
        System.out.println("Transaction while extracting in checkings account" + CheckingsExtract);
        System.out.println("Transaction while extracting through debit card" + debitExtract);
        System.out.println("Transaction while extracting through credit card" + creditExtract);

        System.out.println("Press 1 to continue and 2 for hault");
        token=scan.nextInt();
        }while(token==1);
        
           
    } 
    
}
