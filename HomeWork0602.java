import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void HomeWork0602(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.println("Введите градусы Цельсия >");
        double celsius = scanner.nextDouble();


        double fahrenheit = 32.00;
        double raz = 1.8;

        double result = celsius * raz + fahrenheit;
        System.out.println("Градусы по Фаренгейту = " + result);


    }
}