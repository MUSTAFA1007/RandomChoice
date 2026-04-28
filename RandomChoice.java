import java.util.Scanner;
import java.util.Random;

public class RandomChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int firstCount = 0;
        int secondCount = 0;

        System.out.println("*****************************************");
        System.out.println("*********** Welcome to Random ***********");
        System.out.println("* When you are torn between two choices *");
        System.out.println("*****************************************");

        System.out.print("Please Enter the First Choice: ");
        String first = scanner.next().toUpperCase();

        System.out.print("Please Enter the Second Choice: ");
        String second = scanner.next().toUpperCase();

        System.out.print("How Many Rolls You Want?: ");
        int roll = scanner.nextInt();

        for (int i = 1; i <= roll; i++) {
            System.out.println("\n--- Roll Number " + i + " ---");
            System.out.println("1... 2... 3... ROLL!!");

            int result = random.nextInt(2);

            if (result == 0) {
                System.out.println("The Result: " + first);
                firstCount++;
            } else {
                System.out.println("The Result: " + second);
                secondCount++;
            }
            System.out.println("-----------------------------------------");
        }


        System.out.println("\n========= FINAL SUMMARY =========");
        System.out.println("Total Rolls Performed: " + roll);
        System.out.println(first + " won: " + firstCount + " times.");
        System.out.println(second + " won: " + secondCount + " times.");

        if (firstCount > secondCount) {
            System.out.println("OVERALL WINNER: " + first);
        } else if (secondCount > firstCount) {
            System.out.println("OVERALL WINNER: " + second);
        } else {
            System.out.println("IT'S A TIE!");
        }
        System.out.println("=================================");

        System.out.println("\nFollow your heart! Game Over.");
        scanner.close();
    }
}