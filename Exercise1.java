import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    /*  Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
        матрицы).
        1) Почитать сумму четных элементов стоящих на главной диагонали.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.printf("Введи размер квадратной матрицы\n");
        int sum = 0;
        int size = sc.nextInt();
        int [] [] arr = new int [size] [size];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i] [j] = rnd.nextInt(51);
            }
        }
        for (int [] a1 : arr){
            for(int a2 : a1){
                System.out.printf("%d ",a2);
            }
            System.out.println();
        }
        for (int i = 0; i < arr.length; i++){
            if(arr[i][i] % 2 == 0) {
                sum +=arr[i][i];
            }
        }
        System.out.printf("Сумма четных элементов главной диагонали равна %d",sum);
    }
}