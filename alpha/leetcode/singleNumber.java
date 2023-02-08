package leetcode;

import java.util.Arrays;

public class singleNumber {
    public static void number(int nums[]){
       Arrays.sort(nums); 
       boolean bol[] = new boolean[nums.length]; 
       

    }
    public static void print(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,4,5,7,8,3,0}; 
        // int arr2[] = new int[nums.length]; 
        number(nums); 
        print(nums);
        boolean bul[] = new boolean[nums.length]; 
        System.out.println(bul);
        for(int i = 0; i<bul.length; i++){
            System.out.print(bul[i] + " ");
        }
    }
}
