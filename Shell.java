package AlgorithmsInNutshell;

import java.util.Arrays;

public class Shell {

    public static void sort(int[] arr) {

        int temp, j;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                temp = arr[i + 1];
                arr[i + 1] = arr[i];
                j = i;
                while (j > 0 && temp < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    j--;
                }
                arr[j] = temp;
            }
        }

    }

    public static void main(String[] args) {
        int[] x = {3, 2, 1, 4, 6, 5};
        Arrays.toString(x);

        sort(x);
        System.out.println(Arrays.toString(x));
    }
}
