package datasctructaray2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arraylistqueries {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);	
		int n = sc.nextInt();
        List<List<Integer>> arr = new ArrayList<>();
        	for(int i =0;i<n; i++) {
        		int xd = sc.nextInt();
        		arr.add(new ArrayList<Integer>());
        		for(int j =0;j<xd; j++) {
        			
        			arr.get(i).add(sc.nextInt());
        		}
        	}   	
        	int q = sc.nextInt();
        	for(int i =0;i<q; i++) {
        		int nl = sc.nextInt();
        		int pos = sc.nextInt();
        		if(nl<=arr.size()) {
        			if(arr.get(nl-1).size()>=pos) {
        				System.out.println(arr.get(nl-1).get(pos-1));
        			}
        			else{
        				System.out.println("ERROR!");
        			}
        		}
        		else {
        			System.out.println("ERROR!");
        		}
        		
        	}
        
        }

}
