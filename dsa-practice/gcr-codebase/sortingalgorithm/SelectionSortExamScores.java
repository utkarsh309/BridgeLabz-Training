package sortingalgorithms;

import java.util.Arrays;

public class SelectionSortExamScores {

	public static void selectionSort(int[] examScores) {
		int unsortedIndex=0;
		int minIndex=minimum(examScores,unsortedIndex);
		
		
		for(int i=0;i<examScores.length-1;i++) {
			
			int temp=examScores[i];
			examScores[i]=examScores[minIndex];
			examScores[minIndex]=temp;
			unsortedIndex++;
			minIndex=minimum(examScores,unsortedIndex);
		}
	}
	
	//Method to find the minimum score index
	public static int minimum(int [] examScore,int start) {
		
		int minimumIndex=start;
		int minimum=Integer.MAX_VALUE;
		for(int i=start;i<examScore.length;i++) {
			
			if(examScore[i]<minimum) {
				minimum=examScore[i];
				minimumIndex=i;
			}
		}
		
		return minimumIndex;
	}
	
	
	public static void main(String[] args) {
		
		int[] examScores= {50,60,70,80,60,25,90,85};
		
		selectionSort(examScores);
		
		System.out.println(Arrays.toString(examScores));

	}

}
