package com.greatlearning.mergesort;

public class MergeSort {
	
	void merge(int arr[],int left, int mid,int right) {
		
		int n1 = mid-left+1;
		int n2 = right-mid;
		
		int leftArray[] = new int[n1];
		int rightArray[] = new int[n2];
		
		for(int i=0;i<n1;i++)
			leftArray[i] = arr[left+i];
		for(int j=0;j<n2;++j)
			rightArray[j] = arr[mid+1+j];
		
		int i=0,j=0;
		int k = left; 
		
		while(i<n1 && j<n2) {
			if(leftArray[i] <= rightArray[j])
			{
			arr[k] = leftArray[i];
			i++;
			}
			else
			{
				arr[k] = rightArray[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k] = leftArray[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			arr[k] = rightArray[j];
			j++;
			k++;
		}
				
	}
	
	public void sort(int arr[],int left, int right) { //0= 4 lenght-1 =2 right value
		
		if(left<right)
		{
			int mid = (left+right)/2;  //0+4/2 = 2
			sort(arr,left,mid);
			sort(arr,mid+1,right);
			
			merge(arr,left,mid,right);
		}
	}

}
