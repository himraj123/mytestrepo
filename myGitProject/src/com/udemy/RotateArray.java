package com.udemy;

import java.util.Arrays;
import java.util.HashMap;

public class RotateArray {
    public static void main(String[] args) {
        int []arrayNum = {1,2,3,4,5,6,7};
        byte x =8;
        RotateArray rt = new RotateArray();
        byte y = (byte)rt.giveId(x);
        System.out.println(y);

        int k = 0;
        int len = 0;
        len = arrayNum.length;
        int temp =0;
        while (k<3){
            temp = arrayNum[arrayNum.length-1]; //4

            for (int i=len-1;i>0;i--) {
                arrayNum[i] = arrayNum[i - 1];
            }
            arrayNum[0]=temp;
            k++;
        }
        System.out.println(Arrays.toString(arrayNum));

    }

    public int giveId(int a){
        System.out.println(a);
        return a;
    }

}
