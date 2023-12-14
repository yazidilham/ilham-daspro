import java.util.Scanner;

/**
 * Experiment3TriangleStar
 */
public class input02 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);
        System.out.println("Input a number = ");
        int number = input02.nextInt();
        if(number%2 == 0){
            System.out.println(number+" is a even number!");
        }else{
            System.out.println(number+" is an odd number!");

        }
    }
}