package com.google;
import java.util.*;

public class HasPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numArray = new int[4];
        System.out.println("Enter the values in the array");
        for(int i=0;i<numArray.length;i++){
            numArray[i]=sc.nextInt();
        }
        System.out.print("Elements in the array are : ");
        for (int i:numArray) {
            System.out.print(i + " ");
        }

        System.out.println("Enter the sum to be found with pair");

        int sumValue = sc.nextInt();

        boolean found = hasPairWithSum(numArray,sumValue);
    }

    public static boolean hasPairWithSum(int [] numArray,int sum){
        HashSet<Integer> pairSet = new HashSet<Integer>();
        System.out.println("hello");
        for (int i:numArray){
            if(pairSet.contains(i)){
                System.out.println("Found the pair for the sum "+sum);
                return true;
            }
            else{
                pairSet.add(sum-i);
            }
        }
        return false;
    }
}
