package runtimeanalysis;

import java.util.Arrays;

public class LinearSearchVsBinarySearch {

	public static int[] generateArray(int size){
		
		int [] dataSet=new int[size];
		for(int i=0;i<size;i++) {
			
			dataSet[i]=((int)(Math.random()*size)+1);
		}
		return dataSet;
	}
	
	public static int linearSearch(int[] data,int target) {
		
		for(int i=0;i<data.length;i++) {
			if(data[i]==target) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[]data,int target) {
		
		int left=0;
		int right=data.length-1;
		while(left<=right) {
			
			int mid=left+(right-left)/2;
			
			if(data[mid]==target) {
				return mid;
			}else if(data[mid]<target) {
				left=mid+1;
			}else {
				right=mid-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int [] dataSizes= {1000,10_000,1_000_000};
		int target=-1;
		
		for(int sizes:dataSizes) {
			
			System.out.println("\nFor "+sizes);
			
			int []data=generateArray(sizes);
			
			//Linear Search
			long linearStartTime=System.nanoTime();
			linearSearch(data,target);
			long linearEndTime = System.nanoTime();
			
			System.out.println("\nLinear Search Time: " +(linearEndTime - linearStartTime) / 1_000_000.0 + " ms");
			
			//Binary Search(sorting+searching)
			long sortStart=System.nanoTime();
			Arrays.sort(data);
			long sortEnd=System.nanoTime();
			
			long binaryStartTime=System.nanoTime();
			binarySearch(data,target);
			long binaryEndTime=System.nanoTime();
			
			System.out.println("Binary sort time: "+(sortEnd-sortStart)/1_000_000.0+" ms");
			System.out.println("Binary search time: "+(binaryEndTime-binaryStartTime)/1_000_000.0+" ms");
			System.out.println("Binary Total Time: "+(binaryEndTime-sortStart)/1_000_000.0+" ms");
		}

	}

}
