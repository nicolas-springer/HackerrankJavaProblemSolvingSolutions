package bitsetpractica;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		int c = sc.nextInt();
		
		
		
		BitSet x = new BitSet(t);
		BitSet y = new BitSet(t);
		x.set(0, t, false);
		y.set(0, t, false);
		for(int i = 0; i < c; i++) {
			String act = sc.next();
			switch (act) {
			case "AND": {
				if (sc.nextInt() == 1) {
					x.and(y);
				}
				else {
					y.and(x);
				}
				sc.nextInt();
			break;
			}
			case "OR": {
				if (sc.nextInt() == 1) {
					x.or(y);
				}
				else {
					y.or(x);
				}
				sc.nextInt();
				break;
				}
			case "XOR": {
				if (sc.nextInt() == 1) {
					x.xor(y);
				}
				else {
					y.xor(x);
				}
				sc.nextInt();
				break;
				}
			case "FLIP": {
				if (sc.nextInt() == 1) {
					x.flip(sc.nextInt());
				}
				else {y.flip(sc.nextInt());}
				break;
				}
				
			case "SET": {
				if (sc.nextInt() == 1) {
					x.set(sc.nextInt());
				}
				else {y.set(sc.nextInt());}
				break;
				}
			default:
				throw new IllegalArgumentException("Unexpected value: " + act);
			}
			System.out.println(x.cardinality()+" "+y.cardinality());
		}

	}

}
