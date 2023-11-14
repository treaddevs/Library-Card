import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class BorrowedBookTest {
    /**
     * JUnit test class for BorrowedBook class
     */
    @Test
    public void testGetIssueDate() {
        // Book class instance
        Book book = new Book("Book1", new Person("Brock", "Hampton", 2010), 349847591);
        // BorrowedBook instance
        LocalDate issueDate = LocalDate.now();
        BorrowedBook borrowedBook = new BorrowedBook(book, issueDate);
        // Testing the getIssueDate method
        Assertions.assertEquals(issueDate, borrowedBook.getIssueDate());
    }
}



