public class Math {
    private double x;
    private double y;

    public void sum(double x, double y) {
        double sum = x + y;
        System.out.printf("Сумма чисел %.2f и %.2f = %.2f\n", x, y, sum);
    }

    public void razn(double x, double y) {
        double razn = x - y;
        System.out.printf("Разность чисел %.2f и %.2f = %.2f\n", x, y, razn);
    }

    public void proizv(double x, double y) {
        double proizv = x * y;
        System.out.printf("Произведение чисел %.2f и %.2f = %.2f\n", x, y, proizv);
    }

    public void chast(double x, double y) {
        double chast = x / y;
        System.out.printf("Частное чисел %.2f и %.2f = %.2f\n", x, y, chast);
    }
}


