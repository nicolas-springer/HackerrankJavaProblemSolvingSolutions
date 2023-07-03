package java1darray;

import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        // Return true if you can win the game; otherwise, return false.
    	int l = game.length;
    	
    	boolean p = true, win=true;
    	int i= 0;
    	while(p && i<l-1) {
    		
    		if(i+leap>=l) {
    			return true;
    		}
    		else if(game[i+leap]==0) {
    			i+=leap;
    		}
    		else {
    			if(game[i+1]==0) {
    				i++;
    			}
    			return false;
    		}
    		
    	}
    	return win;
    	
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}