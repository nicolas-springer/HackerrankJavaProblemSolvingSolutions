package melipracticaentrevistas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DifMinimaPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		while(sc.hasNextInt()==true) {
			
			lista.add(sc.nextInt());
			System.out.println(lista.get(lista.size()-1));
		}
		// ej: [3,5,1,7,9,56,-1]
		int longlista = lista.size();	
		lista.sort((a,b)->(a-b)); // [-1,1,3,5,7,9,56]
		System.out.println(lista.toString());
		int min = 0;
		if(longlista!=0 && longlista>=2) {
			min =  Math.abs(lista.get(0)-lista.get(1));
		}
		System.out.println("min="+min);
		int x=0;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		for (int i = 0 ; i < longlista-1; i++) {
			System.out.println(i);
			x = Math.abs(lista.get(i)-lista.get(i+1));
			if(x==min) {
				List<Integer> aux = new ArrayList<Integer>();
				aux.add(lista.get(i));
				aux.add(lista.get(i+1));
				res.add(aux);
				System.out.println("["+lista.get(i)+";"+lista.get(i+1)+"]");
			}
		}
		
		
	}

}
