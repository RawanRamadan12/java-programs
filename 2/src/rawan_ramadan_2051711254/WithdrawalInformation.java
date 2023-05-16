
package rawan_ramadan_2051711254;

import java.util.Date; //import from java library to get date of every transaction


public class WithdrawalInformation extends TransactionsInformation {  //make class for withdrawal money from specified account and exstend from transaction class
 private double AmountOfMoney;
    public WithdrawalInformation() {
        super();                                 //make constractor have a constractors super class 
        AmountOfMoney=0;
    }

    public WithdrawalInformation(Date Date_Transactions, AccountsInformation Account_Information) {  //make constractor have a constractors super class
        super(Date_Transactions, Account_Information);
    }

    public WithdrawalInformation(double AmountOfMoney) {  // make a (multi_arg constructor)
        this.AmountOfMoney = AmountOfMoney;
    }

    public Date getDate_Transactions() {  //make a getter method to return date of withdrawal opreation
        return Date_Transactions;
    }

    public AccountsInformation getAccount_Information() {   //make a getter method to get an object  from class account
        return Account_Information;
    }

    public void setAccount_Information(AccountsInformation Account_Information) { //make a setter method to set an object from class acoount
        this.Account_Information = Account_Information;
    }

    public double getAmountOfMoney() {   //make a getter method to get the amount of withdrawal
        return AmountOfMoney;
    }

    public void setAmountOfMoney(double AmountOfMoney) {  // make a setter method to set the amount of withdrawal
        this.AmountOfMoney = AmountOfMoney;
    }
   
    
  
    public String toString( ) {   //make to string method have information  about withdrawal opreations
        return " The date of withdrawal: " + Date_Transactions
                +" the amount of withdrawal: "+ AmountOfMoney
                +Account_Information;
  }
    
    
    
}//end of class
