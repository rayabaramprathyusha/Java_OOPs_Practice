class Book {
    String title;
    boolean isAvailable = true;

    void borrowBook(String studentName) {
        if (isAvailable) {
            System.out.println(studentName + " borrowed " + title);
            isAvailable = false;
        } else {
            System.out.println(title + " is already borrowed.");
        }
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Java Programming";

        b1.borrowBook("Alice");
        b1.borrowBook("Bob");
    }
}

