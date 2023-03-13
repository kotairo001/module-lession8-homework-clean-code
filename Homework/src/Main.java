import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int number = input.nextInt();
        System.out.println("Test: " + FizzBuzz.fizzBuzz(number));
    }
}
