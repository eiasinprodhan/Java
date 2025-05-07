package insertionsorting;

import java.util.Arrays;

public class InsertionSorting {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 8, 9, 6, 4, 8};

        for (int i = 1; i < numbers.length; i++) {
            int currentElement = numbers[i];
            int k;
            for (k = i - 1; k >= 0 && numbers[k] > currentElement; k--) {
                numbers[k + 1] = numbers[k];
            }

            numbers[k + 1] = currentElement;
        }

    }

}
