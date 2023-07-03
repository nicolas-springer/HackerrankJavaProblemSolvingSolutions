package priorityqueuejavah1;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    	PriorityQueue<Student> pq = new PriorityQueue<Student>(
    			Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID)
    			);
    	
    	Scanner sc = new Scanner(System.in);
    	int c = sc.nextInt();
    	System.out.println(c);
    	String[] l;
    	for(int i = 0; i<c;i++) {
    		 l = sc.nextLine().split(" ");
    		System.out.println(l[0]);
    		System.out.println(l[1]);
    		if(l[0]=="ENTER") {
    			
    			String nom = l[1];
    			double nota =Double.parseDouble(l[2]) ;
    			int id = Integer.parseInt(l[3]);
    			System.out.println(nom);
    			pq.add(new Student(id, nom, nota));
    		}
    		else {
    			pq.poll();
    		}
    		
    	}
    	System.out.println("termina");
    	
    	while(pq.peek()!=null) {
    		System.out.println(pq.peek().getName());
    		pq.poll();
    	}
    	
    	System.out.println("termina");
    }
}

class Student{
	private String name;
	private double cgpa;
	private int id;
	
	public Student(int i, String n, double c) {
		this.name = n;
		this.cgpa = c;
		this.id=i;
	}
	
	public int getID() {
		return this.id;
	}
	
	public double getCGPA() {
		return this.cgpa;
		
	}
	public String getName() {
		return this.name;
	}
}