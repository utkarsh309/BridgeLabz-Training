package sortingalgorithms;

import java.util.Arrays;

public class HeapSortJobSalaries {

    // Method to perform Heap Sort
    public static void heapSort(int[] salaryDemands) {

        int size = salaryDemands.length;

        //Build Max Heap
        for (int i = size / 2 - 1; i >= 0; i--) {
            heapify(salaryDemands, size, i);
        }

        //Extract elements from heap one by one
        for (int i = size - 1; i > 0; i--) {

            // Move current root (largest) to end
            int temp = salaryDemands[0];
            salaryDemands[0] = salaryDemands[i];
            salaryDemands[i] = temp;

            // Call heapify on reduced heap
            heapify(salaryDemands, i, 0);
        }
    }

    // Method to maintain max heap property
    private static void heapify(int[] salaryDemands, int heapSize, int rootIndex) {

        int largestIndex = rootIndex;
        int leftChild = 2 * rootIndex + 1;
        int rightChild = 2 * rootIndex + 2;

        // Check left child
        if (leftChild < heapSize && salaryDemands[leftChild] > salaryDemands[largestIndex]) {
            largestIndex = leftChild;
        }

        // Check right child
        if (rightChild < heapSize && salaryDemands[rightChild] > salaryDemands[largestIndex]) {
            largestIndex = rightChild;
        }

        // If root is not largest, swap and heapify again
        if (largestIndex != rootIndex) {

            int temp = salaryDemands[rootIndex];
            salaryDemands[rootIndex] = salaryDemands[largestIndex];
            salaryDemands[largestIndex] = temp;

            heapify(salaryDemands, heapSize, largestIndex);
        }
    }

    public static void main(String[] args) {

        int[] salaryDemands = {60000, 45000, 70000, 40000, 90000, 50000};

        heapSort(salaryDemands);

        System.out.println(Arrays.toString(salaryDemands));
    }
}
