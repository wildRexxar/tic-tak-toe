import java.util.Scanner;

public class Game {
    private char x = 'X';
    private char o = 'O';
    private final char empty = '*';
    private char[][] arr = new char [3] [3];
    private Scanner sc = new Scanner(System.in);


    /**
     * Для того что бы сыграть в крестики-нолики стоит придерживаться следующего алгоритма:
     * 1) Создание сетки размерами 3 на три.
     * 2) Ходит первый игрок, он выбирает номер строки и столбика что бы поставить свой символ.
     * 3) Идет проверка диапазона значений, что бы не выйти за границы массива (для простоты восприятия, все индексы
     * введенные с клавиатуры уменьшаются на 1, сделано это для того, что бы пользователь не запутался и в его случае
     * было так что ряд - столбец имеют номера 1, 2, 3, а не 0, 1, 2).
     * 4) Выводится сетка с поставленым знаком на экран.
     * 5) Проверяется условие, есть три варианта, побеждает игрок 1, побеждает игрок 2 или побеждает дружба.
     *
     * Все действия со второго по пятый пункт помещены в бесконечный массив, который в случе выполнения одного из
     * условий прерывает свою работу оператором break.
     *
     */

    void game (){
         createArray();
         while(true){
             player1();
             showArr();
             if(testWin('X')){
                 System.out.println("Победил первый игрок");
                 break;
             }
             player2();
             showArr();
             if(testWin('O')){
                 System.out.println("Победил второй игрок");
                 break;
             }
             if(testFull()){
                 System.out.println("Ничья");
                 break;
             }
         };
     }

    /**
     * Эта функция создает пустой массив 3 на 3 и заполняет его
     * символом.
     */

     private void createArray(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = empty;
            }
        }
    }


    /**
     * Данная функция выводит массив элементов после каждого хода для большей наглядности.
     */

    private void showArr(){
        for(char [] a1 : arr){
            for(char a2 : a1){
                System.out.print(a2 + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
    }


    /**
     * Функция хода первого и второго игрока. В ней реальзован цикл в условие которого передан метод, который проверяет
     * границы массива и в случае если введенные числа превышают массив, ввод необходима повторить.
     * Если введеные значения допустимы, то массивы передается 'X' или 'O' по заданным индексам.
     */

    private void player1(){
        int a, b;
        do{
            System.out.println("Введи номер строки и номер столбика");
            a = sc.nextInt() -1;
            b = sc.nextInt() - 1;
        } while (!testBound(a, b));
        arr[a][b] = x;
    }

    private void player2(){
        int a, b;
        do{
            System.out.println("Введи номер строки и номер столбика");
            a = sc.nextInt() - 1;
            b = sc.nextInt() - 1;
        } while(!testBound(a, b));
        arr[a][b] = o;
    }


    /**
   * Собственно это то что и проверяет границы массива. Функция возвращает true, если введеный индекс
     * выходит за границы, тем самым зыцикливая цикл, и делает проверку на то что бы в указанном месте находился
     * символ пустой клетки.
   */


    private boolean testBound(int a, int b) {
        if((a > 3 || a < 0) || (b > 3 || b < 0)){
            return false;
        }
        return arr[a][b] == empty;
    }

    /**
     * Функция осуществляет условие проверки, первый if делает это по стобам и строкам, с помощью цикла for,
     * второй if проверяет главную и побочную диагональ. Оба if возвращают true, в случе победы. Если условия
     * не соблюдаются, то сам метод возвращает false. Этот метод помогает выйти из бесконечного цикла while, в самом
     * начале программы.
     */


    private boolean testWin (char z ) {
        for(int i = 0; i < arr.length; i++) {
            if ((arr[i][0] == z && arr[i][1] == z && arr[i][2] == z) ||
                    (arr[0][i] == z && arr[1][i] == z && arr[2][i] == z)) {
                return true;
            }
            if ((arr[0][0] == z && arr[1][1] == z && arr[2][2] == z) ||
                    (arr[2][0] == z & arr[1][1] == z && arr[0][2] == z)) {
                return true;
            }
        }
        return false;
   }


    /**
     * Эта функция делает проверку завершения игры ничьей, возвращает false, если еще есть пустые ячейка, зацикливая
     * while, или true, если массив полностью заполнен, тем самым заканчивает бесконечный цикл и выводит сообщение о
     * ничьей.
     */

    private boolean testFull () {
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if (arr[i][j] == empty){
                    return false;
                }
            }
        }
        return true;
    }
}