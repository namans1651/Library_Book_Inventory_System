/*   Created by IntelliJ IDEA.
 *   Author: Naman Sharma
 *   Date: 8/30/2020
 *   Time: 4:12 PM
 *   File: FrontDesk.java
 */

package execution;

import definitions.Student;

public class FrontDesk {
    public static void main(String[] args) {
        Student student = new Student("Naman");
        Student student1 = student;

        if (student == student1) ;
        {
            System.out.println("Equal");
        }
        //System.out.println(student.toString());
        //  System.out.println(student.getFirstName());
        // System.out.println(student.getMiddleName());
        // System.out.println(student.getLastName());
        // System.out.println(student.getStudentRollNumber());
        //System.out.println(student.getNumberOfBooksIssuedByStudent());
        //System.out.println(student.getNamesOfBookIssuedByStudent());
    }
}