package com.example.blind;

import java.util.Arrays;

public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		productExceptSelf2(arr);
	}
	
	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		
		for(int i = 0 ; i< nums.length ; i++) {
			int tmp = 1;
			
			for(int j = 0 ; j< nums.length ; j++) {
				if(i != j) {
					tmp = tmp * nums[j];
				}
			}
			result[i] = tmp;
		}
			
		
        return result;
    }
	
	//Not Allowed
	public int[] productExceptSelf1(int[] nums) {
		int[] result = new int[nums.length];
		
		//
		int x=1;
		for(int i = 0 ; i< nums.length ; i++) {		
			x = x*nums[i];
		}
		
		for(int i = 0 ; i< nums.length ; i++) {		
			result[i] = x/nums[i];
		}
			
		
        return result;
    }
	
	public static int[] productExceptSelf2(int[] nums) {
		int[] result = new int[nums.length];
		
		int[] left = new int[nums.length];
		int[] right = new int[nums.length];
		
		//1,2,3,4
		left[0] = nums[0];
		right[nums.length-1] = nums[nums.length-1]; 
		
		for(int i = 1 ; i< nums.length ; i++) {			
			left[i] = nums[i]* left[i-1];		 
		}
		
		for(int i = nums.length - 2 ; i>= 0 ; i--) {		
			right[i] = nums[i]* right[i+1];	
			
		}
		
		for(int i = 0 ; i< nums.length ; i++) {
			if(i==0) {
				result[i] = right[i+1];
				continue;
			}
			
			if(i==nums.length-1) {
				result[i] = left[i-1];
				continue;
			}
			
			result[i] = left[i-1]* right[i+1];		 
		}
		
		System.out.println(Arrays.toString(result));
        return result;
    }

}
