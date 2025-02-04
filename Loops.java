

public class Loops {
    

    public static void main (String Software[]){

    //  For(Initial;Condition;Update){

    //     Code to be executed
    //  }

   char Numbers[] [] = {
   {'A','B','C','D','E'},
   {'F','G','H','I','J'},
   {'K','L','M','N','O'},
   {'P','Q','R','S','T'},
   {'U','V','W','X','Y'},
   
  };

//    System.out.println(Numbers[0]);

//    int row ;
//    int col;
  
//    for ( row = 0; row < Numbers.length; row++) {

//     for ( col = 0; col < Numbers.length; col++){

//         System.out.println(Numbers[row][col]);
         
//     }
//    }

    //  for (int i = 10; i > 0; i--) {

    //     System.out.println(i +" I have eaten");
         
    //  }

    int i = 0;
    int j = 0;
    

    while (i < Numbers.length){
        
        System.out.println(Numbers[i]);
        char Test[] = Numbers[i];
        System.out.println(Test[j]);
        j = j+ 1;
        System.out.println(Test[j]);
        j = j+ 1;
        System.out.println(Test[j]);
        j = j+ 1; 
        System.out.println(Test[j]);
        j = j+ 1;
        System.out.println(Test[j]);
        j = 0;


        i++;
    }

    }

}
