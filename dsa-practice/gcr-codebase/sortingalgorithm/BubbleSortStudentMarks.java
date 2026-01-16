package sortingalgorithms;

import java.util.Arrays;

//Create BubbleSortStudentMarks to sort marks using Bubble sort
public class BubbleSortStudentMarks {

	public static void bubbleSort(int[] marks) {
		
		boolean swaped;
		
		for(int i=0;i<marks.length;i++) {
			
			swaped=false;
			for(int j=0;j<marks.length-i-1;j++) {
				
				if(marks[j]>marks[j+1]) {
					int temp=marks[j];
					marks[j]=marks[j+1];
					marks[j+1]=temp;
					swaped=true;
				}
			}
			if(!swaped) {
				break;
			}
		}
	}
	
	
	public static void main(String[] args) {
		
		int [] marks= {10,5,1,6,20,15};
		
		bubbleSort(marks);
		
		//Display Result
		System.out.println(Arrays.toString(marks));
	}

}
