package runtimeanalysis;

import java.util.HashSet;
import java.util.TreeSet;

public class DataStructureSearchComparison {

    // Linear Search on Array 
    public static boolean arraySearch(int[] data, int target) {

        for (int value : data) {
            if (value == target) {
                return true;
            }
        }
        return false;
    }

    // Dataset Generator
    public static int[] generateArray(int size) {

        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = i + 1;
        }

        return data;
    }

    // ---------------- Main Method ----------------
    public static void main(String[] args) {

        int[] dataSizes = {1000, 100_000, 1_000_000};
        int target = -1;   // Worst case 

        for (int size : dataSizes) {

            System.out.println("\nDataset Size: " + size);

            // Generate array
            int[] arrayData = generateArray(size);

            // Create HashSet and TreeSet
            HashSet<Integer> hashSet = new HashSet<>();
            TreeSet<Integer> treeSet = new TreeSet<>();

            for (int value : arrayData) {
                hashSet.add(value);
                treeSet.add(value);
            }

            // -------- Array Search --------
            long arrayStart = System.nanoTime();
            arraySearch(arrayData, target);
            long arrayEnd = System.nanoTime();

            System.out.println("Array Search Time:  " +(arrayEnd - arrayStart) / 1_000_000.0 + " ms");

            // -------- HashSet Search --------
            long hashStart = System.nanoTime();
            hashSet.contains(target);
            long hashEnd = System.nanoTime();

            System.out.println("HashSet Search Time: " +(hashEnd - hashStart) / 1_000_000.0 + " ms");

            // -------- TreeSet Search --------
            long treeStart = System.nanoTime();
            treeSet.contains(target);
            long treeEnd = System.nanoTime();

            System.out.println("TreeSet Search Time: " +(treeEnd - treeStart) / 1_000_000.0 + " ms");
        }
    }
}
