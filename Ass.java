import java.util.Scanner;

public class Ass {
    public static int addNumber(int a, int b) {
        return a + b;
    }

    public static int SubNumber(int a, int b) {
        return a - b;
    }

    
    public static int Division(int a, int b) {
        return a / b;
    }

    public static int Multiplication (int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        System.out.println("Enter a number:");
        int firstNumber = inputs.nextInt();

        System.out.println("enter new number");
        int secondNumber = inputs.nextInt();

        System.out.println("your Answe is " + addNumber(firstNumber, secondNumber));
        System.out.println("your Answe is " + SubNumber(firstNumber, secondNumber));
        System.out.println("your Answe is " + Division(firstNumber, secondNumber));
        System.out.println("your Answe is " + Multiplication(firstNumber, secondNumber));

        inputs.close();
    }

}
