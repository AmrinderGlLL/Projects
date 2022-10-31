import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    
    String decision = scan.nextLine();
       if(decision.equals("yes")){
        System.out.println("Great!");
        System.out.println("rock ? paper ? scissors, shoot!");
        String yourChoice = scan.nextLine();

        String compterChoice = computerChoice();

        String result = result(yourChoice, compterChoice);
        printResult(yourChoice, compterChoice, result);


       } else{
        System.out.println("Darn, some other time...! ");
       }

 
        scan.close();
    }
        public static String computerChoice(){
            double random = Math.random() * 3;
            int ranInt = (int)random;
            if(ranInt==0){
                return "rock";
            }
            else if(ranInt==1){
                return "paper";
            }
            else{
                return "scissors";
            }

        }

    

    public static String result(String yourChoice, String computerChoice) {
        String result = "";
         if(yourChoice.equals("rock") &&  computerChoice.equals("scissors")){
            result =  "you win";
         }
         else if(yourChoice.equals("paper") && computerChoice.equals("rock")){
            result =  "you win";
         } 
         else if(yourChoice.equals("scissors") && (computerChoice.equals("paper"))){
            result =  "you win";
         }
         if(computerChoice.equals("rock") && ( yourChoice.equals("scissors"))){
            result =  "you lose";
         }
         else if(computerChoice.equals("paper") && (yourChoice.equals("rock"))){
            result =  "you lose";
         } 
         else if(computerChoice.equals("scissors") && (yourChoice.equals("paper"))){
            result =  "you lose";
         }
            else {
            System.out.println("It's a tie");
           } 
         
        return result;
      }
 
  
    public static void printResult(String yourChoice, String computerChoice, String result){
      System.out.println("\nYou chose:\t"+ yourChoice);
      System.out.println("Computer chose:\t"+computerChoice);
      System.out.println(result);
 }
}

