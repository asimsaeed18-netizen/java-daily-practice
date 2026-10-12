
package com.example.week_1.day_2;
import java.util.Scanner;
public class Library {

    private Book[] books;
    private Member[] members;

    // Constructor
    public Library(int bookCapacity, int memberCapacity) {
        books = new Book[bookCapacity];
        members = new Member[memberCapacity];
    }

    // Add a book
    public void addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                System.out.println("Book added successfully");
                return;
            }
        }

        System.out.println("Library is full! Cannot add more books");
    }

    // Add a member
    public void addMember(Member member) {
        for (int i = 0; i < members.length; i++) {
            if (members[i] == null) {
                members[i] = member;
                System.out.println("Member added successfully");
                return;
            }
        }

        System.out.println("Library cannot add more members");
    }

    // Display all books
    public void listBooks() {
        System.out.println("Books in the library:");

        boolean found = false;

        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books available in the library.");
        }
    }

    // Find a book using ISBN
    public Book findBookByIsbn(String isbn) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null
                    && books[i].getIsbn().equals(isbn)) {
                return books[i];
            }
        }

        return null;
    }

    // Borrow a book
    public void borrowBook(String isbn) {
        Book book = findBookByIsbn(isbn);

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        if (!book.isAvailable()) {
            System.out.println("Book is already borrowed");
            return;
        }

        book.setAvailable(false);
        System.out.println("Book borrowed successfully");
    }

    // Return a book
    public void returnBook(String isbn) {
        Book book = findBookByIsbn(isbn);

        if (book == null) {
            System.out.println("Book not found");
            return;
        }

        if (book.isAvailable()) {
            System.out.println("This book was not borrowed");
            return;
        }

        book.setAvailable(true);
        System.out.println("Book returned successfully");
    }

    // Main method

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Library library = new Library(100, 50);

        int choice;

        do {
            System.out.println("\n===== LIBRARY MANAGER =====");
            System.out.println("1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Register Member");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Enter book title: ");
                    String title = scanner.nextLine();

                    System.out.print("Enter author name: ");
                    String author = scanner.nextLine();

                    System.out.print("Enter ISBN: ");
                    String isbn = scanner.nextLine();

                    Genre[] genres = Genre.values();

                    System.out.println("Select genre:");
                    for (int i = 0; i < genres.length; i++) {
                        System.out.println((i + 1) + ". " + genres[i]);
                    }

                    System.out.print("Enter genre number: ");
                    int genreChoice =
                            Integer.parseInt(scanner.nextLine());

                    if (genreChoice < 1 || genreChoice > genres.length) {
                        System.out.println("Invalid genre choice.");
                        break;
                    }

                    Book book = new Book(
                            title,
                            author,
                            isbn,
                            genres[genreChoice - 1],
                            true
                    );

                    library.addBook(book);
                    break;

                case 2:
                    library.listBooks();
                    break;

                case 3:
                    System.out.print("Enter member ID: ");
                    int id = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter member name: ");
                    String name = scanner.nextLine();

                    Member member = new Member(name, id);
                    library.addMember(member);
                    break;

                case 4:
                    System.out.print("Enter ISBN to borrow: ");
                    String borrowIsbn = scanner.nextLine();

                    library.borrowBook(borrowIsbn);
                    break;

                case 5:
                    System.out.print("Enter ISBN to return: ");
                    String returnIsbn = scanner.nextLine();

                    library.returnBook(returnIsbn);
                    break;

                case 6:
                    System.out.println("Exiting Library Manager. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 6);
        scanner.close();
    }
}