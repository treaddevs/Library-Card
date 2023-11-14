import java.time.LocalDate; // required import
public class BorrowedBook { // public class
    private LocalDate dueDate; // private object dueDate
    // (I didn't make this final as the library policy might allow member
    // to call in and extend the borrowing period)
    private final LocalDate issueDate; // private object issueDate
    private final Book book; // private object book

    public BorrowedBook(Book book, LocalDate issueDate) { // java constructor
        this.issueDate = issueDate; // initialize issueDate
        this.dueDate = issueDate.plusDays(14); // initialize dueDate
        this.book = book; // initialize book object
    }

    public LocalDate getIssueDate() { // public getter for getIssueDate
        return issueDate;
    }

    public LocalDate getDueDate() { // public getter for getDueDate
        return dueDate;
    }

    public Book getBook() { // public getter for getBook
        return book;
    }
}


