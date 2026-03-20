package com.sort;

public class CountReversePair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int nums[] = {1,3,2,3,1};
		int nums[] = {2,4,3,5,1};
		System.out.println(reversePairs(nums));
	}

	public static int reversePairs(int[] nums) {
		int count[]=new int[1];
		merge(nums, 0, nums.length-1,count);
		return count[0];
	}
	public static void merge(int nums[],int start,int end,int count[]) {
		if(start==end) {
			return;			
		}
		int mid=(start+end)/2;
		merge(nums,start,mid,count);
		merge(nums,mid+1,end,count);
		  // COUNT FIRST
	    int j = mid + 1;
	    for (int i = start; i <= mid; i++) {
	        while (j <= end && nums[i] > 2L * nums[j]) {
	            j++;	        
	        }	        
	        count[0] += (j - (mid + 1));
	    }
		mergeSortedSelf(nums,start,mid,mid+1,end);
	}
	public static void mergeSortedSelf(int num[],int start1,int end1,int start2,int end2) {
		int result[]=new int[((end1-start1)+1)+((end2-start2)+1)];
		int i=start1;
		int j=start2;
		int k=0;
		while(i <= end1 && j <= end2) {
			if(num[i]<=num[j]) {
				result[k]=num[i];
				i++;
				k++;				
			}else{	
				result[k]=num[j];
				j++;
				k++;				
			}		
		}
		while(i<=end1) {
			result[k]=num[i];
			i++;
			k++;			
		}
		while(j<=end2) {
			result[k]=num[j];
			j++;
			k++;			
		}
	
    k=0;
	while(start1<=end1) {
		num[start1]=result[k];
		start1++;
		k++;
	}
	while(start2<=end2) {
		num[start2]=result[k];
		start2++;
		k++;
	}
}


}
