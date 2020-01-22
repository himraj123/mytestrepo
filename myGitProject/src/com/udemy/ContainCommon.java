package com.udemy;

public class ContainCommon {
    public static void main(String[] args) {
        char [] arr1 = {'a',67,'j','k'};
        char [] arr2 = {'g','m',67};

        //find if there is any common element in the given arrays above

        boolean [] commonMap = new boolean[128];
        for (int i=0;i<arr1.length;i++){
            if(!commonMap[arr1[i]]){
                commonMap[arr1[i]]=true;
            }
        }

        for (int i=0;i<arr2.length;i++){
            if(commonMap[arr2[i]]){
                System.out.println("Found the common element "+ arr2[i]);
            }
        }
    }
}
