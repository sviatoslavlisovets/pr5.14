import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть п'ять довільних слів:");
        String input = scanner.nextLine();

        String firstLetters = input.substring(0, 5);

        System.out.println("Перші п'ять літер: " + firstLetters);
    }
}