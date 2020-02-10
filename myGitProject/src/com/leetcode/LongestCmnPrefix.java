package com.leetcode;

public class LongestCmnPrefix {
    public String lcp(String [] s){
        if(s.length==0){
            return null;
        }
        int i=1;
        String prefix = "";
        while(i<s.length){
            for(int j=s[0].length();j>0;j--){
                if(s[i].indexOf(s[0])!=0){
                    s[0]=s[0].substring(0,j-1);
                }
                else{
                    prefix = s[0];
                    break;
                }
            }
            i++;
        }
        if(prefix.length()==0){
            return "common prefix not found";
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestCmnPrefix obj = new LongestCmnPrefix();
        String [] s ={"flow","flower","flosk"};
        System.out.println("Longest Common Prefix is "+ obj.lcp(s));
    }
}
