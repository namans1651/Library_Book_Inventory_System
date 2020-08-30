/*   Created by IntelliJ IDEA.
 *   Author: Naman Sharma
 *   Date: 8/30/2020
 *   Time: 3:45 PM
 *   File: Student.java
 */

package definitions;

import java.util.Arrays;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long studentRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] namesOfBookIssuedByStudent;

    public Student() {
        firstName = "Neil";
        middleName = "Nitin";
        lastName = "Mukesh";
        studentRollNumber = 38;
        numberOfBooksIssuedByStudent = 5;
    }

    public Student(String firstName) {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getStudentRollNumber() {
        return studentRollNumber;
    }

    public void setStudentRollNumber(long studentRollNumber) {
        this.studentRollNumber = studentRollNumber;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public Book[] getNamesOfBookIssuedByStudent() {
        return namesOfBookIssuedByStudent;
    }

    public void setNamesOfBookIssuedByStudent(Book[] namesOfBookIssuedByStudent) {
        this.namesOfBookIssuedByStudent = namesOfBookIssuedByStudent;
    }

    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", studentRollNumber=" + studentRollNumber +
                ", numberOfBooksIssuedByStudent=" + numberOfBooksIssuedByStudent +
                ", namesOfBookIssuedByStudent=" + Arrays.toString(namesOfBookIssuedByStudent) +
                '}';
    }
}
