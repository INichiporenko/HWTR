import java.util.Scanner;

public class Homework2302 {
    public static void main(String[] args) throws Exception {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите первый аргумент:");
        int arg1 = scaner.nextInt();
        int result = arg1;
        char sing;

        do {
            System.out.println("Введите знак операции:");
            sing = scaner.next().charAt(0);
            if (sing != '=') {
                System.out.println("Введите очередной аргумент:");
                int arg2 = scaner.nextInt();

                switch (sing) {
                    case '+':
                        result = result + arg2;
                        break;
                    case '-':
                        result = result - arg2;
                        break;
                    case '*':
                        result = result * arg2;
                        break;
                    case '/':
                        result = result / arg2;
                        break;
                }
            }

            } while (sing != '=') ;
            System.out.println("Результат = " + result);

    }
}

