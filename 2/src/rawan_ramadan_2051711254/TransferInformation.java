
package rawan_ramadan_2051711254;

import java.util.Date;  //import from java library to get date of every transaction



public class TransferInformation extends TransactionsInformation{  //make class for transfer money from specified account to another account and exstend from transaction class 
    
private double balance_trans;
    public TransferInformation() {     //make constractor have a constractors super class
        super();
        balance_trans=0;
    }
    //  make constructor to put value in variables (mult arg-constructor)
    public TransferInformation(double balance_trans) {
        this.balance_trans = balance_trans;
    }
     //  make constructor to put value in variables (mult arg-constructor)
    public TransferInformation(Date Date_Transactions, AccountsInformation Account_Information) {
        super(Date_Transactions, Account_Information);
    }

    public double getBalance_trans() {   //make a getter method to get the amount of transfer
        return balance_trans;
    }

    public Date getDate_Transactions() {          //make a getter method to return date of withdrawal opreation
        return Date_Transactions;
    }

    public AccountsInformation getAccount_Information() {   //make a getter method to get an object  from class account
        return Account_Information;
    }
 
    public void setBalance_trans(double balance_trans) {    //make a setter method to set the amount of transfer
        this.balance_trans = balance_trans; 
    }

 
    public void setAccount_Information(AccountsInformation Account_Information) {  //make a setter method to set an object from class acoount
        this.Account_Information = Account_Information;
    }
    
   
 

   
    public String toString() {     //make to string method have information about class (transfer)
        return " The date of transfer: "+Date_Transactions + " ,the amount of transfer: "+balance_trans
                +Account_Information;
    }
}//end of class
    
   
    

