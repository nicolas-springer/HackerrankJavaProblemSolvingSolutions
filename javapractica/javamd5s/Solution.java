package javamd5s;

import java.security.MessageDigest;
import java.util.Scanner;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

	  public static void main(String[] args) {
		  try {
				 Scanner sc=new Scanner(System.in);
					String s = sc.next();
					MessageDigest md = MessageDigest.getInstance("MD5");
					byte[] mesDigest = md.digest(s.getBytes());
					BigInteger no = new BigInteger(1, mesDigest);
					String hashtext = no.toString(16);
			    while (hashtext.length() < 32) {
			        hashtext = "0" + hashtext;
			    }
			    
			    System.out.println(hashtext);
			} 
			catch (NoSuchAlgorithmException e) {
			    throw new RuntimeException(e);
			} 
		  }
	 
}
