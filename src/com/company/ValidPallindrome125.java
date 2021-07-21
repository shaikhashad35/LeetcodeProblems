package com.company;

public class ValidPallindrome125 {
    public boolean isPalindrome(String s) {
        for(int i=0,j=s.length()-1;i<j;){
            //System.out.println(s.charAt(i)+" = "+s.charAt(j));
            if(!Character.isLetterOrDigit(s.charAt(i)))
                i++;
            else if(!Character.isLetterOrDigit(s.charAt(j)))
                j--;
            else if(Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--)))
                return false;
        }
        return true;
    }
}
