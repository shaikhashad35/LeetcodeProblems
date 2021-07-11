package com.company;
import java.io.*;
import  java.util.*;
public class TwoSum1 {
    public int[] TwoSum(int[] numbs, int target) {
        int a,b=0;
        for(a=0;a<numbs.length-1;a++)
        {
            for(int i=a+1;i<numbs.length;i++)
            {
                if(numbs[i]==target-numbs[a])
                {
                    b=i;
                    return new int[]{a,b};
                }
            }
        }
        return new int[]{a,b};


    }
}
