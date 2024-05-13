package assignments;

import java.math.BigInteger;
import java.util.Scanner;

class Demo {
public static String string_multiply(String A, String B) {
BigInteger aa=new BigInteger(A);
 BigInteger ab=new BigInteger(B);
 BigInteger result=aa.multiply(ab);
 return result.toString();
 }
 }
 public class Assignments_13_Part2 {
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter first String:");
 String A = sc.nextLine();
 System.out.println("Enter Second String:");
 String B = sc.nextLine();

 String result = Demo.string_multiply(A, B);

System.out.print("String multiplication is:"+result);
}
}
