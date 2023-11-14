/**
 * This class represents a book. A book has a title, an author,
 * an ISBN, and a status (available or checked out).
 */
public class Book { // public class Book
    private final String title; // private String object title
    private final Person author; // private object author created from Person class
    private final int ISBN; // private integer ISBN - International Standard Book Number
    private boolean isAvailable; // private boolean isAvailable (yes/no = true/false)

    /**
     * Construct a Book object that has the
     * provided title, author and ISBN.
     *
     * @param title the title to be given to this book
     * @param author the author to be given to this book
     * @param ISBN the International Standard Book Number of this book
     */

    public Book(String title, Person author, int ISBN) { // Book constructor
        // passes in title, author, ISBN as arguments
        this.title = title; // title object created
        this.author = author; // author object created
        this.ISBN = ISBN; // ISBN object created
        this.isAvailable = true; // this book object has set availability to "true"
    }

    /**
     * Return the title of this book
     * @return the title of this book
     */

    public String getTitle() {
        return this.title;
    }

    /**
     * Return the author of this object
     * @return the author of this object as a @link{Person.java}
     */
    public Person getAuthor() {
        return this.author;
    }

    /**
     * Return the ISBN of this book
     * @return the ISBN of this book
     */
    public long getISBN() {
        return this.ISBN;
    }

    /**
     * Return the availability status of the book.
     * @return the availability of the book: true if available,
     *         false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     *
     * @param available
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * Return a formatted string that contains the information
     * of this object. The string should be in the following format:
     *
     * Title: [title of the book]
     * Author: [first-name last-name]
     * ISBN: [ISBN as a 13-digit integer with digits separated appropriately
     *        by dashes i.e. 978-3-16-148410-0].
     *
     * @return the formatted string as above
     */
    public String toString() { // toString method
        String str;

        str = "Title: "+ this.title + "\n" +
                "Author: "+this.author + "\n";
        str = str + String.format("ISBN: %d-%d-%d-%d-%d",
                ISBN / 1000000000000L,
                ISBN / 100000000000L % 10,
                ISBN / 10000000000L % 10,
                ISBN / 1000000000L % 10,
                ISBN % 1000000000L);

        return str;
    }
}
