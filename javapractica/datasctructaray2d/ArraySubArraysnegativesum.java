package datasctructaray2d;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class ArraySubArraysnegativesum {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int n= sc.nextInt();
		
		List<Integer> l = new ArrayList<Integer>();
		List<Integer> laux = new ArrayList<Integer>();
		for(int i = 0; i< n;i++) {
			l.add(sc.nextInt());	
		}
		
		int cant=0;
		int sum=0;
		    for (int i=0; i <n; i++)
		    {
		        for (int j=i; j<n; j++)
		        {
		            for (int k=i; k<=j; k++) {

		            	sum+=l.get(k);
					
						
					}
		            if(sum<0) cant++;
		            sum=0;
		        }
		    }
		    System.out.println(cant);
		}
		
		
	}
	


