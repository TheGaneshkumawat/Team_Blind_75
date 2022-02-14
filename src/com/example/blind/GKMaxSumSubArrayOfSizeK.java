package com.example.blind;

public class GKMaxSumSubArrayOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ar = {2, 3, 4, 1, 5};
		
		System.out.println(findMaxSumSubArray(ar,2));
	}
	
	
	public static int findMaxSumSubArray(int[] nums, int k) {
		int sum = 0;
		int counter = 0;
		int max = 0;
		
		for(int i = 0 ; i < nums.length; i++) {
			sum += nums[i];
			
			if(i >= k-1) {
				max = Math.max(max, sum);
				sum = sum - nums[counter];
				counter++;
			}
			
		}
		
		return max;		
	}
}
