import java.util.Scanner;

import javax.swing.text.Position;

/**
 * WhileOvertimePay02
 */
public class WhileOvertimePay02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numEmployee = 0;
        int overtimeHours = 0;
        double overtimePay = 0.0;
        double totalOvertimePay = 0.0;
        String position;

        System.out.println("Employee number = ");
        numEmployee = input.nextInt();

        int i=0;
        while(i<numEmployee){
            System.out.println("Position of employee "+(i+1)+" (director, manager, staff) = ");
            position = input.next();
            System.out.println("Employee "+(i+1)+" overtime hours = ");
            overtimeHours = input.nextInt();
            i++;

            if(position.equalsIgnoreCase("director")){
                continue;
            }else if (position.equalsIgnoreCase("manager")) {
                overtimePay=overtimeHours*100000;
            }else if (position.equalsIgnoreCase("staff"))
                overtimePay=overtimeHours*75000;
            }

            totalOvertimePay += overtimePay;

        System.out.println("Total of Overtime pay = "+totalOvertimePay);
                
            }
        }

