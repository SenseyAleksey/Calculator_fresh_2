import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите выражение (например, 'X + X') или 'exit' для завершения:");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            String result = Calculator.calc(input);
            System.out.println("Результат: " + result);
        }

        scanner.close();
    }
}
