import java.util.Scanner;

public class GuessingGame  {
    public static void main(String[] args) {

        double randomNum = Math.random()*10;
        int secretNumber = (int)randomNum+1;

       System.out.print("I chose a number between 1 and 10. Try to guess it: ");
        
       Scanner scan = new Scanner(System.in);
       int gussedNumber = scan.nextInt();

           while(gussedNumber!=secretNumber){
            System.out.println("Guess again");
            gussedNumber = scan.nextInt();
           }

           System.out.println("You got it");
             
        scan.close();
    }

}
