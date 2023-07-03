package javabigintgersaddandmultp;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();

        BigInteger a = new BigInteger(n);
        
        n = bufferedReader.readLine();
        
        BigInteger b = new BigInteger(n);
        
        bufferedReader.close();
        
        //suma de bigs
        System.out.println(a.add(b));
          
        System.out.println(a.multiply(b));
    }

}
 

