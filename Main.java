import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведіть аргумент 1");
        int arg1  = scanner.nextInt();
        System.out.println("Ведіть аргумент 2");
        int arg2 = scanner.nextInt();

        int result = arg1 + arg2;

        System.out.println(Integer.toBinaryString(arg1) + " + " + Integer.toBinaryString(arg2) + " = " + Integer.toBinaryString(result));






    }
}