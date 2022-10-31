import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
       int roll1=  rollDice();
       int roll2 = rollDice();
       int roll3 = rollDice();
      System.out.println("Enter 3 numbers between 1 and 6:");
        int num1 = scan.nextInt(); 
        int num2 = scan.nextInt(); 
        int num3 = scan.nextInt(); 
       
       if(num1<1|| num2<2|| num3<3){
        System.out.println("Numbers can not be less than 1. Shuting the game down....");
         System.exit(0);
         }
         
         if(num1>6|| num2>6|| num3>6){
            System.out.println("Numbers can not be higher than 6. Shuting the game down....");
             System.exit(0);
             }

             int sumOfNumbers = num1+num2+num3;
             int sumOfDicerolls = roll1+roll2+roll3;

             System.out.println("Dice sume = "+sumOfDicerolls+" . Number sum = "+sumOfNumbers);

            if(checkWin(sumOfDicerolls, sumOfNumbers)){
                System.out.println("Congrats, You WIN!");
    
            }
            else{
                System.out.println("Sorry, You lose");
            }


       scan.close();
    }

    
    public static int rollDice(){
        //0-0.99999999999
        double rollNumber = Math.random()*6; // 0-5.9999999999
        rollNumber += 1;  // 1-6.999999999999
        return(int)rollNumber;  //1-6
    }

    public static boolean checkWin(int sumOfDicerolls, int sumOfNumbers){
       return (sumOfNumbers>sumOfDicerolls && (sumOfNumbers - sumOfDicerolls) < 3);
    }
}

