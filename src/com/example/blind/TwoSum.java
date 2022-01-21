package com.example.blind;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//1
public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int[] twoSum(int[] nums, int target) {
		List<Integer> list = new ArrayList<Integer>();
		 
		 for (int i = 0; i < nums.length; i++) {			
			 for (int j = 0; j < nums.length; j++) {
				 if(i != j && (nums[i] + nums[j] == target) && !list.contains(j)) {
					 list.add(i);
					 list.add(j);
					 
				 }
				 
			 }
		 }
 
        // Storing it inside array of strings
        int[] arr = new int[list.size()];
 
        // Converting ArrayList to Array
        // using get() method
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
 
        
        return arr;
	        
	}
	
	
	public static int[] twoSum1(int[] nums, int target) {
	
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		 int[] a = new int[2];
		 
		 
		 for (int i = 0; i < nums.length; i++) {	
			if(map.containsKey(target  - nums[i])) {
				a[0] = map.get(target  - nums[i]);
				a[1] = i;
			}
			else {
				map.put(nums[i], i);
			}
		 }
        
        return a;
	        
	}

}
