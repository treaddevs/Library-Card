import java.time.LocalDate; // required import
/**
 * Represents a library card that can be used to borrow books.
 * Each library card can have a maximum of 3 borrowed books at any given time.
 */
public class LibraryCard {
    private static int numCards;  // Tracks total number of library cards issued
    private final int cardNumber;  // Unique identifier for this library card
    private BorrowedBook book1;  // First borrowed book
    private BorrowedBook book2;  // Second borrowed book
    private BorrowedBook book3;  // Third borrowed book
    private Person cardholder; // Add a field to store the cardholder information
    private double totalFees; // Total library fees
    public BorrowedBook getBook1() {
        return book1;
    }

    public BorrowedBook getBook2() {
        return book2;
    }

    public BorrowedBook getBook3() {
        return book3;
    }

    public void setCardholder(Person cardholder) {
        this.cardholder = cardholder;
    }

    public Person getCardholder() {
        return cardholder;
    }
    // Constructor method
    public LibraryCard() { // LibraryCard constructor method
        numCards++; // increases numCards everytime a new LibraryCard object is created
        this.cardNumber = numCards; // the card number is set to the latest number of numCards
        this.totalFees = 0; // no fees are due upon issuing the card
    }
    public void borrowBook(Book book) {
        // checks if the book is not available
        if (!book.isAvailable()) {
            return;
        }
        LocalDate today = LocalDate.now();
        if (book1 == null) {
            // creates a new borrowed book object from the given available book
            // then, assigns the borrowed book to book1
            book1 = new BorrowedBook(book, today);
            return;
        }
        if (book2 == null) {
            // creates a new borrowed book object from the given available book
            // then, assigns the borrowed book to book2
            book2 = new BorrowedBook(book, today);
            return;
        }
        if (book3 == null) {
            // creates a new borrowed book object from the given available book
            // then, assigns the borrowed book to book3
            book3 = new BorrowedBook(book, today);
        }
    }

    public double makePayment(double payment) {
        totalFees -= payment; // to make a payment (makePayment)
        // the payment is subtracted from totalFees returning the balance totalFees
        // (as the outstanding balance)
        return totalFees;
    }

    public int getCardNumber() { // getter for cardNumber
        return cardNumber;
    }

    public double getTotalFees() { // getter for totalFees
        return totalFees;
    }
}

