package com.example.blind;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
	}
	public boolean containsDuplicate(int[] nums) {
		Arrays.sort(nums);
		for (int i =1;i<nums.length;i++) {
	    	   
			if(nums[i] == nums [i-1]) {
				return true;
			}
				
		}
	    return false;
    	   
   }

	public boolean containsDuplicate1(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for (int t : nums) {
            // Add each element into the set
            set.add(t);
        }
		return set.size() != nums.length;
    	   
   }

}
