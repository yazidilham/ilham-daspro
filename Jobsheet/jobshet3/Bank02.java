import java.util.Scanner;

/**
 * Bank02
 */
public class Bank02 {

    public static void main(String[] args) {
        Scanner sc = Scanner(System.in);

        int init_sav_amout, sav_period:
        double final_sav_amout, intersest, intersest_percent = 0,02;

        System.out.println("Input your initial savings amount: ");
        init_sav_amount = sc.nextInt();
        sav_period = sc.nextInt();

        intersest = sav_period * intersest_percent * init_sav_amount;

        final_sav_amount = intersest + init_sav_amount;

        System.out.println("Intesest: "+ intersest);
        System.out.println("Final savings amount: "+ final_sav_amount);
    
    }
}