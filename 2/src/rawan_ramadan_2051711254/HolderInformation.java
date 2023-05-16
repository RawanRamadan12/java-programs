
package rawan_ramadan_2051711254;


public class HolderInformation {   //make class called holder to get information from custmor to make an account for him
   private String Civil_id;    //make variable to input the national id of custmor
   private String Name_of_Holder;   //make variable to input name of custmor
   private String Family_name;   // make variable to input family name of custmor  (first attribute)
   private String Governorate_holder;  //make variable to input the place where custmor live (second attribute)
   private int Year_of_Birth;   //make variable to input the year of birth for custmor (third attribute)
    
   public HolderInformation(){  //make constructor to initial variables (zero arg-constructor)
       Civil_id=null;           
       Name_of_Holder=null;
       Family_name=null;
       Governorate_holder=null;
       Year_of_Birth=0;
   }
     //make constructor for put value in variable (mult arg-constructer)

    public HolderInformation(String Civil_id, String Name_of_Holder, String Family_name, String Governorate_holder, int Year_of_Birth) {
        this.Civil_id = Civil_id;
        this.Name_of_Holder = Name_of_Holder;
        this.Family_name = Family_name;
        this.Governorate_holder = Governorate_holder;
        this.Year_of_Birth = Year_of_Birth;
    }

    public String getCivil_id() {  //make a getter method to return national id
        return Civil_id;
    }

    public String getName_of_Holder() {   //make a getter method to return name of custmor
        return Name_of_Holder;
    }

    public String getGovernorate_holder() {   //make a getter method to return governorate of custmor
        return Governorate_holder;
    }

    public int getYear_of_Birth() {     //make a getter method to return the year of birth for custmor
        return Year_of_Birth;
    }

    public String getFamily_name() {       // make a getter method to return the family name of custmor
        return Family_name;
    }

    public void setCivil_id(String Civil_id) {     //make a setter method to set national id of custmor
        this.Civil_id = Civil_id;
    }

    public void setName_of_Holder(String Name_of_Holder) {      //make a setter method to set name of custmor
        this.Name_of_Holder = Name_of_Holder;
    }

    public void setFamily_name(String Family_name) {  //make a setter method to set family name of custmor
        this.Family_name = Family_name;
    }

    public void setGovernorate_holder(String Governorate_holder) {   //make a setter method to set governorate of custmor
        this.Governorate_holder = Governorate_holder;
    }

    public void setYear_of_Birth(int Year_of_Birth) {     //make a setter method to set the year of birth for custmor
        this.Year_of_Birth = Year_of_Birth;
    }
    
    
 

       // make a String method to display information about custmor (Holder class)
    public String toString() {
      return " ,  Information about custmor, " + " , the national id: " + Civil_id 
              + " , name: " + Name_of_Holder  + " ,family name: "+Family_name
              +" , place of residence: " + Governorate_holder + " , year of birth: " + Year_of_Birth ;
    }
    
   
    }//end of class
   

