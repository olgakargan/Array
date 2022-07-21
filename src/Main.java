
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        System.out.println("task #1");
//
//  Объявите три массива:
//     1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] Array = new int[3];
        Array[0] = 1;
        Array[1] = 2;
        Array[2] = 3;
        System.out.println(Arrays.toString(Array));

        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + " ");
        }
        System.out.println();
        System.out.println("task #4");
        for (int i = 0, n = 1; i <Array.length; n = n + 1, i++) {
            Array[i] = n+1;
            System.out.print(Array[i] + " ");
        }
        System.out.println();

        System.out.println("task #2");
//     2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями

        double[] secondArray = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(secondArray));
        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i] + " ");
        }
        System.out.println();
        System.out.println("task #3");
//     3. Произвольный массив – тип и количество данных определите сами.
//     Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу
//     заполненный элементами.v
        int[] Mas = new int[5];
        for (int i = 0, n = 1; i < Mas.length; n = n + 2, i++) {
            Mas[i] = n;
        }
        for (int i = Mas.length - 1; i >= 0; i--) {
            System.out.print(Mas[i] + " ");
        }


        System.out.println();

//        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
//        (нужно прибавить 1).
//                Важно: код должен работать с любым целочисленным массивом,
//                поэтому для решения задания вам нужно использовать циклы.
//                Распечатайте результат преобразования в консоль.






    }
}














