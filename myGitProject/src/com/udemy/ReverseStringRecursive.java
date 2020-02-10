package com.udemy;

public class ReverseStringRecursive {

    public static void main(String[] args) {
        String str = "hello world";

        ReverseStringRecursive rs = new ReverseStringRecursive();
        String rev = rs.reverseString(str);
        String revString = rs.reverse(str);
        System.out.println(rev);
        System.out.println(revString);
    }

    public String reverseString(String str){

        if(str.isEmpty()){
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);

    }

    public String reverse(String str){
        char [] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length-1;
        for (left=0;left<right;left++,right--){
            char temp = charArray[left];
            charArray[left]=charArray[right];
            charArray[right]=temp;
        }

        //return String.valueOf(charArray);
        return new String(charArray);
    }
}
