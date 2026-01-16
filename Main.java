import java.util.Random;
import java.util.Scanner;
import java.util.random.*;;

// public class Main {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

// public class Main{
//     public static void main(String[] args) {
//     int age = 25;
//     String StudentName ="Halleluyah";
//     System.out.println(StudentName + " is " + age + " years old."); 
//     }
// }

// public class Main {
// public static void main(String[] args) {
//     int foodMoney = 500;
//     int transportMoney = 300;
//     int sum = foodMoney + transportMoney;
//     System.out.println("The total money spent is: " + sum);
// }
// }

// public class Main {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter the amount you want to save: ");
//         int amount1 = input.nextInt();
//         System.out.println("Enter the amount you want to save: ");
//         int amount2 = input.nextInt();
//         int sum = amount1 + amount2;
//         System.out.println("The total money saved is: " + sum);
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int richMan = 1000000;
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter your saving amount: ");
//         int saving = input.nextInt();
//         if (saving >= richMan) {
//             System.out.println("You are a rich person.");
//         } else {
//             System.out.println("You need to work harder.");
//         }
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         int month = 12;
//         while (month >= 0) {
//             if (month > 0) {
//                 System.out.println(month);
//             }else {
//                 System.out.println("Happy New Year!");
//             }            
//             month--;
//         }
//     }
// }

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt((50));

        System.out.println(randomNumber);
    }
}