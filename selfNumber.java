
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
            int number_length = String.valueOf(number).length();
            int[] numbers = new int[number_length];
            int j = 0;
            do {
                temp = temp / 10;
                numbers[j] = temp;
                j++;
            } while (temp % 10 > 0);
            for (int k = 0; k < number_length; k++) {
                number += numbers[k];
            }
            if (Arrays.binarySearch(array, number) > 0) {
                array[Arrays.binarySearch(array, number)] = 0;
            }
        }

        for (int i = 0; i < length; i++) {
            hasil += array[i];
        }
        return hasil;
    }
}