import java.util.Scanner;

/**
 * Selection3Student02
 */
public class Selection3Student02 {

    public static void main(String[] args) {
        Scanner input02 = new Scanner(System.in);

        double operand1, operand2, result;
        char operator;

        System.out.println("Input operand 1: ");
        operand1 = input02.nextDouble();
        System.out.println("Input operand 2: ");
        operand2 = input02.nextDouble();
        System.out.println("input operator (+ - * /): ");
        operator = input02.next().charAt(0); 

    switch (operator) {
        case '+':
            result = operand1 + operand2;
            System.out.println(operand1 + " + " + operand2 + "=" + result) ;            
            break;
        case '-':
            result = operand1 - operand2;
            System.out.println(operand1 + " - " + operand2 + "=" + result);
            break;
        case '*':
            result = operand1 * operand2;
            System.out.println(operand1 + " * " + operand2 + "=" + result);
            break;
        case '/':
            result = operand1 / operand2;
            System.out.println(operand1 + " / " + operand2 + "=" + result);
            break;

            
            
    }
        
    }
}