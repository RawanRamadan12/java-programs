
package tma_rawan;

import java.util.Scanner; //Import scanner.
public class Tma_Rawan {  // The start of class called Tma_Rawan.

    
     public static void main(String[] args) {  //The start of the main method.
         // Prompt scanner.
        Scanner tma_rawan = new Scanner(System.in); 
        // Variable declartion and initialization.
        String cities;
        int nofc, nofp , UnderWeight=0, Normal=0 , OverWeight=0 ,Obese=0, AllPersons=0  ;
        double Percent_ratio_for_BmiCategory,max_normal=0,max_obese=0,min_underweight=100;
        String  city_max_normal="";
        String  city_max_obese=""; 
        String  city_min_underweight="";
        //  Take from user number of cities.
        System.out.println("please enter number of cities: ");
         nofc=tma_rawan.nextInt();
         System.out.println();
         //  Take from user number of cities bigger or equal 6 in the case of entering a number less than 6.
        while (nofc<6)
         { // Start loop.
         System.out.println("please enter number equal 6 or more of cities: ");
         nofc=tma_rawan.nextInt();
         System.out.println();
         } //End loop.
         
            System.out.println("        ***-----------------------------***       ");
            System.out.println("        ***-----------------------------***      ");
            System.out.println();
           for(int r=0;r<nofc;r++) // Start first loop.
           {
              int  Under_Weight=0 , NormaL=0 , Over_Weight=0 ,ObesE=0  ;
              //Take from user name of cities.
              System.out.println("please enter name of  city: ");  
              cities=tma_rawan.next();
              //Take from user number of persons.
              System.out.println("please enter number of persons for " + cities + " city:  ");
              nofp=tma_rawan.nextInt();
              AllPersons+=nofp; //variable for count persons in all cities.
              //Take from user number of persons bigger or equal 10 in the case of entering a number less than 10.
            while (nofp<10)
             { //Start loop.
             System.out.println("please enter number equal 10 or more of persons: ");
             nofp=tma_rawan.nextInt();
            
              } //End loop.
               for (int a=0 ; a<nofp ;a++) //  Start second loop.
               {
                   //variable declaration.
                   
                    double Mass , Height , BmiValue;
             
              
              //Take from user mass (kg) of persons. 
              System.out.println("please enter Mass(kg) of persons: " );  
              Mass=tma_rawan.nextDouble();
              //Take from user height (cm) of persons.
              System.out.println("please enter Height(cm) of persons: ");  
              Height=tma_rawan.nextDouble();
              // Convert height from (cm) to (m)
               Height/=100;   
              // Compute bmi value.
              BmiValue=Mass/Math.pow(Height, 2);   
              // Print the answer of bmi value.
              System.out.printf("Bmi Value is %.2f (kg/m2) %n ",BmiValue ,"%n");
              //Print bmi catgory for persons.
              if(BmiValue<18.5 && BmiValue>0)
              {
             System.out.println("Bmi catgory for this person is : UnderWeight  ");
              UnderWeight++; //Increment vairable.
              Under_Weight++;  //Increment vairable.
              }
               if(BmiValue>=18.5 && BmiValue<25)
              {
             System.out.println("Bmi catgory for this person is : Normal  ");
              Normal++; //Increment vairable.
              NormaL++; //Increment vairable.
              }
                if(BmiValue>=25 && BmiValue<30)
              {
             System.out.println("Bmi catgory for this person is : OverWeight  ");
              OverWeight++;  //Increment vairable.
              Over_Weight++;  //Increment vairable.
              }
                if(BmiValue>=30)
              {
             System.out.println("Bmi catgory for this person is : Obese  ");
              Obese++; //Increment vairable.
              ObesE++; //Increment vairable.
             
               
              } 
                System.out.println();
                System.out.println("        ***-----------------------------***       ");
                System.out.println("        ***-----------------------------***      ");
                System.out.println();
       } // End second loop.
                
                //FOR EACH CITY.
                // print number of persons. 
                System.out.println("The number of person is : "+nofp);
                System.out.println();
                System.out.println();
                //Print number of pepole for bmi catgory called under weight.
                System.out.println("Number of persons have under weight Bmi catgory  "+Under_Weight );
                //Compute percent ratio of persons for bmi catgory called under weight.
                Percent_ratio_for_BmiCategory =(Under_Weight*100)/ nofp;
                // Make condition to know where city have minimum percent of under weight and percent ratio for these people.
                if(Percent_ratio_for_BmiCategory< min_underweight)
                {
                min_underweight=Percent_ratio_for_BmiCategory; //Percent ratio for these people.
                 city_min_underweight=cities; //Name of city have minimum percent.
                }
                //Print answer percent ratio of persons for bmi catgory called under weight.
                System.out.printf("percent ratio for under weight is : %.1f %% " ,Percent_ratio_for_BmiCategory);
                System.out.println();
                System.out.println();
                //Print number of pepole for bmi catgory called normal.
                System.out.println("Number of persons have normal Bmi catgory  "+ NormaL);
                //Compute percent ratio of persons for bmi catgory called  normal.
                Percent_ratio_for_BmiCategory=(NormaL*100)/ nofp;
                // Make condition to know where city have maximum percent of normal and percent ratio for these people.
                if(Percent_ratio_for_BmiCategory>max_normal)
                {
                max_normal=Percent_ratio_for_BmiCategory; //Percent ratio for these people.
                  city_max_normal = cities; //Name of city have maximum percent.
                }
                //Print answer percent ratio of persons for bmi catgory called normal.
                System.out.printf("percent ratio for normal is : %.1f %% " ,Percent_ratio_for_BmiCategory);
                System.out.println();
                System.out.println();
                 //Print number of pepole for bmi catgory called over weight.
                System.out.println("Number of persons have over weight  Bmi catgory  "+ Over_Weight);
                 //Compute percent ratio of persons for bmi catgory called over weight.
                Percent_ratio_for_BmiCategory =(Over_Weight*100)/ nofp;
                //Print answer percent ratio of persons for bmi catgory called over weight.
                System.out.printf("percent ratio for over weight is : %.1f %% " ,Percent_ratio_for_BmiCategory);
                System.out.println();
                System.out.println();
                //Print number of pepole for bmi catgory called obese.
                System.out.println("Number of persons have obese Bmi catgory  "+ ObesE);
                //Compute percent ratio of persons for bmi catgory called obese.
                Percent_ratio_for_BmiCategory =(ObesE*100)/ nofp ;
                // Make condition to know where city have maximum percent of obese and percent ratio for these people.
                if(Percent_ratio_for_BmiCategory>max_obese)
                {
                max_obese=Percent_ratio_for_BmiCategory; //Percent ratio for these people.
                 city_max_obese=cities;  //Name of city have maximum percent.
                }
                //Print answer percent ratio of persons for bmi catgory called obese.
                System.out.printf("percent ratio for obese is : %.1f %% " ,Percent_ratio_for_BmiCategory);
                System.out.println();
                System.out.println();
                System.out.println("         ***-----------------------------***       ");
                System.out.println("         ***-----------------------------***       ");
                System.out.println();
     
      
        
           } // End first loop.
                System.out.println("  **---------------summary report----------------***  ");
                System.out.println();
                System.out.println("         ***-----------------------------***       ");
                System.out.println("         ***-----------------------------***       ");
                System.out.println();
     
                // ALL CITIES.
                //Print number of cities.
                System.out.println("The number of cities is : "+nofc);
                System.out.println();
                //Print number of persons.
                System.out.println("The number of persons in all cities is : " + AllPersons);
                System.out.println();
                System.out.println();
                //Print number of persons for bmi catgory called under weight.
                System.out.println("Number of persons have under weight Bmi catgory  "+UnderWeight );
                //Compute percent ratio of persons for bmi catgory called under weight.
                Percent_ratio_for_BmiCategory =(UnderWeight*100)/ AllPersons;
                //Print answer percent ratio of persons for bmi catgory called under weight.
                System.out.printf("percent ratio for under weight is : %.1f%% " ,Percent_ratio_for_BmiCategory);
                System.out.println();
                System.out.println();
                //Print number of persons for bmi catgory called normal.
                System.out.println("Number of persons have normal Bmi catgory  "+ Normal);
                //Compute percent ratio of persons for bmi catgory called normal.
                Percent_ratio_for_BmiCategory=(Normal*100)/ AllPersons;
                //Print answer percent ratio of persons for bmi catgory called normal.
                System.out.printf("percent ratio for normal is : %.1f%% " ,Percent_ratio_for_BmiCategory);
                System.out.println();
                System.out.println();
                //Print number of persons for bmi catgory called over weight.
                System.out.println("Number of persons have over weight Bmi catgory "+ OverWeight);
                //Compute percent ratio of persons for bmi catgory called over weight.
                Percent_ratio_for_BmiCategory =(OverWeight*100)/ AllPersons;
                //Print answer percent ratio of persons for bmi catgory called over weight.
                System.out.printf("percent ratio for over weight is : %.1f%% " ,Percent_ratio_for_BmiCategory);
                System.out.println();
                System.out.println();
                //Print number of persons for bmi catgory called obese.
                System.out.println("Number of persons have obese Bmi catgory  "+ Obese);
                //Compute percent ratio of persons for bmi catgory called obese.
                Percent_ratio_for_BmiCategory =(Obese*100)/ AllPersons;
                //Print answer percent ratio of persons for bmi catgory called obese.
                System.out.printf("percent ratio for obese is : %.1f %% " ,Percent_ratio_for_BmiCategory);
                System.out.println();
                System.out.println();
                System.out.println("         ***-----------------------------***      ");
              
               
                
             
                System.out.println("         ***-----------------------------***       ");
                 System.out.println();
                 //Print name of city that have maximum normal percent and print these perecent.
                System.out.printf("Name of the best city which has the maximum percent of persons in normal: %s %n people’s percent ratio: %.1f %% %n " , city_max_normal 
                  , max_normal );
                 System.out.println();
                 //Print name of city that have maximum obese percent and print these perecent.
                System.out.printf("Name of the best city which has the maximum percent of persons in  obese : %s %n  people’s percent ratio: %.1f %% %n " ,city_max_obese  ,
                   max_obese );
                 System.out.println();
                 //Print name of city that have minimum over weight percent and print these perecent.
                System.out.printf("Name of the best city which has the minmum percent of persons in under weight: %s %n people’s percent ratio: %.1f %% %n " , city_min_underweight ,
                  min_underweight );
                 System.out.println();
                 System.out.println("         ***-----------------------------***      ");
                 System.out.println("         ***-----------------------------***       ");
                 System.out.println();
} // End main method.
} // End of class called Tma_Rawan.