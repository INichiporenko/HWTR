import java.util.Scanner;

public class HomeWork1602 {
    public static void main(String[] args) {

        System.out.println("Текущее время: ");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        System.out.println("Текущий день недели: ");
        Scanner scanner2 = new Scanner(System.in);
        String dayOfWeek = scanner2.next();

        System.out.println("Хозяева дома? ");
        Scanner scanner3 = new Scanner(System.in);
        String owner = scanner3.next();

        boolean a = (time == 8);
        boolean a2 = (dayOfWeek.equalsIgnoreCase("Понидельник") ||
                dayOfWeek.equalsIgnoreCase("Вторник") ||
                dayOfWeek.equalsIgnoreCase("Среда") ||
                dayOfWeek.equalsIgnoreCase("Четверг") ||
                dayOfWeek.equalsIgnoreCase("Пятница"));
        boolean a3 = (owner.equalsIgnoreCase("Да"));
        if (a && a2 && a3) {
            System.out.println("1)Сигнализация отключена: поднять шторы");
        } else {
            System.out.println("1)Сигнализация включена: не поднимать шторы");
        }

        boolean b = (time == 11);
        boolean b2 = (dayOfWeek.equalsIgnoreCase("Суббота") ||
                dayOfWeek.equalsIgnoreCase("Воскресение"));
        boolean b3 = (owner.equalsIgnoreCase("Да"));
        if (b && b2 && b3) {
            System.out.println("2)Сигнализация отключена: поднять шторы");
        } else {
            System.out.println("2)Сигнализация включена: не поднимать шторы");
        }

        boolean с = (time == 20);
        boolean с2 = (dayOfWeek.equalsIgnoreCase("Понидельник") ||
                dayOfWeek.equalsIgnoreCase("Вторник") ||
                dayOfWeek.equalsIgnoreCase("Среда") ||
                dayOfWeek.equalsIgnoreCase("Четверг") ||
                dayOfWeek.equalsIgnoreCase("Пятница"));
        boolean с3 = (owner.equalsIgnoreCase("Нет"));
        if (с && с2 && с3) {
            System.out.println("3)Сигнализация включена: включить чайник");
        } else {
            System.out.println("3)Сигнализация отключена: не включать чайник");
        }
    }
}