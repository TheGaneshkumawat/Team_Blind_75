package com.example.blind;

public class FindMinimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static int findMin(int[] nums) {
		int min = nums[0];
		
		for(int i = 1; i< nums.length ; i++) {
			min = Math.min(min, nums[i]);
		}
		
		return min;        
    }
	
	public static int findMin1(int[] nums) {
		int min = nums[0];
		int start = 0;
		int end = nums.length-1;
		
		while (start <= end) {
			int mid = (start + end)/2;
			
			if(nums[mid] < min){
				min = nums[mid];
				end = mid-1;
			}
			else {
				start = mid+1;
			}
			
		}
		
		return min;        
    }
}
