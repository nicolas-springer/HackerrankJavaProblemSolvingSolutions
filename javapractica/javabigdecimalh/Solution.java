package javabigdecimalh;

import java.io.*;
import java.math.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        int cant = Integer.parseInt(n);
        List<BigDecimal> s = new ArrayList<BigDecimal>();
        List<String> lista = new ArrayList<String>();
        int pos = 0;
        int test = 0;
        while(test <cant) {
        	n = bufferedReader.readLine();
        	lista.add(n);
        	pos++;
        	test++;
        	   	
        }
        String temp,temp2;
        for (int i = 0; i < pos; i++) {
            for (int j = i; j > 0
                && new BigDecimal(lista.get(j-1)).compareTo(new BigDecimal(lista.get(j))) < 0; j--) {
                temp= lista.get(j-1);
                temp2=lista.get(j);
                lista.remove(j-1);
                lista.add(j-1, temp2);
                lista.remove(j);
                lista.add(j, temp);
               
            }
            
            
            
        }
        for(String sx: lista) {
        	System.out.println(sx);
        }
    }
        

}
 


