import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        System.out.println("task #1");
        int[] Array = new int[3];
        Array[0] = 1;
        Array[1] = 2;
        Array[2] = 3;
        System.out.println(Arrays.toString(Array));

        for (int i = Array.length - 1; i >= 0; i--) {
            System.out.print(Array[i] + ",");
            System.out.print(Array[i]);
        }
        System.out.println();


        System.out.println("task #2");

        double[] secondArray = {1.57, 7.654, 9.986};
        System.out.println(Arrays.toString(secondArray));
        for (int i = secondArray.length - 1; i >= 0; i--) {
            System.out.print(secondArray[i] + ",");
            System.out.print(secondArray[i]);
        }
        System.out.println();

        System.out.println("task #3");

        int[] Mas = new int[5];
        for (int i = 0, n = 1; i < Mas.length; n = n + 2, i++) {
            Mas[i] = n;
        }
        for (int i = Mas.length - 1; i >= 0; i--) {
            System.out.print(Mas[i] + ",");
            System.out.print(Mas[i]);
        }


        System.out.println();

        System.out.println("task #4");


        System.out.println();
        int[] Arr = {1, 2, 3, 4, 5, 10, 11, 12, 13, 14};

        int temp;

        for (int j = 1; j < Arr.length; j += 2) {
            temp = Arr[j - 1];
            Arr[j - 1] = Arr[j];
            Arr[j] = temp;
        }
        System.out.print(Arrays.toString(Arr));
    }
}


















