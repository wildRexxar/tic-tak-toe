import java.util.Scanner;
public class Exercise7 {
    /* Создайте класс, который будет выполнять все основные математические операции
        (каждая мат. операция описывается в отдельном методе).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Math math = new Math();
        boolean b = true;
        System.out.println("Введи первое число");
        double x = sc.nextDouble();
        System.out.println("Введи второе число");
        double y = sc.nextDouble();
        System.out.println("Выбери операцию : (+, -, /, *)");

        while (b) {
            String ch = sc.nextLine();
            switch (ch) {
                case ("+"):
                    math.sum(x, y);
                    b = false;
                    break;
                case ("-"):
                    math.razn(x, y);
                    b = false;
                    break;
                case ("/"):
                    math.chast(x, y);
                    b = false;
                    break;
                case ("*"):
                    math.proizv(x, y);
                    b = false;
                    break;
            }
        }
    }
}