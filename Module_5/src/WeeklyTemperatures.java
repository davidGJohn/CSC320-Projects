import java.util.Scanner;

public class WeeklyTemperatures {
    private static String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static double[] temperatures = {72.0, 65.2, 78.0, 62.1, 58.4, 53.6, 67.9};
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter a day (Monday-Sunday) or 'week' for full report ('exit' to quit): ");
            String input = scanner.nextLine().toLowerCase();
            
            if (input.equals("exit")) {
                break;
            } else if (input.equals("week")) {
                displayWeeklyReport();
            } else {
                displayDailyTemperature(input);
            }
        }
        
        scanner.close();
    }

    private static void displayDailyTemperature(String day) {
        int index = findDayIndex(day);
        if (index != -1) {
            System.out.printf("%s: %.1f*C%n", days[index], temperatures[index]);
        } else {
            System.out.println("Invalid day entered.");
        }
    }

    private static void displayWeeklyReport() {
        System.out.println("Weekly Temperature Report:");
        for (int i = 0; i < days.length; i++) {
            System.out.printf("%s: %.1f*C%n", days[i], temperatures[i]);
        }
        double average = calculateAverage(temperatures);
        System.out.printf("Weekly Average: %.1f*C%n", average);
    }

    private static int findDayIndex(String day) {
        for (int i = 0; i < days.length; i++) {
            if (days[i].equalsIgnoreCase(day)) {
                return i;
            }
        }
        return -1;
    }

    private static double calculateAverage(double[] arr) {
        double sum = 0;
        for (double value : arr) {
            sum += value;
        }
        return sum / arr.length;
    }
}