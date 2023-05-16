
package rawan_ramadan_2051711254;
import java.util.*;  //import from java library to get date of every transaction

public abstract class  TransactionsInformation  {  // creat an abstract class have a common attributes between 3 type of transactions
    
    protected Date Date_Transactions;   //date created 
    protected AccountsInformation Account_Information ; // creat an object to get information from account class
   
    
    public TransactionsInformation(){  //make a zero_arg constructor to initial variables
           Date_Transactions = new java.util.Date();
            Account_Information = new AccountsInformation();
    }

     //  make constructor to put value in variables (mult arg-constructor)

    public TransactionsInformation(Date Date_Transactions, AccountsInformation Account_Information) {
        this.Date_Transactions = Date_Transactions;
        this.Account_Information = Account_Information;
    }

    public Date getDate_Transactions() {   //make a getter method to return date of transaction
        return Date_Transactions;
    }

    public AccountsInformation getAccount_Information() {  //make a getter method to return object from class account
        return Account_Information;
    }

    public void setAccount_Information(AccountsInformation Account_Information) {  //make a setter method to set a object from class account
        this.Account_Information = Account_Information;
    }
       
   

    //make an abstract method to display infromation about class (Transaction class)
    public abstract  String toString();
        
}//end of class
