/**
 * arrayAverageScore02
 */
public class arrayAverageScore02 {

    public static void main(String[] args) {
        int[] score = new int[10];
        double total = 0;
        double average;

        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter student score " + (i+1) + ": ");
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }
        average = total / score.length;
        System.out.println("The class averge score is " + average);

        Enter student score 1: 98
        Enter student score 2: 73
        Enter student score 3: 86
        Enter student score 4: 82
        Enter student score 5: 95
        Enter student score 6: 68
        Enter student score 7: 90
        Enter student score 8: 71
        Enter student score 9: 78
        Enter student score 10: 84
        The class average score is 82,5;
        
    }
}