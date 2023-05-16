
package rawan_ramadan_2051711254;

import java.util.*;  ////import from java library 


public class TestAllBank { //start of test class
    public static void main(String[] args) {  //start of main method
        Scanner BankTma=new Scanner (System.in);  // implement scanner
        //Create variables and give them default values ​​with Create two array list and implement them and date
         ArrayList<AccountsInformation> Account_List=new ArrayList<AccountsInformation>();
        ArrayList<TransactionsInformation> Transactions_List=new ArrayList<TransactionsInformation>();
        String NameOfCustmor=null,CivilOfCustmor=null,FamilyOfcustmor=null,GovernorateOfCustmor=null,AccountNumbers=null;
        int YearOfBirth=0;
       double AccountBalance=0, Max_tran=0;
        Date DateTransactions =new  java.util.Date();
       
        for (int i = 0; i < 5; i++) {  //start loop to make 3 account with check if the user tries to do an operation that could violate the state of objects
        System.out.println("Hello, do you want creat an account or you already have one?  (yes) for creat an account or (no) if you already have.");
        String Answer = BankTma.next(); // input yes or no if yes will creat a new account else will go to transaction
        System.out.println("Please enter your national id: ");
          CivilOfCustmor=BankTma.next(); //input the national id
          if("yes".equals(Answer)){  //creat an account because answer is yes
           
       
          for (AccountsInformation civilId: Account_List) {  //make a loop to check if the national id enter twice or not (it is not allowed for a holder to have more than one account)
                        
            if(CivilOfCustmor.equals(civilId.getAccounts_holder_Information().getCivil_id())){ //if the civil id enter twice will print erorr

             System.out.println( "Error you already have an account, your account number is:  "+civilId.getAccount_unqiue_Number());
             Answer="no"; //go to transactions if the answer is no or enter civil id twice
            }
            
             }
             if ( "yes".equals(Answer)){  // creat an account
             System.out.println("Please enter your name: ");
             NameOfCustmor=BankTma.next(); //input the name of holder
             System.out.println("Please enter your family name: ");
             FamilyOfcustmor = BankTma.next();  //input the family name of holder
             System.out.println("Please enter your governorate: ");
             GovernorateOfCustmor= BankTma.next();   //input the governorate of holder
             System.out.println("Please enter the year of birth: ");
             YearOfBirth=BankTma.nextInt();   // enter the year of birth
             System.out.println("Please enter the amount of money to open an account: ");
             AccountBalance=BankTma.nextDouble(); //input the amount of money to open an account
             HolderInformation Custmors =new HolderInformation(CivilOfCustmor,NameOfCustmor,FamilyOfcustmor,GovernorateOfCustmor,YearOfBirth); //creat an object from holder class and put the information about holder in constructor
             AccountsInformation Accounts =new AccountsInformation("",AccountBalance,Custmors);  //creat an object from class account and put the information about custmor in constructor
             MainJobOfBank.creat_AccountId_(Custmors, Accounts, Account_List);  //call the method creat an account from class main job and give their attribute
             System.out.println();
             System.out.println("      ****************************     ");
             System.out.println();
             System.out.println("If you want to make any transactions please enter (yes) to exit enter (no)");
             String AnswerTwo=BankTma.next();  //if the user want to make transaction after creat an account should answer yes if he answer no go to next user
             
             if("yes".equals(AnswerTwo)){ //if user answer yes
                    System.out.println();
                    System.out.println("      ****************************     ");
                    System.out.println();
                    System.out.println("If you want to make a deposit please enter (yes) if not enter (no)");
                    String AnswerThree=BankTma.next(); // if user want to make a deposit should answer yes if not go to next type of transaction
                    if("yes".equals(AnswerThree)){
                     DepositInformation  DepositMoney =new DepositInformation (DateTransactions,Accounts);  // creat an object have type deposit and give its attribute
                     System.out.println("How mush money you want to deposit");
                     double AmountOfMoney=BankTma.nextDouble(); //input the amount of money to make deposit
                     MainJobOfBank.depositMoney(DepositMoney, AmountOfMoney, Transactions_List, Accounts);// call the method deposit and give its attribute
                     
                     
                       }
                        System.out.println();
                        System.out.println("      ****************************     ");
                        System.out.println();
                        System.out.println("If you want to make a withdrawal please enter (yes) if not enter (no)");
                        String AnswerFour=BankTma.next(); // if user want to make a withdrawal should answer yes if not go to next type of transaction
                        if("yes".equals(AnswerFour)){
                        WithdrawalInformation  WithdrawalMoney =new  WithdrawalInformation (DateTransactions,Accounts);// creat an object have type withdrawal and give its attribute
                        System.out.println("How mush money you want to withdrawal: ");
                        double   AmountofMoney=BankTma.nextDouble();  //input the amount of money to make withdrawal
                        MainJobOfBank.withdrawlMoney(WithdrawalMoney , AmountofMoney, Transactions_List, Accounts);   // call the method withdrawal and give its attribute
                        }
                        System.out.println();
                        System.out.println("      ****************************     ");
                        System.out.println();
                        System.out.println("If you want to make a transfer please enter (yes) if not enter (no)"); // if user want to make a transfer should answer yes if not go out and go next user
                        String AnswerFive=BankTma.next();
                        if("yes".equals(AnswerFive)){ //if yes 
                        System.out.println("Please enter the civil id to which you want to send money: "); //input the civil id that user want to transfer money to
                        String Civil =BankTma.next();
                        if(Civil.equals(CivilOfCustmor)){ //if user enter his civil id to transfer money to him self
                        System.out.println("Error, you cannot transfer money to yourself"); //print error
                        
                        }
                        else{ //if user enter another civil id to transfer money to this civil money
                        for (int j=0; j<Account_List.size();j++) {  //make loop to check if civil id is already in list 
                        AccountsInformation Account = Account_List.get(j);  //make an object have account type 
                        String Civill = Account.getAccounts_holder_Information().getCivil_id(); //get the civil id and save it in variable 
                        if(Civil.equals( Civill)){ // when civil id that user enter found in list
                            
                        TransferInformation transfer_information =new TransferInformation(DateTransactions,Accounts);  // creat an object have type transfer and give its attribute
                        System.out.println("Please enter amount of money you want to transfer: ");
                        double AnswerSix = BankTma.nextDouble(); //input the amount of money to make transfer
                        MainJobOfBank.transferMoney(transfer_information, AnswerSix , Transactions_List, Accounts, Account); // call the method transfer and give its attribute
                        MainJobOfBank.MaxTransfer(Accounts, Account, AnswerSix);  // call the method that get the maximum transfer between two account and give its attribute
                        break; 
                        }
                        else{ //if user enter civil id and not found list
                        int Counter= j+1;  //make counter to see if civil id in list
                        if(Counter==Account_List.size()){ 
                        System.out.println("Error account not found"); // if civil id enter not found print error 
                        }
                        }
                        }
                        }
                        
                        }
             }
                        System.out.println();
                        System.out.println("      ****************************     ");
                        System.out.println();
             }
                        
        }
            if("no".equals(Answer)){ //if user enter no and have an account go to transacton and if user say yee and enter civil id already define print error and go to transaction
                for (int j=0; j<Account_List.size();j++) { 
              
                   
                        AccountsInformation Accounts = Account_List.get(j);  //check if civil id is already in list
                        String civilID = Accounts.getAccounts_holder_Information().getCivil_id();
                        if(civilID.equals(CivilOfCustmor)){
                        System.out.println(" This is your account number: "+ Accounts.getAccount_unqiue_Number());
                        System.out.println();
                        System.out.println("      ****************************     ");
                        System.out.println();
                        System.out.println("If you want to make any transactions please enter (yes) to exit enter (no)"); 
                        String AnswerFive=BankTma.next(); //if the user want to make transaction after check the civil id should answer yes if he answer no go to next user
                        if("yes".equals(AnswerFive)){
                        System.out.println();
                        System.out.println("      ****************************     ");
                        System.out.println();
                        System.out.println("If you want to make a deposit please enter (yes) if not enter (no)");
                        String AnswerSix=BankTma.next(); // if user want to make a deposit should answer yes if not go to next type of transaction
                        if("yes".equals(AnswerSix)){
                        DepositInformation  DepositMoney =new DepositInformation (DateTransactions,Accounts); // creat an object have type deposit and give its attribute
                        System.out.println("How mush money you want to deposit");
                       double AmounMoney=BankTma.nextDouble(); //input the amount of money to make deposit
                        MainJobOfBank.depositMoney(DepositMoney, AmounMoney, Transactions_List, Accounts); // call the method deposit and give its attribute
                        }
                        System.out.println();
                        System.out.println("      ****************************     ");
                        System.out.println();
                        System.out.println("If you want to make a withdrawal please enter (yes) if not enter (no)");
                        String AnswerSeven=BankTma.next(); // if user want to make a withdrawal should answer yes if not go to next type of transaction
                        if("yes".equals(AnswerSeven)){
                        WithdrawalInformation  WithdrawalMoney =new  WithdrawalInformation (DateTransactions,Accounts); // creat an object have type withdrawal and give its attribute
                        System.out.println("How mush money you want to withdrawal: ");
                        double AmountMoney=BankTma.nextDouble(); //input the amount of money to make withdrawal
                        MainJobOfBank.withdrawlMoney(WithdrawalMoney , AmountMoney, Transactions_List, Accounts);   // call the method withdrawal and give its attribute
                        }
                        System.out.println();
                        System.out.println("      ****************************     ");
                        System.out.println();
                        System.out.println("If you want to make a transfer please enter (yes) if not enter (no)");
                        String AnswerEgiht=BankTma.next();  // if user want to make a transfer should answer yes if not go out and go next user
                        if("yes".equals(AnswerEgiht)){
                        System.out.println("Please enter the civil id to which you want to send money: ");  //input the civil id that user want to transfer money to him
                        String Civil =BankTma.next();
                        if(Civil.equals(CivilOfCustmor)){ //if user enter his civil id to transfer money to him self
                        System.out.println("Error, you cannot transfer money to yourself"); //print error
                        
                        }
                        else{ //if user enter another civil id to transfer money to this civil money
                        for (int r=0; r<Account_List.size();r++) {  //make loop to check if civil id is already in list 
                        AccountsInformation Account = Account_List.get(r); //make an object have account type
                        String Civill = Account.getAccounts_holder_Information().getCivil_id(); //get the civil id and save it in variable
                        if(Civil.equals( Civill)){  // when civil id that user enter found in list
                  
                        TransferInformation transfer_information =new TransferInformation(DateTransactions,Accounts); // creat an object have type transfer and give its attribute
                        System.out.println("Please enter amount of money you want to transfer: ");
                        double AnswerNine = BankTma.nextDouble();  //input the amount of money to make transfer
                        MainJobOfBank.transferMoney(transfer_information, AnswerNine , Transactions_List, Accounts, Account); // call the method transfer and give its attribute
                        MainJobOfBank.MaxTransfer(Accounts, Account, AnswerNine); // call the method that get the maximum transfer between two account and give its attribute
                        break;
                        }
                        else{ //if user enter civil id and not found list
                        int Counter= r+1;  //make counter to see if civil id in list
                        if(Counter==Account_List.size()){ 
                        System.out.println("Error account not found"); // if civil id enter not found print error 
                        }
                        }
                        }
                }
            }
                }
                        System.out.println();
                        System.out.println("      ****************************     ");
                        System.out.println();
        }
  
               
                }
                
}
}
        
         
         MainJobOfBank.printList(Account_List);  // call method that print information about account into text file and sort civil id
         MainJobOfBank.setAccount_Information(Account_List); //set the list that have information about account in list in class main job
         System.out.println( MainJobOfBank.getAccount_Information());  //print list in main job class
         System.out.println("       *************************     "); 
         MainJobOfBank.printList2(Transactions_List);  // call method that print information about transactions into text file
         MainJobOfBank.setTransactions_Information(Transactions_List); //set the list that have information about transactions in list in class main job
         System.out.println( MainJobOfBank.getTransactions_Information()); //print list in main job
    } //end of main method
} //end of class test
      
    
        

             
       
         
            
        
       
        
         
   
    
                 
                
       
        
        
        
       
    
    

