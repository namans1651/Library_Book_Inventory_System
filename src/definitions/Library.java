/*   Created by IntelliJ IDEA.
 *   Author: Naman Sharma
 *   Date: 8/30/2020
 *   Time: 3:46 PM
 *   File: Library.java
 */
package definitions;
public class Library {
    private Book[] currentlyAvailabeBooks;
    public Book[] getCurrentlyAvailabeBooks() {
        return currentlyAvailabeBooks;
    }
    public void setCurrentlyAvailabeBooks(Book[] currentlyAvailabeBooks) {
        this.currentlyAvailabeBooks = currentlyAvailabeBooks;
    }
}