package sortingalgorithms;

import java.util.Arrays;
//Create InsertionSortEmployeeId class to sort the employee id using insertion sort

public class InsertionSortEmployeeId {
	
	public static void insertionSort(int[] employeeIds) {
		
		for(int i=1;i<employeeIds.length;i++) {
			
			int key=employeeIds[i];
			int j=i-1;
			
			while(j>=0 && employeeIds[j]>key) {
				employeeIds[j+1]=employeeIds[j];
				j--;
			}
			employeeIds[j+1]=key;
			
		}
	}

	public static void main(String[] args) {
		
		int [] employeeIds= {101,108,102,105,103,106};
		
		insertionSort(employeeIds);
		
		System.out.println(Arrays.toString(employeeIds));

	}

}
