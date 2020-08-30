/*   Created by IntelliJ IDEA.
 *   Author: Naman Sharma
 *   Date: 8/30/2020
 *   Time: 4:12 PM
 *   File: FrontDesk.java
 */
package execution;

import definitions.Student;

import java.util.Arrays;
public class FrontDesk {
    public static void main(String[] args) {
        Student student = new Student("Naman");
        Student student1 = student;
        if (student == student1) ;
        {
            System.out.println("Equal");
        }
        //if we want names to be printed we need to create the object
        // Student student = new Student();
        //otherwise it is showing default
        System.out.println(student.getClass().getName());
        System.out.println(student.toString());
        System.out.println(student.getFirstName());
        System.out.println(student.getMiddleName());
        System.out.println(student.getLastName());
        System.out.println(student.getStudentRollNumber());
        System.out.println(student.getNumberOfBooksIssuedByStudent());
        System.out.println(Arrays.toString(student.getNamesOfBookIssuedByStudent()));
        System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" +
                "How may I help you today?\n" +
                "1. Issue a new book for me.\n" +
                "2. Return a previously issues book for me.\n" +
                "3. Show me all my issues books.\n" +
                "4. Exit.");
    }
}