import java.util.Random;
import java.util.Scanner;

public class Exercise4 {
    /*  Создаём квадратную матрицу, размер вводим с клавиатуры. Заполняем
        случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде
        матрицы).
        4)Посчитать сумму четных элементов стоящих над побочной диагональю (не
        включительно)
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
                arr[i] [j] = rnd.nextInt(10);
            }
        }
        for (int [] a1 : arr){
            for(int a2 : a1){
                System.out.printf("%d ",a2);
            }
            System.out.println();
        }
        int count = arr.length-1;
        for(int i =0; i < arr.length-1; i++){
            for(int j = 0; j < count; j++){
                if(arr[i][j] % 2 == 0){ ;
                    sum += arr[i][j];
                }
            }
            count--;
        }
        System.out.printf("Сумма четных элементов верхней треугольной матрицы %d\n",sum);
    }
}