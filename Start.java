import java.util.Scanner;

public class Start{

public static void main (String Software[]){

    

   do { 

    try {
        
   

    Scanner ObjectScanner =new Scanner(System.in);

    System.out.println("Enter first number");
    double FirstNumber = ObjectScanner.nextDouble();

    System.out.println("Enter second number");
    double SecondNumber = ObjectScanner.nextDouble();

    System.out.println("Enter operand");
    char Op = ObjectScanner.next().charAt(0);


    if (Op == '+') {

        System.out.println("The result of the operation is " + (FirstNumber + SecondNumber));
        
    } else {
        
    }

} catch (Exception e) {
    System.out.println(e);
}
       
   } while (true);
    
    
}


}