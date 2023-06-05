import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше ім'я:");
        String name1 = scanner.nextLine();

        System.out.println("Введіть друге ім'я:");
        String name2 = scanner.nextLine();

        boolean isSame = name1.equalsIgnoreCase(name2);

        if (isSame) {
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена не ідентичні.");
        }
    }
}