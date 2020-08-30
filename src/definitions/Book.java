/*   Created by IntelliJ IDEA.
 *   Author: Naman Sharma
 *   Date: 8/30/2020
 *   Time: 11:34 AM
 *   File: Book.java
 */
package definitions;
public class Book {
    private String bookName;
    private String authorName;
    private String bookNumber;
    public String getBookName() {
        return bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public String getBookNumber() {
        return bookNumber;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }
}