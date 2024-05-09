
package com.may9;
public class Student {
    private String name;

    // Constructor
    public Student() {
        this.name = "Unknown";
    }

    // Parameterized Constructor
    public Student(String name) {
        this.name = name;
    }

    // Method to print student's name
    public void printName() {
        System.out.println("Student's name: " + name);
    }

    public static void main(String[] args) {
      
        Student student1 = new Student();
        Student student2 = new Student("John");

        /*Printing names
        student1.printName(); // Output: Student's name: Unknown
        student2.printName(); // Output: Student's name: John*/
    }
}