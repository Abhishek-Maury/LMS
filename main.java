// import java.util.Scanner;

class Library {

    String[] books;
    int no_of_books;

    Library() {
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String book) {
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + "  has been Added! ");

    }

    void issuedBook(String book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i].equals(book)) {
                System.out.println("book is is issued");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");

    }

    void returnBook(String book) {
        addBook(book);
    }

    void showAvailableBooks() {
        System.out.println("Avaliable Books are : ");
        for (String book : this.books) {
            if (book == null) {
                continue;
            }
            System.out.println("* " + book);
        }

    }
}

public class main {

    public static void main(String[] args) {
        Library CentralLibrary = new Library();
        CentralLibrary.addBook("Think and Grow ");
        CentralLibrary.addBook("Data structure ");
        CentralLibrary.addBook("C++ ");
        CentralLibrary.addBook("Alogrithum ");
        CentralLibrary.showAvailableBooks();
        CentralLibrary.issuedBook("C++");
        CentralLibrary.showAvailableBooks();

    }
}