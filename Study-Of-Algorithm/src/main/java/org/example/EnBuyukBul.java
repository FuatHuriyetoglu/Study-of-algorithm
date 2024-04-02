package org.example;

public class EnBuyukBul {
    public static int enBuyukBul(int[] nums) {
        int enBuyuk = nums[0];
        for(int i=1; i< nums.length; i++){
            if (nums[i]> enBuyuk){
                enBuyuk=nums[i];
            }
        }
        return enBuyuk;
    }
    public static void main (String[] args){
        int[] nums = {10,5,24,8,26,50};
        int enBuyukSayi = enBuyukBul(nums);
        System.out.println("dizisinin en büyük elemanı "+ enBuyukSayi);
    }
}