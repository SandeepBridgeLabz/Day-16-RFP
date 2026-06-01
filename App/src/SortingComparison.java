import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int size = 10000;

        Random random = new Random();

        int[] original = random.ints(size, 1, 100000).toArray();

        int[] bubble = original.clone();
        int[] merge = original.clone();
        int[] quick = original.clone();

        long start = System.nanoTime();
        bubbleSort(bubble);
        long end = System.nanoTime();

        System.out.println("Bubble Sort: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        Arrays.sort(merge);
        end = System.nanoTime();

        System.out.println("Merge/TimSort: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        Arrays.parallelSort(quick);
        end = System.nanoTime();

        System.out.println("Parallel Sort: " + (end - start) / 1_000_000.0 + " ms");
    }
}