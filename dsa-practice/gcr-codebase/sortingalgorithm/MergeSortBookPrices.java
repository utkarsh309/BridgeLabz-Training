package sortingalgorithms;

import java.util.Arrays;

public class MergeSortBookPrices {
	
	public static void mergeSort(int [] bookPrices, int start,int end) {
		
		if(start<end) {
			
			int mid=start + (end - start) / 2;
			
			mergeSort(bookPrices,start,mid);
			mergeSort(bookPrices,mid+1,end);
			
			merge(bookPrices,start,mid,end);
		}
	}
	
	public static void merge(int [] bookPrices,int start,int mid,int end) {
		
		int merged[]=new int[end-start+1];
		
		int index1=start;
		int index2=mid+1;
		
		int x=0;
		
		while(index1<=mid && index2<=end) {
			 
			if(bookPrices[index1]<=bookPrices[index2]) {
				merged[x++]=bookPrices[index1++];
			}else {
				
				merged[x++]=bookPrices[index2++];
			}
		}
		
		while(index1<=mid) {
			merged[x++]=bookPrices[index1++];
		}
		
		while(index2<=end) {
			merged[x++]=bookPrices[index2++];
		}
		
		for(int i=0,j=start;i<merged.length;i++,j++) {
			
			bookPrices[j]=merged[i];
		}
	}

	public static void main(String[] args) {
		
		int[] bookPrices= {500,250,300,150,700};
		
		mergeSort(bookPrices,0,bookPrices.length-1);
		
		System.out.println(Arrays.toString(bookPrices));

	}

}
