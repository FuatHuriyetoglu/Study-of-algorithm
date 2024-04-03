package org.example.CodingPractices;

public class MinNumberFind {
    public static int  enKucukBul( int[] nums){
        int enkucuk = nums[0];
        for(int i = 1; i <nums.length; i++){
          if(nums[i]< enkucuk){
            enkucuk=nums[i];
          }
        }
            return enkucuk;
    }
    public static void main(String[] args){
        int[] nums = {5,8,10,65,2};
        int enKucukSayi = enKucukBul(nums);
        System.out.println("dizisinin en küçük elemanı " + enKucukSayi);
    }
}
