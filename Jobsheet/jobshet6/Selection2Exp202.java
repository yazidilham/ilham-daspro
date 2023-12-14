import java.util.Scanner;

/**
 * Selection2Exp202
 */
public class Selection2Exp202 {

    public static void main(String[] args) {
        Scanner Selection2Exp102 = new Scanner(System.in);
         
        int angle1, angle2, angle3, totalAngle;
        System.out.print("Input angle 1 : ");
        angle1 = Selection2Exp102.nextInt(); 
        System.out.print("Input angle 2 : "); 
        angle2 = Selection2Exp102.nextInt(); 
        System.out.print("Input angle 3 : "); 
        angle3 = Selection2Exp102.nextInt(); 

        totalAngle = angle1 + angle2 + angle3; 
        if (totalAngle == 180) {
            if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                System.out.println("Right Triangle");
            } else if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Equilateral Triangle");
            } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a Triangle");
        }

         totalAngle = angle1 + angle2 + angle3; 
         if (totalAngle==180) { 
             if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
                 System.out.println("Right Triangle"); 
             } else {
                 System.out.println("Not a Right Triangle "); } 
             } else { 
                 System.out.println("Not a Trinagle"); 
             }
    }
}