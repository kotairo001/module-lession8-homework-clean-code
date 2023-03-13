import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the first number");
        int firstOperand = input.nextInt();
        System.out.println("Input the second number");
        int secondOperand = input.nextInt();
        System.out.println("Input the operator");
        char operator = '*';
        System.out.println( Calculator.calculate(firstOperand, secondOperand,operator));

    }
}
