
package rawan_ramadan_2051711254;
import java.util.*;   //import the java library
import java.io.*;
public class MainJobOfBank {  //make class to do main job of bank 
    private static double max_tran;
    private static ArrayList<AccountsInformation> Account_Information;  //make an array list to store information about account
    private static ArrayList<TransactionsInformation> Transactions_Information;  //make an array list to store information about transaction (3 type)
   
    
    
    public MainJobOfBank() {   //make a zero_arg constructor to initial variables
        Account_Information = new ArrayList<AccountsInformation>();
        Transactions_Information = new ArrayList<TransactionsInformation>();
       
        max_tran = 0;
      
    }
   //  make constructor to put value in variables (mult arg-constructor)
    public MainJobOfBank(ArrayList<AccountsInformation> Account_Information , ArrayList<TransactionsInformation>  Transactions_Information ) {
        this.Account_Information = Account_Information;
        this. Transactions_Information =  Transactions_Information;
       
    }

    

    public static ArrayList<AccountsInformation> getAccount_Information() {  //make getter method to return an array  (account type)
        return Account_Information;
    }

    public static ArrayList<TransactionsInformation> getTransactions_Information() {  //make getter method to return an array  (transactions type)
        return Transactions_Information;
    }

   
    
    public static void setAccount_Information(ArrayList<AccountsInformation> Account_Information) {  //make setter method to set an array (account type)
        MainJobOfBank.Account_Information = Account_Information;
    }

    public static void setTransactions_Information(ArrayList<TransactionsInformation> Transactions_Information) {  //make setter method to set an array (transactions type)
        MainJobOfBank.Transactions_Information = Transactions_Information;
    }

   
    
         //create method to make unique account use civil id and constant number
          public static String creat_AccountId_(HolderInformation Holder_information ,AccountsInformation Account_information,ArrayList<AccountsInformation> Account_Information ){
       
                  
                    
                            //use setter method to set account number by get the same prefix number and get the civil id
                            Account_information.setAccount_unqiue_Number(Account_information.getAccounts_samePrefix_Number()+Holder_information.getCivil_id());
                            Account_Information.add(Account_information);  //add an account nuber and his information in list
                            //print a message say it succes creation or not and print account number
                            System.out.println( "creation of an account is succesful, your account number is: "+Account_information.getAccount_unqiue_Number());
                   
                   return  Account_information.getAccount_unqiue_Number();  //return an account number
                 }
    

          
               //make a method to depositMoney money to specified account
              public static double depositMoney(DepositInformation Deposit_information,double amount_OfMoney,ArrayList<TransactionsInformation> Transactions_Information ,AccountsInformation Account_information ){
                  Deposit_information.setDeposit_money(amount_OfMoney);     //put the amount of depositMoney in variable
                  System.out.println("Money befor deposit: "+Account_information.getAccounts_balance());  //print the balance befor depositMoney
                  Deposit_information.getInformation_Account().setAccounts_balance(amount_OfMoney+ Deposit_information.getInformation_Account().getAccounts_balance());  // make a depositMoney opreation by add amount of money on balance
               
                  System.out.println("Money deposited successfully"); // print succes if depositMoney money is succes
                  Transactions_Information.add(Deposit_information);   // add the the depositMoney opreation in list transaction
                  System.out.println("Money After deposit: "+Account_information.getAccounts_balance());  //print the balance after depositMoney
                
                  
                  return Account_information.getAccounts_balance();  // return the balance in account
              }
               // make a method to withdrawal money from an account
              public static double withdrawlMoney(WithdrawalInformation Withdrawal_information,double AmountOfMoney,ArrayList<TransactionsInformation> Transactions_Information,AccountsInformation Accounts_information){
                  Withdrawal_information.setAmountOfMoney(AmountOfMoney); //put the amount of withdrawal in variable
               
                  if( Accounts_information.getAccounts_balance()>=AmountOfMoney){  // check if the amount that i want to withdrawal it bigger or smaller than balance
                      //if amount smaller than balance in account
                  System.out.println("Money befor withdrawal: " +Accounts_information.getAccounts_balance());   //print the balance befor withdrawal
                  
                  Withdrawal_information.getAccount_Information().setAccounts_balance(  Withdrawal_information.getAccount_Information().getAccounts_balance()-AmountOfMoney); // make a withdrawal opreation by subtract amount of money from balance
                  System.out.println("Money withdrawaled successfull"); // print succes if withdrawal money is succes
                  Transactions_Information.add(Withdrawal_information); // add the the withdrawal opreation in list transaction
                  System.out.println("Money After withdrawal: "+Accounts_information.getAccounts_balance()); //print the balance after withdrawal
                 
                  } //if amount bigger than balance in account
                  else{
                  System.out.println("Account number  ( " + Accounts_information.getAccount_unqiue_Number()+" ): has not enaugh money to make withdrawal") ; // print that the withdrawal opreation is not succes
                  System.out.println("Money withdrawal unsuccessfull");
                  
              }
                  return   Accounts_information.getAccounts_balance(); // return the balance in account
}                 
              //make method to transfer money between two account
              public static double transferMoney(TransferInformation transfer_information ,double AmountOfMoney,ArrayList<TransactionsInformation> Transactions_Information,AccountsInformation Accounts_information,AccountsInformation Accounts_information_){
                  transfer_information.setBalance_trans(AmountOfMoney);  // set the balance you want transfer in variable
                  if(AmountOfMoney>Accounts_information.getAccounts_balance()){    //check if we can transfer from account to another by using balance of account
                      System.out.println("Money transfer unsuccessfull");  //if amount we should transfer bigger than balance of an account will print unsuccess
                      
                  }
                  else{  //else if amount smaller than balance will be transfer
                      System.out.println("Money befor transfer from in account number( "+Accounts_information.getAccount_unqiue_Number()+" ): " +Accounts_information.getAccounts_balance());
                      Accounts_information.setAccounts_balance(Accounts_information.getAccounts_balance()-AmountOfMoney); // make balance of first account subtract from amount 
                      System.out.println("Money after transfer from in account number( "+Accounts_information.getAccount_unqiue_Number()+" ): " +Accounts_information.getAccounts_balance());
                      System.out.println("Money befor transfer to in account number( "+Accounts_information_.getAccount_unqiue_Number()+" ): " +Accounts_information_.getAccounts_balance());
                      Accounts_information_.setAccounts_balance(Accounts_information_.getAccounts_balance()+AmountOfMoney); // make balance of second account add to amount
                      System.out.println("Money after transfer to in account number( "+Accounts_information_.getAccount_unqiue_Number()+" ): " +Accounts_information_.getAccounts_balance());
                      System.out.println("Money transferd successful");  // print succes if transfer done
                      Transactions_Information.add(transfer_information);  // add the transfer opration to list 
                    
                     
                       
                  }
                  return Accounts_information_.getAccounts_balance(); // return balance of an account two
              }
                //make a method to know the maxmum transfer information
                public static void MaxTransfer(AccountsInformation Accounts_information,AccountsInformation Accounts_information_A,double AmountOfMoney){
                    System.out.println();
                    System.out.println("      ****************************     ");
                    System.out.println();
                
                    String Trans_account=Accounts_information.getAccount_unqiue_Number();  //make avriable to set the account number of first account on it
                    String Trans_Account=Accounts_information_A.getAccount_unqiue_Number();  //make avriable to set the account number of second account on it
                    if(max_tran<=AmountOfMoney){  //make a condition to check every time happen transfer if first transfer bigger than second and like that
                     max_tran=AmountOfMoney; //put amount in max variable to print it
                     String Account = Trans_account;     //set the account number in another variable to print it
                     String Account_1 = Trans_Account;  //set the account number in another variable to print it
                     System.out.println("The maximum amount transfered from account number ( "+Account+" ) to account number ( "+Account_1+" ) with amount: "+max_tran);
                  
                     
                 }
                 else{ //if codition not happen
                     Trans_account = null;   //make the variable take defult value
                     Trans_Account= null;  //make the variable take defult value
                 }
                 

}
                    //make a method to sort the civil id in list then print the information about custmor in text file
                public static void printList(ArrayList<AccountsInformation> Account_Information){
                          Collections.sort(Account_Information, new Comparator<AccountsInformation>(){     // to sort civil id into list use comparator method and collections choose sort
                          public int compare(AccountsInformation CivilId1 ,AccountsInformation CivilId2){
                          return Integer.valueOf(CivilId1.getAccounts_holder_Information().getCivil_id().compareTo(CivilId2.getAccounts_holder_Information().getCivil_id()));
                            }
                            });
                         try{    // use try and catch for exception  file not found
                            File AccountS = new File("C:\\Users\\Hp\\Documents\\NetBeansProjects\\Rawan_ramadan_2051711254\\two collection\\Account collection.txt"); //put the loction of file
                            PrintWriter AccountPr = new PrintWriter(AccountS);  // import print writer to write into text file open the stream
                            for(AccountsInformation informationAccount: Account_Information)  //make loop to print the information about account 
                            AccountPr.println(informationAccount);    //print account information into text file
                            AccountPr.close();    //close stream print writer
                            }
                            catch(IOException obj_notFound){   //if loction of file not found will print error
                          System.out.println("There is an error while print the list into text file: "+obj_notFound);
      }
                         //make method to print information about transaction into text file
}               public static void printList2(ArrayList<TransactionsInformation> Transactions_Information){
                           try{  // use try and catch for exception  file not found
                            File TransactionS = new File("C:\\Users\\Hp\\Documents\\NetBeansProjects\\Rawan_ramadan_2051711254\\two collection\\Transactions collection.txt"); //put the loction of file
                            PrintWriter transactionPr = new PrintWriter(TransactionS); // import print writer to write into text file open the stream
                            for(TransactionsInformation informationtransaction: Transactions_Information) //make loop to print the information about transaction 
                            transactionPr.println(informationtransaction);   //print transaction information into text file
                            transactionPr.close();    //close stream print writer
                            }
                            catch(IOException obj_notFound){ //if loction of file not found will print error
                          System.out.println("There is an error while print the list into text file: "+obj_notFound);
    
}

                }
} //end of class