    import java.util.Scanner;

public class Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the total number of students that took the test: ");
        int totalStudents = input.nextInt();

        int highestScore = 0;
        int studentIndex = 0;

        for (int i = 1; i <= totalStudents; i++) {
            System.out.print("Input the score of student " + i + ": ");
            int studentScore = input.nextInt();

            if (studentScore > highestScore) {
                highestScore = studentScore;
                studentIndex = i;
            }
        }

        System.out.println(
            "Congratulations to student " + studentIndex +
            "! He got the first position with a score of " + highestScore
        );
        input.close();
    }
}

