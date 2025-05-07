package bubblesorting;

import java.util.Arrays;

public class BubbleSorting {

    public static void main(String[] args) {
        int[] numbers = {5, 1, 8, 6, 4, 8, 10};
        boolean nextToPass = true;
        for (int i = 1; i < numbers.length && nextToPass; i++) {
            nextToPass = false;
            for (int k = 0; k < numbers.length - i; k++) {
                if (numbers[k] > numbers[k + 1]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[k + 1];
                    numbers[k + 1] = temp;
                    nextToPass = true;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

}
