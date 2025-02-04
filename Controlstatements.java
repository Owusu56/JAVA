
import java.util.Scanner;

public class Controlstatements {
    
    // public static void main(String[] Kay) {
        
    //     Scanner UPI = new Scanner(System.in);

    //     System.out.println("WHAT IS YOUR FAVORITE NUMBER?");
    //     String favorite = UPI.nextLine();

    //     switch (favorite) {
    //         case "1":System.out.println("This is 1 and a lucky number");
    //         break; 
            
    //         case "2":System.out.println("This is 2 and a second chance number");
    //         break;

    //         case "3":System.out.println("This is 3 and a last chance number");
    //         break;
                
    //         default:System.out.println("Undefined");
    //         break;
    //     }
    // }







    public static void main(String[] Kay) {

        char choice ;

        do { 
        
        Scanner UPI = new Scanner(System.in);

        System.out.println("WHAT IS YOUR FAVORITE NUMBER?");
        choice = UPI.nextLine().charAt(0);

        if(choice=='1'){
            System.out.println("This is 1 and a lucky number");
        }
        else if(choice=='2'){
            System.out.println("This is 2 and a second chance number");
        }
        else if(choice=='3'){
            System.out.println("This is 3 and a last chance number");
        }
        else{
            
            System.out.println("Undefined");
        }

    }while(choice != 'x');


 }
 


}
