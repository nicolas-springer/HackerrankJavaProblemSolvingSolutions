package javahashsettest;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<List<String>> sets = new HashSet<List<String>>();
        List<String> par;
        
        for (int i = 0; i < t; i++) {
            
        	par = new ArrayList<String>();
        	par.add(0, pair_left[i]);
        	par.add(1, pair_right[i]);
        	sets.add(par);
        	System.out.println(sets.size());
        }
        
        

    }
}
