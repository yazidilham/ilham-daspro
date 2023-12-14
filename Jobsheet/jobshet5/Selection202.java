import java.util.Scanner;

/**
 * Experiment2
 */
public class Selection202 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        System.out.println("Nilai uas :");
        float finalExam = input02.nextFloat();
        System.out.println("Nilai uts :");
        Float midExam = input02.nextFloat();
        System.out.println("Nilai kuis :");
        Float quis = input02.nextFloat();
        System.out.println("Nilai tugas :");
        Float assignment = input02.nextFloat();

        float total = (finalExam * 0.4F) + (midExam * 03F) + (quis * 0.1F) + (assignment * 0.2F);

        String message = total < 65 ? "Retake" : "Pass";
         System.out.println("Final Grade = " + total + " and the decission is " + message);

         if (total <= 39) {
            Score = "E"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total <= 50){ Score = "D"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total<=60){ Score = "C"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total<=65){ Score = "C+"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total<=73){ Score = "B"; 
            System.out.println("You Are on Grade  "+Score); 
            }else if(total<=80){ Score = "B+"; 
            System.out.println("You Are on Grade  "+Score);
            }else if(total<=100){ Score = "A"; 
            System.out.println("You Are on Grade  "+Score); 
            
       }
    }
}
         