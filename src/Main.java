import java.io.OptionalDataException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //  ## 1 задача
//
//  Объявите три массива:
//     1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] Array = new int[3];
        Array[0] = 1;
        Array[1] = 2;
        Array[2] = 3;
        System.out.println(Arrays.toString(Array));


        System.out.println();

//     2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями

        double [] secondArray = {1.57, 7.654, 9.986};

        System.out.println(Arrays.toString(secondArray));

//     3. Произвольный массив – тип и количество данных определите сами.
//     Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу
//     заполненный элементами.v
        int[] array1 = new int[3];

        array1[0]=5;
        array1[1]=17;
        array1[2]=350;
            System.out.println(Arrays.toString(array1));

        //  ## 1 задача
//
//  Объявите три массива:
//     1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        int[] Array4 = new int[3];
        Array4[0] = 3;
        Array4[1] = 2;
        Array4[2] = 1;
        System.out.println(Arrays.toString(Array4));

        System.out.println();
//     2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями

        double [] secondArray1 = {9.986, 7.654, 1.57};

        System.out.println(Arrays.toString(secondArray1));

        int[] array5 = new int[3];

        array5[0]=350;
        array5[1]=17;
        array5[2]=5;
        System.out.println(Arrays.toString(array5));

        String[] a = { "1 "," 2 "," 3 "," 4 "," 5 "," 6 "," 7 "};
               //Выводим изначальный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
        int n = a.length;
        //Переменная, которая будет использоваться при обмене элементов
        String temp;
        for (int i = 0; i < n/2; i++) {
            temp = a[n-i-1];
            a[n-i-1] = a[i];
            a[i] = temp;
        }
        //Выводим конечный массив в консоль
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }
        System.out.println();
//        ### 4 задача
//        Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными
//        (нужно прибавить 1).
//                Важно: код должен работать с любым целочисленным массивом,
//                поэтому для решения задания вам нужно использовать циклы.
//                Распечатайте результат преобразования в консоль.
        int[] mas = new int[10];
        for(int i=0,n1=1; i<mas.length; n1=n1+2,i++){
            mas[i] = n1;
        }
        for(int i=mas.length-1; i>=0; i--) {
            System.out.print(mas[i]+" ");
        }

                   }
        }












