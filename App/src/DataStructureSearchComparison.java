import java.util.*;

public class DataStructureSearchComparison {

    public static void main(String[] args) {

        int size = 1_000_000;

        int[] array = new int[size];

        HashSet<Integer> hashSet = new HashSet<>();

        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < size; i++) {
            array[i] = i;
            hashSet.add(i);
            treeSet.add(i);
        }

        int target = size - 1;

        long start = System.nanoTime();

        for (int value : array) {
            if (value == target)
                break;
        }

        long end = System.nanoTime();

        System.out.println("Array Search: "
                + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();

        hashSet.contains(target);

        end = System.nanoTime();

        System.out.println("HashSet Search: "
                + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();

        treeSet.contains(target);

        end = System.nanoTime();

        System.out.println("TreeSet Search: "
                + (end - start) / 1_000_000.0 + " ms");
    }
}