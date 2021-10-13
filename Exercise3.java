import java.util.Random;
import java.util.Scanner;

public class Exercise3 {
    /*  Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
        матрицы).
        3) Проверить произведение элементов какой диагонали больше.
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.printf("Введи размер квадратной матрицы\n");
        int sum1 = 0;
        int sum2 = 0;
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
            sum1 += arr[i][i];
        }
        int count = arr.length-1;
        for (int[] array : arr) {
            for (int j = count; j == count; j--) {
                sum2 += array[j];
            }
            count--;
        }
        System.out.printf("Сумма элементов главной диагонали равна %d\n",sum1);
        System.out.printf("Сумма элементов побочной диагонали равна %d\n", sum2);
        if(sum1 > sum2) {
            System.out.printf("Главная диагональ %d больше побочной диагонали %d\n", sum1, sum2);
        } else if (sum1 < sum2){
            System.out.printf("Главная диагональ %d меньше побочной диагонали %d\n", sum1, sum2);
        } else {
            System.out.printf("Диагонали равны\n");
        }
    }
}