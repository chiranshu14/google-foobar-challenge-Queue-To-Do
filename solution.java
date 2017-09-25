package com.google.challenges; 
import java.util.ArrayList;
public class Answer { 
    
    public static int answer(int start, int length) { 
	   //Declaration of necessary variables
	    int i,j;
    	int count = length;
    	int answer = 0;
    	i=start;
        while(count>0)
    	{   j=i+length-(length-count)-1;
    		if(i!=j)
                    answer = answer ^ XOR(i,j);
            else
                answer = answer ^ i;
            i=i+(length);
            count--;
        }
	return answer;  //Required Checksum
    } 

    public static int XOR(int m, int n) {
        int[] pat;
        if(m % 2 == 0)
            pat = new int[] {n, 1, n^1, 0};
        else
            pat = new int[] {m, m^n, m-1, (m-1)^n};
        return pat[(n-m) % 4];
}
    
}
