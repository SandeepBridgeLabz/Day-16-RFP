import java.util.Arrays;
import java.util.Random;

public class SearchComparison {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int size = 1_000_000;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = i;
        }

        int target = size - 1;

        long start = System.nanoTime();
        linearSearch(arr, target);
        long end = System.nanoTime();

        System.out.println("Linear Search: " + (end - start) / 1_000_000.0 + " ms");

        Arrays.sort(arr);

        start = System.nanoTime();
        binarySearch(arr, target);
        end = System.nanoTime();

        System.out.println("Binary Search: " + (end - start) / 1_000_000.0 + " ms");
    }
}