package org.example;
//
//Write a function that returns the largest element in a list containing only positive integers!!
//
public class Task1 {
    public static int maxNumber(int[] nums){
        int maxNumber = nums[0];
        for(int i = 1 ; i< nums.length; i++){
            if(nums[i]> maxNumber){
                maxNumber = nums[i];
            }
        }
        return maxNumber;
    }
    public static void main (String[] args){
        int nums[] = {1,3,5,12,4,21,3,2};
        int maxNumberL = maxNumber(nums);
        System.out.println(maxNumberL);
    }
}
