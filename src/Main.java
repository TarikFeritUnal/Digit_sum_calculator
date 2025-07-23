import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        int tempNumber = number;
        int digitCount = 0;

        while (tempNumber != 0) {
            digitCount++;
            tempNumber /= 10;
        }

        int sum = 0;
        for (int i = 0; i < digitCount; i++) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}
