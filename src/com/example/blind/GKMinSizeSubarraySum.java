package com.example.blind;

public class GKMinSizeSubarraySum {

	public static void main(String[] args) {
		
		
		System.out.println(minSumArray(new int[] {3,4,1,1,6}, 8));
	}
	
	public static int minSumArray(int[] nums, int k) {
		int minLength = nums.length+1;
		int windowStart = 0;
		int sum = 0;
		for(int i = 0 ; i < nums.length; i++) {
			
			sum += nums[i];
			
			while(sum >= k) {
				minLength = Math.min(minLength, i-windowStart+1);
				sum -= nums[windowStart];
				windowStart++;
			}
			
		}
		
		if(minLength == nums.length+1)
			minLength = 0;
		
		return minLength;
	
	}		
}
