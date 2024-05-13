package assignments;

import java.util.Scanner;

public class Assignments_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       
        System.out.print("Enter the first name: ");
        String str1 = sc.nextLine();
        
       
        System.out.print("Enter the second name: ");
        String str2 = sc.nextLine();
        
       
        try {
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            
            
            int result = num1 * num2;
            
           
            System.out.println("Result of multiplication: " + result.toString());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
        
        sc.close();
    }
}