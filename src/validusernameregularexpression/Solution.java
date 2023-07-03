package validusernameregularexpression;

import java.io.*;
import java.util.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    	Scanner sc=new Scanner(System.in); 
    	Integer cases= sc.nextInt();
    	
    	String username;

    	String regex = "^[A-Za-z]\\w{5,29}$";
    	  
         // Compile the ReGex
         Pattern p = Pattern.compile(regex);
    	
    	while(cases!=0) {
    		username = sc.nextLine();
    		if(username.length()>=8 && username.length()<=30 && p.matcher(username).matches()) {
    		System.out.println("Valid"+username);
    		}
    		else {
    			System.out.println("Invalid"+username);
    		}
    		
    		cases--;
    	}
    	
        
    }
}

