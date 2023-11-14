import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class LibraryCardTest {
    /**
     * JUnit test class for LibraryCard class
     */
    @Test
    public void testBorrowBook1() {
        // Book class instance
        Book book1 = new Book("To Kill a Mockingbird", new Person("Harper", "Lee", 1926), 18237981);
        // BorrowedBook instance
        LocalDate issueDate = LocalDate.now();
        LibraryCard libraryCard = new LibraryCard();
        libraryCard.borrowBook(book1);
        // Testing the borrowBook method for book1
        Assertions.assertEquals(book1, libraryCard.getBook1().getBook());
    }

    @Test
    public void testBorrowBook2() {
        // Book class instances
        Book book1 = new Book("To Kill a Mockingbird", new Person("Harper", "Lee", 1926), 18237981);
        Book book2 = new Book("Pride and Prejudice", new Person("Jane", "Austen", 1775), 1234120347);
        // BorrowedBook instance
        LocalDate issueDate = LocalDate.now();
        LibraryCard libraryCard = new LibraryCard();
        libraryCard.borrowBook(book1);
        libraryCard.borrowBook(book2);
        // Testing the borrowBook method for book2
        Assertions.assertEquals(book2.getISBN(), libraryCard.getBook2().getBook().getISBN());
        Assertions.assertEquals(book1.getISBN(), libraryCard.getBook1().getBook().getISBN()); // Ensure book1 is still present
    }

    @Test
    public void testBorrowBook3() {
        // Book class instances
        Book book1 = new Book("To Kill a Mockingbird", new Person("Harper", "Lee", 1926), 18237981);
        Book book2 = new Book("Pride and Prejudice", new Person("Jane", "Austen", 1775), 1234120347);
        Book book3 = new Book("Les Miserables", new Person("Victor", "Hugo", 1802), 890182412);
        // BorrowedBook instance
        LocalDate issueDate = LocalDate.now();
        LibraryCard libraryCard = new LibraryCard();
        libraryCard.borrowBook(book1);
        libraryCard.borrowBook(book2);
        libraryCard.borrowBook(book3);
        // Testing the borrowBook method for book3
        Assertions.assertEquals(book3.getISBN(), libraryCard.getBook3().getBook().getISBN());
        Assertions.assertEquals(book2.getISBN(), libraryCard.getBook2().getBook().getISBN()); // Ensure book2 is still present
        Assertions.assertEquals(book1.getISBN(), libraryCard.getBook1().getBook().getISBN()); // Ensure book1 is still present
    }

    @Test
    public void testGetCardNumber() {
        LibraryCard libraryCard = new LibraryCard();
        // Testing the getCardNumber method
        Assertions.assertNotEquals(0, libraryCard.getCardNumber());
    }

    @Test
    public void testGetTotalFees() {
        LibraryCard libraryCard = new LibraryCard();
        // Testing the getTotalFees method
        Assertions.assertEquals(0, libraryCard.getTotalFees());
    }
}
