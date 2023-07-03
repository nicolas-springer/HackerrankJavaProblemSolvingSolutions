package exceptionsh1;

import java.io.*;
import java.util.*;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner sc = new Scanner(System.in);

    	
    	
    	
    	while(sc.hasNextInt()) {
        	int x = sc.nextInt();
        	int y = sc.nextInt();
    		try {
    			System.out.println(MyCalculator.power(x,y));
    		} catch (Exception e) {
    			System.out.println(e);
    		}
    	}
    	
    	
    }
}

class MyCalculator{
	
	public static long power(int a, int b) throws Exception {
		if(a== 0 && b==0) {
			throw new Exception("n and p should not be zero.");
		}
		else if(a<0 || b<0) {
			throw new Exception("n or p should not be negative.");
		}
		else {
			return (long)Math.pow(a, b);
		}
		
		
		
		
	}
	
}