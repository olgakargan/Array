import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        System.out.println("task #1");
        int[] ArrayInt = new int[5];
        ArrayInt[0] = -65;
        ArrayInt[1] = 538;
        ArrayInt[2] = 17;
        ArrayInt[3] = 0;
        ArrayInt[4] = 10;

        double[] ArrayDouble = {1.57, 7.654, 9.986};
        boolean[] ArrayBool = {true, false, false, true,};
        for (int i = 0; i < ArrayInt.length; i++) {
            System.out.println(ArrayInt[i] + ",");
        }
        System.out.println(ArrayInt.length - 1);

        int counter = ArrayBool.length - 1;
        while (counter > 0) {
            System.out.println(ArrayBool[counter] + ",");

            counter--;
        }
        System.out.println(ArrayBool[0]);


        for (int i = 0; i < ArrayInt.length; i++) {
            if (ArrayInt[i] % 2 != 0) ArrayInt[i]++;
            System.out.println(ArrayInt[i] + ' ');
        }


    }

}























