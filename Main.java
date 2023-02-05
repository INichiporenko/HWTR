import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть ваш текст >");
        String a = scanner.nextLine();

        System.out.println("Введіть слово, яке необхідно видалити>");
        String b = scanner.nextLine();

        int start = a.indexOf(b);
        String before = a.substring(0, start);

        String after = a.substring(start + b.length());

        String result = before + after;
        System.out.println(result);










    }
}