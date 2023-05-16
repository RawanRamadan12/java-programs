
 
package rawan_ramadan_2051711254;


public class AccountsInformation  {   // creat class call AccountsInformation  to make account for custmor from his information
    private String Account_unqiue_Number;  //make variable to make  an account number for custmor by national id
    private double Accounts_balance;  // make variable to put number of money for custmor  (open an account)
    private HolderInformation Accounts_holder_Information ;    //make an object have type holdet to get civil id and another information about custmor
    private final String Accounts_samePrefix_Number="2192";   // make a varable as a constant to make unique account number
    
         
          
   //  make constructor to initial variables (zero arg-constructor)
        
    public AccountsInformation() {
        Account_unqiue_Number=null;
        Accounts_balance=0;
        Accounts_holder_Information=new HolderInformation();
    }

    //  make constructor to put value in variables (mult arg-constructor) for class AccountsInformation
    
    public AccountsInformation(String Account_unqiue_Number, double Accounts_balance, HolderInformation Accounts_holder_Information) {
        this.Account_unqiue_Number = Account_unqiue_Number;
        this.Accounts_balance = Accounts_balance;
        this.Accounts_holder_Information = Accounts_holder_Information;
    }

    public String getAccount_unqiue_Number() {    // make a getter method to return an account number
        return Account_unqiue_Number;
    }

    public double getAccounts_balance() {      //make a getter method to return balance of account
        return Accounts_balance;
    }

    public HolderInformation getAccounts_holder_Information() {  // make a getter method to return object from class holder
        return Accounts_holder_Information;
    }

    public String getAccounts_samePrefix_Number() {   // make a getter method to return the constant variable that have same number we will put befor account number
        return Accounts_samePrefix_Number;
    }

    public void setAccount_unqiue_Number(String Account_unqiue_Number) {  //make a setter method to set account number of custmor
        this.Account_unqiue_Number = Account_unqiue_Number;
    }

    public void setAccounts_balance(double Accounts_balance) {   //make a setter method to set balance of custmor
        this.Accounts_balance = Accounts_balance;
    }

    public void setAccounts_holder_Information(HolderInformation Accounts_holder_Information) {   //make a setter method to set object from class holder
        this.Accounts_holder_Information = Accounts_holder_Information;
    }
   
   //make string method to display information about class (AccountsInformation)
    public String toString( ) {
        return  "  Information about account, " + " account id: "+ Account_unqiue_Number +" , money in the account: "+ Accounts_balance 
                + Accounts_holder_Information;
    }

  
  
    } //end of class
    
     
    
    
    
    

