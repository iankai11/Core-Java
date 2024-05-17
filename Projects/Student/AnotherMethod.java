package Student;

import java.util.Scanner;

	class Student{
		 int sid;
		 String fname;
		 String lname;
		 String email;
		 long contactNo;
		public Student() {
			super();
			
		}
		public Student(int sid, String fname, String lname, String email, long contactNo) {
			super();
			this.sid = sid;
			this.fname = fname;
			this.lname = lname;
			this.email = email;
			this.contactNo = contactNo;
		}
		
	}
	public class AnotherMethod {

		public static void main(String[] args) {
			
			System.out.println("Student Management System");
			Scanner sc=new Scanner(System.in);
			Student s=new Student();
			int ch;
			do {
				System.out.println("Press1: Add student");
				System.out.println("Press2: Show student");
				System.out.println("Press3: Exit");
				System.out.println("Enter choice");
				ch=sc.nextInt();
				switch(ch) {
				case 1:
					System.out.println("Enter Student id");
				   s.sid=sc.nextInt();
					System.out.println("Enter Student fname");
					  s.fname=sc.next();
						System.out.println("Enter Student lname");
						   s.lname=sc.next();
						   System.out.println("Enter Student email Id");
						   s.email=sc.next();
						   System.out.println("Enter Student Contact Number");
						   s.contactNo=sc.nextLong();
						   Student s1=new Student( s.sid, s.fname,s.lname,s.email, s.contactNo);
						System.out.println("added data");
						break;
				case 2:
					System.out.println("Display data");
					System.out.println(s.sid+" "+s.fname+""+s.lname+" "+s.email+" "+s.contactNo);
				break;
				case 3:
					System.out.println("Exit");
					break;
				default:
					System.out.println("wrong choice");
				}
			}
			while(ch!=3);

		}

	}