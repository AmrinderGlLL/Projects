
import java.util.Scanner; 


public class LeapYear {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int inputYear;
      System.out.println("Enter a year to check if it is leap or not:");
      inputYear = scnr.nextInt();
      String year = "";
      if((inputYear%100)==0){
           if((inputYear%400)==0){
            year  = " - leap year";  
            }
             else{
            year  = " -not leap year";
        }
      }
      else
      if((inputYear%4)==0){
         year  = " - leap year";
      } else
          year =" - not leap year";
      
    
      System.out.print(inputYear);
      System.out.println(year);

      scnr.close();
    }

   }
