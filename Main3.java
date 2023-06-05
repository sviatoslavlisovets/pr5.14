import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть три числа:");
        double number1 = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double number3 = scanner.nextDouble();

        double maxNumber = Math.max(number1, Math.max(number2, number3));

        if (maxNumber == (int) maxNumber) {
            System.out.println("Найдовше число: " + (int) maxNumber);
        } else {
            System.out.println("Введено не дробове число.");
        }
    }
}