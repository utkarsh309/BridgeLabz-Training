package scenario;

import java.util.Arrays;

public class EduResults {

    // Merge Sort
    public static void mergeSort(int[] arr, int start, int end) {

        if (start < end) {
            int mid = (start + end) / 2;

            mergeSort(arr, start, mid);
            mergeSort(arr, mid + 1, end);

            merge(arr, start, mid, end);
        }
    }

    // Merge two sorted halves
    public static void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];

        int i = start;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= end) {
            if (arr[i] >= arr[j]) {    // Descending order 
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        while (j <= end) {
            temp[k++] = arr[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }

    public static void main(String[] args) {

        // Each district already sorted 
        int[] district1 = {95, 90, 85};
        int[] district2 = {92, 88, 80};
        int[] district3 = {99, 91, 89};

        // Combine all into one array
        int[] allMarks = new int[district1.length + district2.length + district3.length];

        int index = 0;
        for (int i = 0; i < district1.length; i++)
            allMarks[index++] = district1[i];

        for (int i = 0; i < district2.length; i++)
            allMarks[index++] = district2[i];

        for (int i = 0; i < district3.length; i++)
            allMarks[index++] = district3[i];

        System.out.println("Before sorting: " + Arrays.toString(allMarks));

        // Apply merge sort
        mergeSort(allMarks, 0, allMarks.length - 1);

        System.out.println("Final State Rank List: " + Arrays.toString(allMarks));
    }
}
