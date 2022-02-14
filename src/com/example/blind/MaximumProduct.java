package com.example.blind;

public class MaximumProduct {

	public static void main(String[] args) {
		int[] a = {-2,0,-1};
		System.out.println(maxProduct(a));


	}
	
	public static int maxProduct(int[] nums) {
		int max = Integer.MIN_VALUE;
        int sum = 1;
        
        // [-2,1,-3,4,-1,2,1,-5,4]
       
        for(int i = 0 ; i< nums.length ; i++) {
        	sum = sum * nums[i];
        	max = Math.max(sum, max);
        	
        	if(sum < 0) {
        		sum = 1;
        	}
        }
        return max;
	}
	    
}
