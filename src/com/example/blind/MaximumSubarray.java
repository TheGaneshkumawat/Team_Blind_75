package com.example.blind;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;

public class MaximumSubarray {

	
	public static void main(String[] args) {
		int[] a = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray1(a));

	}
	public static int maxSubArray(int[] nums) {
        int result = 0;
        List<Integer> list = new ArrayList<Integer>();
        // [-2,1,-3,4,-1,2,1,-5,4]
       
        for(int i = 0 ; i< nums.length ; i++) { 
        	result = nums[i];
        	list.add(result);
        	for(int j = i+1 ; j< nums.length ; j++) {
        		int tmp = result += nums[j];
        		list.add(tmp);        		        		
        	}  	        	
        }
        
        OptionalInt optionalInt = list.parallelStream().mapToInt(i->i).max();
        return optionalInt.getAsInt();
    }
	
	
	public static int maxSubArray1(int[] nums) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        // [-2,1,-3,4,-1,2,1,-5,4]
       
        for(int i = 0 ; i< nums.length ; i++) {
        	sum = sum + nums[i];
        	max = Math.max(sum, max);
        	
        	if(sum < 0) {
        		sum = 0;
        	}
        }
                
        return max;
    }
	
	//sliding window pattern
	public static int maxSubArray2(int[] nums) {
        int max = 0;
        int sum = 0;
        
        // [-2,1,-3,4,-1,2,1,-5,4]
       
        for(int i = 0 ; i< nums.length ; i++) {
        	sum = sum + nums[i];
        	max = Math.max(sum, max);
        	
        	if(sum < 0) {
        		sum = 0;
        	}
        }
                
        return max;
    }
	

}
