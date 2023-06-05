import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перший рядок:");
        String string1 = scanner.nextLine();

        System.out.println("Введіть другий рядок:");
        String string2 = scanner.nextLine();

        int length1 = string1.length();
        int length2 = string2.length();

        if (length1 > length2) {
            System.out.println("Перший рядок більший за кількістю символів.");
        } else if (length2 > length1) {
            System.out.println("Другий рядок більший за кількістю символів.");
        } else {
            System.out.println("Рядки мають однакову кількість символів.");
        }
    }
}