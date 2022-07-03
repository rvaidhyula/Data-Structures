package com.greatlearning.rotation;

import java.util.Arrays;

public class RotationSort {

	public void leftRotate(int array[],int element, int size) {
		
		for(int i=0;i<element;i++) {
			
			leftRotateByEachOne(array,size);
			
			System.out.println("array value " + Arrays.toString(array));
				
		}
		
	}
	
	void leftRotateByEachOne(int array[],int size) {
		
		int i, temp;
		
		temp = array[0];
		
		for(i=0;i<size-1;i++) {
			
			array[i] = array[i+1]; // 4,2
			
			//array[size-1] = temp; // 2,4
			
		}
	array[size-1] = temp;
	}
}
