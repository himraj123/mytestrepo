package com.udemy;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSortArray {
    public static void main(String[] args) {
        int [] array1= {1,7};
        int [] array2= {4,7,9};

        ArrayList<Integer> mainList = new ArrayList<Integer>();
        int length = array1.length+array2.length;
        for (int i=0;i<array1.length;i++){  // O(n)
            mainList.add(array1[i]);
        }
        for (int i=0;i<array2.length;i++){  // O(n)
            mainList.add(array2[i]);
        }

        Collections.sort(mainList);  // O(nlogn)

        System.out.println(mainList);

        mergeSortedArrays(array1,array2);
    }

    public static void mergeSortedArrays(int [] arr1, int [] arr2){
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(i<arr1.length || j<arr2.length){      //int [] array1= {1,3,5};
                                                    //int [] array2= {4,5,7};
            if((i<arr1.length) && (arr1[i]<=arr2[j])){
                list.add(arr1[i]);
                i++;
            }
            else if(j<arr2.length){
                list.add(arr2[j]);
                j++;
            }
        }

        System.out.println(list);
    }
}
