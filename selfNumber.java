
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;

class selfNumber {
    public static void main(String[] args) {
        System.out.println(selfNumbers());
    }

    public static int selfNumbers() {
        int length = 100;
        int hasil = 0;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < length; i++) {
            Integer temp = i + 1;
            int number = i + 1;
            do {
                number += temp % 10;
                temp = temp / 10;
            } while (temp % 10 > 0);
            System.out.println(number);
            if (Arrays.binarySearch(array, number) > 0) {
                array[Arrays.binarySearch(array, number)] = 0;
            }
        }

        for (int i = 0; i < length; i++) {
            hasil += array[i];
            System.out.println(array[i]);
        }
        return hasil;
    }
}