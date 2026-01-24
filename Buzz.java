public class Buzz {
    
    // Check if a number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    
    // Check if a number is odd
    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }
    
    // FizzBuzz implementation
    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Fizz Buzz";
        } else if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(number);
    }
    
    // Main method to demonstrate
    public static void main(String[] args) {
        // Test odd/even
        System.out.println("3 is even: " + isEven(3));
        System.out.println("3 is odd: " + isOdd(3));
        System.out.println("4 is even: " + isEven(4));
        System.out.println("4 is odd: " + isOdd(4));
        
        // Test FizzBuzz
        System.out.println("\nFizzBuzz Results:");
        System.out.println("Number 3: " + fizzBuzz(3));
        System.out.println("Number 5: " + fizzBuzz(5));
        System.out.println("Number 15: " + fizzBuzz(15));
        System.out.println("Number 7: " + fizzBuzz(7));
    }
}
