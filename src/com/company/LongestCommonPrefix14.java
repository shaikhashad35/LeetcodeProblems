package com.company;

public class LongestCommonPrefix14 {
    public String longestCommonPrefix(String[] strs) {
        int minlength=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            minlength=Math.min(minlength,strs[i].length());
        }
        int len=0;
        // System.out.println("min"+minlength);
        for(int j=0;j<minlength;j++){
            boolean found=false;
            for(int i=0;i<strs.length-1;i++){
                if(strs[i].charAt(j)!=strs[i+1].charAt(j)){
                    found=true;
                    break;
                }
            }
            if(!found)
            {
                len++;
                //   System.out.println("len"+len);
            }
            else
            {
                break;
            }
        }
        return strs[0].substring(0,len);
    }
}
