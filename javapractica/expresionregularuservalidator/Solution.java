package expresionregularuservalidator;

import java.util.Scanner;
public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();
            if (userName.matches("^[A-Za-z]\\w{7,29}$")) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
