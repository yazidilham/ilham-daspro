import java.util.Scanner;
/**
 * assignment02
 */
public class assignment02 {

        static Scanner scanner = new Scanner(System.in);
        static String[] fruits = {"Apple", "Orange", "Grape", "Kiwi", "Guava"};
        static int[][] salesData = new int[7][fruits.length];
        
        public static void main(String[] args) {
            inputData();
            displayAllData();
            int bestDay = findBestDay();
            System.out.println(" The day wuth the highest sales is day" + (bestDay));
            displayBestSellingFruits(bestDay);
        }
        static void inputData() {
            for (int i = 0; i < salesData.length; i++) {
                System.out.println("Enter fruit sales data for day" + (i + 1));
                for (int j = 0; j < fruits.length; j++) {
                    System.out.print(fruits[j] + ": ");
                    salesData[i][j] = scanner.nextInt(); 
                }
            }
        }
        static void displayAllData() {
            System.out.println("\nDisplaying all fruit sales data:");
            for (int i = 0; i < salesData.length; i++) {
                System.out.print("Day " + (i + 1) + ": ");
                for (int j = 0; j < fruits.length; j++) {
                    System.out.print(fruits[j] + "=" + salesData[i][j] + ":");
                }
            }
        }
    }
