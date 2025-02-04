
import java.util.Scanner;

public class count {

    public static void main(String[] args) {
    // private int count;

    // public CountPeople() {
    //     count = 0;
    // }

    // public void personEnters() {
    //     count++;
    //     System.out.println("Person entered. Current count: " + count);
    // }

    // public int getCount() {
    //     return count;
    // }

    // public static void main(String[] args) {
    //     CountPeople counter = new CountPeople();
    //     counter.personEnters();
    //     counter.personEnters();
    //     counter.personEnters();
    //     counter.personEnters();
    //     counter.personEnters();
    //     counter.personEnters();
    //     counter.personEnters();
    //     counter.personEnters();
    //     counter.personEnters();
    //     counter.personEnters();
    //     System.out.println("Total number of people entered: " + counter.getCount());
    // }





    Scanner ObjectScanner = new Scanner(System.in);

    boolean InOrOut;
    boolean MotionSensorOne;
    boolean MotionSensorTwo;
    int i = 0;

do{


  System.out.println("Are you going out???");
InOrOut = ObjectScanner.nextBoolean();

if (InOrOut) {
    System.out.println("Motion one state");
    MotionSensorOne = ObjectScanner.nextBoolean();

System.out.println("Motion two state");
MotionSensorTwo = ObjectScanner.nextBoolean();
    
if (MotionSensorOne==true) {

    if (MotionSensorTwo==true) {
        if (i <= 0) {
            i = 0;
        }else{
            i--;
        }
        
    }
}





} else {


    System.out.println("Motion two state");
    MotionSensorTwo = ObjectScanner.nextBoolean();

System.out.println("Motion one state");
MotionSensorOne = ObjectScanner.nextBoolean();
    
if (MotionSensorTwo==true) {

    if (MotionSensorOne==true) {
        if (i < 0) {
            i = 0;
        }else{
            i++;
        }
       
    }
}

    
}

if (i == 0) {
    System.out.println("Light goes off");
    
} else {
    System.out.println("Light is on");
    System.out.println("The number of poeple in the room are " + i);
    
}

} while (true);


}

}