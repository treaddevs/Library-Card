import java.awt.image.SampleModel; // required import
import java.time.LocalDate; // required import

public class Main {
    public static void main(String[] args) {
        // Create Person for Library member and book author, also create book and link
        // set issueDate to today's date
        Person person1 = new Person("Sam", "Treadwell", 1997);
        LibraryCard libraryCard = new LibraryCard();

        // Assign person1 to the library card
        libraryCard.setCardholder(person1);

        Person person2 = new Person("Gary", "Paulsen", 1939);
        Book hatchet = new Book("Hatchet", person2, 1416936475);
        LocalDate today = LocalDate.of(2023, 5, 31);
        BorrowedBook book = new BorrowedBook(hatchet, today);

        // Print Library membership information
        System.out.println("Testing LibraryCard Class");
        System.out.println("Library card number: " + libraryCard.getCardNumber());
        System.out.println("Cardholder: " + libraryCard.getCardholder().toString());
        System.out.println("Total fees: $" + libraryCard.getTotalFees());

        // Print book information
        libraryCard.borrowBook(hatchet);
        System.out.println("Testing Book Class");
        System.out.println("Book title: " + hatchet.getTitle());
        System.out.println("Book author: " + hatchet.getAuthor());
        System.out.println("Book ISBN: " + hatchet.getISBN());
        System.out.println("Book available: " + hatchet.isAvailable());
    }
}
