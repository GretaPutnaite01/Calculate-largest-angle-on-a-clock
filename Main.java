// uulib.Console allows to take in user input
import uulib.Console; 

public class Main {

    public static double calculateAngle(double hour, double min) {

        // calculation for both the hour and minute angles
        double hourAngle = (hour % 12 + (float) min/ 60) * 30; 
        double minAngle = min * 6; 
        
        // math.abs returns the absolute value
        double angle = Math.abs(hourAngle - minAngle);

        // calculating the larger angle
        if (angle < 180) angle = 360 - angle;
        
        return angle;
    }
    
     public static void main (String[] args) {
        
        // user input
        double hour = Console.getInt("Enter Hour: ");
        double minute = Console.getInt("Enter Minutes: ");

        // dealing with invalid input
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59) {
            System.out.println("Invalid input please enter again");
            hour = Console.getInt("Enter Hour: ");
            minute = Console.getInt("Enter Minutes: ");
        }
        
        // printing the final result
        System.out.print("The biggest angle is ");
        System.out.println(calculateAngle(hour, minute)+" degrees");

    }
}
