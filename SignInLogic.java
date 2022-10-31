import java.util.Scanner;

public class SignInLogic {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("• Username: ");
        String usernameinput = scan.nextLine();
        System.out.print("• Password: ");
        String passwordInput = scan.nextLine();



        while(!usernameinput.equals(username) && !passwordInput.equals(password)){
            System.out.println(" \nIncorrect, please try again!\n");
            System.out.print("• Username: ");
            usernameinput = scan.nextLine();
            System.out.print("• Password: ");
            passwordInput = scan.nextLine();
    
        }
             
        System.out.println("\nSign in successful. Welcome!");
    

        scan.close();

        
    }
}
