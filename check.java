public  class check{


public static void main(String[] args) {

    
        // System.out.println(main()[i]);
        
        System.out.println(BigNum(109.4, 207.5, 300.6));
    
}


// public static String[] main() {

//  String Engineers[] = {"Jones", "Giscard", "Kay"};

//  return  Engineers;


// }


public static double BigNum (double num1, double  num2, double  num3) {
    double BigNum = 0.0;

    // num1 = 10.4;
    // num2 = 20.5;
    // num3 = 30.6;
    
    if (num1 > num2 && num1 > num3) {
        BigNum = num1;
    } else if (num2 > num1 && num2 > num3) {
        BigNum = num2;
    } else {
        BigNum = num3;
    }
    return BigNum;
}








}