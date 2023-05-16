
package rawan_ramadan_2051711254;

import java.util.Date;   //import from java library to get date of every transaction


public class DepositInformation extends TransactionsInformation {  //make class for deposit money to specified account and exstend from transaction class
 private double deposit_money;
    
    public DepositInformation() {   //make constractor have a constractors super class 
        super();
        deposit_money=0;
    }
    
     public DepositInformation( double deposit_money) {    //make constractor have a constractors (multi_arg constructor)
       
        this.deposit_money=deposit_money;
    }

    public DepositInformation(Date Date_Transactions, AccountsInformation Account_Information) { //make constractor have a constractors super class
        super(Date_Transactions, Account_Information);
       
    }
    
   
    
    public AccountsInformation getInformation_Account() {   //make a getter method to get an object  from class account
        return Account_Information ;
    }

    public Date getDate_Transactions() { //make a getter method to return date of deposit opreation
        return Date_Transactions;
    }

    public double getDeposit_money() {   //make a getter method to return the amount of deposit
        return deposit_money;
    }
    

    public void setInformation_Account(AccountsInformation Account_Information ) {  //make a setter method to set an object from class acoount
        this.Account_Information = Account_Information ;
    }

    public void setDeposit_money(double deposit_money) {    //make a setter method to set the amount of deposit
        this.deposit_money = deposit_money;
    }
    
    
    public String toString( ) {    //make to string method have information about the deposit opreations 
       return " The date of the deposit: "+ Date_Transactions  +" ,the amont of deposit: " + deposit_money
               +Account_Information;
             
    }

    
   
    
    
    }//end of class

