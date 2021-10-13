import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    /*  Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
        матрицы).
        5)Транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й
        строкой и т. д.)
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        System.out.printf("Введи размер квадратной матрицы\n");
        int size = sc.nextInt();
        int [] [] arr1 = new int [size] [size];
        int [] [] arr2 = new int [size] [size];
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr1[i].length; j++){
                arr1[i] [j] = rnd.nextInt(10);
            }
        }
        for (int [] a1 : arr1){
            for(int a2 : a1){
                System.out.printf("%d ",a2);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < arr2.length; i ++){
            for(int j = 0; j < arr2.length; j++){
                arr2[i][j] = arr1[j][i];
            }
        }
        for (int [] a1 : arr2) {
            for (int a2 : a1) {
                System.out.printf("%d ", a2);
            }
            System.out.println();
        }
    }
}