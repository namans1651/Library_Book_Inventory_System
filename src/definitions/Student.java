/*   Created by IntelliJ IDEA.
 *   Author: Naman Sharma
 *   Date: 8/30/2020
 *   Time: 3:45 PM
 *   File: Student.java
 */

package definitions;

public class Student {
    private String firstName;
    private String middleName;
    private String lastName;
    private long studentRollNumber;
    private int numberOfBooksIssuedByStudent;
    private Book[] namesOfBookIssuedByStudent;

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public long getStudentRollNumber() {
        return studentRollNumber;
    }

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public Book[] getNamesOfBookIssuedByStudent() {
        return namesOfBookIssuedByStudent;
    }
}
