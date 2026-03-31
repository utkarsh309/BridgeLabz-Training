package filehandlingandsearch;

import java.util.Scanner;

public class FirstNegativeSearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int index = -1;

        for (int i = 0; i < size; i++) {
            if (array[i] < 0) {
                index = i;
                break;
            }
        }

        System.out.println("First negative index: " + index);
        
        //Close Scanner
        scanner.close();
    }
}

