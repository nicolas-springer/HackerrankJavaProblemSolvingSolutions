package javamapagenda;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
		HashMap<String, Integer> ag = new HashMap<String, Integer>();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			ag.put(name, phone);
			in.nextLine();
		}
		while(in.hasNext())
		{
			String s=in.nextLine();
			if(ag.containsKey(s)) {
				System.out.println(s+"="+ag.get(s).toString());
			}
			else {
				System.out.println("Not found");
			}
			
			
		}
	}
}




