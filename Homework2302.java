import java.util.Scanner;

public class Homework2302 {
    public static void main(String[] args) throws Exception {

        /*int result = 0;
        String numer, numer2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите число >");
            numer = scanner.next();

            System.out.println("Введите число >");
            numer2 = scanner.next();

            System.out.println("Введите знак операции >");

            char sing = scanner.next().charAt(0);

            switch (sing) {
                case '+':
                    result = Integer.parseInt(numer) +
                            Integer.parseInt(numer2);
                    break;
                case '-':
                    result = Integer.parseInt(numer) -
                            Integer.parseInt(numer2);
                    break;
                case '*':
                    result = Integer.parseInt(numer) *
                            Integer.parseInt(numer2);
                    break;
                case '/':
                    result = Integer.parseInt(numer) /
                            Integer.parseInt(numer2);
                    break;
                }
        }
            while (!numer.equals("=")) ;*/
        Scanner scanner = new Scanner(System.in);
        String input;
        int result = 0;

        do {
            System.out.println("Введите число или = :");
            input = scanner.next();

            System.out.println("Введите число или = :");
            input = scanner.next();


            if (!input.equals("=")) {
                result = result + Integer.parseInt(input);
            }

        } while (!input.equals("="));

        System.out.println(result);
    }
}
