package runtimeanalysis;

import java.util.Arrays;

public class SortingComparison {

    // Generate Array
    public static int[] generateArray(int size) {

        int[] data = new int[size];

        for (int i = 0; i < size; i++) {
            data[i] = (int) (Math.random() * size);
        }

        return data;
    }

    // Bubble Sort
    public static void bubbleSort(int[] data) {

        for (int i = 0; i < data.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < data.length - 1 - i; j++) {

                if (data[j] > data[j + 1]) {

                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
    }

    // Merge Sort
    public static void mergeSort(int[] data, int start, int end) {

        if (start < end) {

            int mid = start + (end - start) / 2;

            mergeSort(data, start, mid);
            mergeSort(data, mid + 1, end);

            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data, int start, int mid, int end) {

        int[] merged = new int[end - start + 1];

        int index1 = start;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= end) {

            if (data[index1] <= data[index2]) {
                merged[x++] = data[index1++];
            } else {
                merged[x++] = data[index2++];
            }
        }

        while (index1 <= mid) {
            merged[x++] = data[index1++];
        }

        while (index2 <= end) {
            merged[x++] = data[index2++];
        }

        for (int i = 0, j = start; i < merged.length; i++, j++) {
            data[j] = merged[i];
        }
    }

    // Quick Sort
    public static void quickSort(int[] data, int low, int high) {

        if (low < high) {

            int pivotIndex = partition(data, low, high);

            quickSort(data, low, pivotIndex - 1);
            quickSort(data, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] data, int low, int high) {

        int pivot = data[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (data[j] < pivot) {

                i++;

                int temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        int temp = data[i + 1];
        data[i + 1] = data[high];
        data[high] = temp;

        return i + 1;
    }

    // Main Method 
    public static void main(String[] args) {

        int[] dataSizes = {1000, 10_000};   // Avoid 1,000,000

        for (int size : dataSizes) {

            System.out.println("\nDataset Size: " + size);

            int[] original = generateArray(size);

            // Bubble Sort
            int[] bubbleData = Arrays.copyOf(original, original.length);
            long bubbleStart = System.nanoTime();
            bubbleSort(bubbleData);
            long bubbleEnd = System.nanoTime();
            System.out.println("Bubble Sort Time: " +
                    (bubbleEnd - bubbleStart) / 1_000_000.0 + " ms");

            // Merge Sort
            int[] mergeData = Arrays.copyOf(original, original.length);
            long mergeStart = System.nanoTime();
            mergeSort(mergeData, 0, mergeData.length - 1);
            long mergeEnd = System.nanoTime();
            System.out.println("Merge Sort Time:  " +
                    (mergeEnd - mergeStart) / 1_000_000.0 + " ms");

            // Quick Sort
            int[] quickData = Arrays.copyOf(original, original.length);
            long quickStart = System.nanoTime();
            quickSort(quickData, 0, quickData.length - 1);
            long quickEnd = System.nanoTime();
            System.out.println("Quick Sort Time:  " +
                    (quickEnd - quickStart) / 1_000_000.0 + " ms");
        }
    }
}
