package com.greatlearning.binarysearch;

public class BinarSearch {
	
	public int pivotBinarySearch(int array[],int n, int key) {
		
		int pivot = findpivotelement(array,0,n-1);
		
		if(pivot == -1)
			return binarySearchImplementation(array,0,n-1,key);
		
		else if (array[pivot] == key){
			return pivot;
		}
		//else if (array[0] <= key)
		//	return pivot;
		else if (array[0] <= key)
			return binarySearchImplementation(array,0,pivot-1,key);
			return binarySearchImplementation(array,pivot+1,n-1,key);
		
		
	//	return n;
	}

	
	int findpivotelement(int array[],int low, int high) {
		if(high < low)
			return -1;
		else if(high == low)
			return low;
		
		int mid = (low+high)/2;
		
		if(mid<high && array[mid] > array[mid+1]) 
			return mid;
		else if (mid> low && array[mid]<array[mid-1])
				return mid-1;
		else if (array[low] >= array[mid])
			return findpivotelement(array,low,mid-1);
			return findpivotelement(array,mid+1,high);
	}
			
	int binarySearchImplementation(int arr[],int low, int high,int key) {
		
		if(high <low)
		{
			return -1;
		}
		int mid = (low+high)/2;
		
		if(key == arr[mid])
			return mid;
		else if(key > arr[mid])
			return binarySearchImplementation(arr,mid+1,high,key);
			return binarySearchImplementation(arr,low, mid-1,key);
	}
		
		
	}

