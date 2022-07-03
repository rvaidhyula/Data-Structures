package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.binarysearch.BinarSearch;
import com.greatlearning.mergesort.MergeSort;
import com.greatlearning.rotation.RotationSort;

public class ArrayOperationMain {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("Enter the Size of the Array");
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		
		System.out.println("Enter the Values " +size+ "Elements");
		
		int array[] = new int[size];
		
		for(int i=0;i<size;i++) {
			array[i] = sc.nextInt();
		}
		
		MergeSort mergesort = new MergeSort();
		
		mergesort.sort(array, 0, array.length-1);  /// A = [2,3,4,6]  / 0,1,2,3
		
		System.out.print("Array after sort");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i] + "");
			
		}
		
		System.out.println("");
		
		int midelement = array.length/2;
		
		System.out.println("middle element" + midelement);
		
		RotationSort rotationsort = new RotationSort();
		
		rotationsort.leftRotate(array, midelement, array.length);
		
		System.out.println("The array after rotation");
		
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("enter the key value");
		
		int key = sc.nextInt();
		
		BinarSearch binarySearch = new BinarSearch();
		
		int index = binarySearch.pivotBinarySearch(array, array.length, key);
		
		System.out.println((index>0)? "Key is present at position: " + index:"element is found");
				
		
		
		

	}

}
