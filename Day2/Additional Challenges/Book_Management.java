package Day2;
import java.util.ArrayList;

class Book {
    int bookId;
    String title;
    String author;
    boolean isAvailable;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void display() {
        System.out.println("Book ID: " + bookId + ", Title: " + title + ", Author: " + author + ", Available: " + isAvailable);
    }
}

class Member {
    int memberId;
    String name;

    public Member(int memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable) {
            book.isAvailable = false;
        }
    }

    public void returnBook(Book book) {
        book.isAvailable = true;
    }
}

class Librarian {
    ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            for (Book book : books) {
                book.display();
            }
        }
    }
}

public class Book_Management {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        Member member = new Member(1, "Sanjay");

        librarian.addBook(new Book(1, "The Great Gatsby", "F. Scott Fitzgerald"));
        librarian.addBook(new Book(2, "1984", "George Orwell"));
        librarian.addBook(new Book(3, "To Kill a Mockingbird", "Harper Lee"));
    }

    private static Book findBookById(ArrayList<Book> books, int bookId) {
        for (Book book : books) {
            if (book.bookId == bookId) {
                return book;
            }
        }
        return null;
    }
}

