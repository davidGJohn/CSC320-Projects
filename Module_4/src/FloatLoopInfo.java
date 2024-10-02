import java.util.Scanner;

public class FloatLoopInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        double sum = 0;
        double max;
        double min;
        int count = 0;

        System.out.println("Enter 10 grades between 0 and 100:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter grade #" + (i + 1) + ": ");
            if (scanner.hasNextDouble()) {
                double grade = scanner.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    sum += grade;
                    numbers[i] = (int) grade;
                    count++;
                } else {
                    System.out.println("Invalid grade.");
                    i--;
                }
            } else {
                System.out.println("Invalid input.");
                scanner.next();
                i--;
            }

            if (count == 10) {
                break;
            }
        }
        
        min = numbers[0];
        max = numbers[0];

        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < min) {
                min = numbers[j];
            }
            if (numbers[j] > max) {
                max = numbers[j];
            }
        }

        double average = sum / count;
        System.out.printf("Average: %.2f\n", average);
        System.out.printf("Maximum: %.2f\n", max);
        System.out.printf("Minimum: %.2f\n", min);

        scanner.close();
    }
}