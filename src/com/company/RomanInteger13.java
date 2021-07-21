package com.company;

public class RomanInteger13 {
    public int romanToInt(String s) {
        int n=s.length(),res=0;
        for(int i=n-1;i>=0;i--)
        {
            if(i!=0 && (getNumber(s.charAt(i))>getNumber(s.charAt(i-1))))
            {
                res+=(getNumber(s.charAt(i))-getNumber(s.charAt(i-1)));
                i--;
            }
            else
            {
                res+=getNumber(s.charAt(i));
            }
        }
        return res;
    }
    public int getNumber(char c) {
        switch(c)
        {
            case 'M' : return 1000;
            case 'D' : return 500;
            case 'C' : return 100;
            case 'L' : return 50;
            case 'X' : return 10;
            case 'V' : return 5;
            case 'I' : return 1;
        }

        return 0;
    }
}
