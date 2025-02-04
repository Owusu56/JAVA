
// import java.util.Scanner;

// public class Project {

//     public static void main (String Software[]){

//     Scanner Input = new Scanner(System.in);

//     System.out.println("Input a Value");

//     int EvenOrOdd = Input.nextInt();
//     int even = EvenOrOdd % 2;

//     if (even == 0) {
//         System.out.println("This is an even number");
    
//     }else{
//         System.out.println("This is an odd number");
//     }

//     }
    
// }


// import java.util.Scanner;

// public class Work {

//     public static void main (String Software[]){

//     Scanner Input = new Scanner(System.in);

//     System.out.println("Input a Value");

//     int PositiveOrNegative = Input.nextInt();
    
//     // int Positive = PositiveOrNegative = 0;

//     if (PositiveOrNegative >= 0){
//         System.out.println("This is an Positve number");
    
//     }else{
//         System.out.println("This is an Negative number");
//     }

//     }
    
// }

// public class Work {
//     public static void main(String[] args) {
//         int num1 = 10;
//         int num2 = 20;
//         int num3 = 30;

//         int greatest = num1;

//         if (num2 > greatest) {
//             greatest = num2;
//         }

//         if (num3 > greatest) {
//             greatest = num3;
//         }
//         System.out.println("The greatest number is: " + greatest);
//     }
// }


import java.util.Scanner;

public  class Work {

public static void main(String[] Kay) {


    Scanner ObjectScanner =new Scanner(System.in);

    System.out.println("President's password");
    String President = ObjectScanner.nextLine();

    System.out.println("Vice's password");
    String Vice = ObjectScanner.nextLine();

    System.out.println("Speaker's password");
    String Speaker = ObjectScanner.nextLine();

    Boolean P = President.equals("123aba");
    Boolean V = Vice.equals("12aba");
    Boolean S = Speaker.equals("aba21");




    if (P && (V || S)) {

        System.out.println("Safe open");
        
    } else if (S && (V || P)){

        System.out.println("Safe open");
        
    } else if (V && (P || S)){

        System.out.println("Safe open");
        
    } else {

        System.out.println("Dignitaries Required Are Not Present");
    }
    
}








}
