package com.deloitte.libraryManagement;

import com.deloitte.libraryManagement.exceptions.bookexistsexception;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to Library Management");
        Library library = new Library();

        // Create Physical & ebook
        try {
            PhysicalBook physicalBook = new PhysicalBook("Introduction to Java", new Author(495392L, "Varun", "Varun@outlook.com"), "495392L", 123);
            PhysicalBook physicalBook1 = new PhysicalBook("Introduction to Java", new Author(495392L, "Varun", "Varun@outlook.com"), "495392L", 123);
            library.addBook(physicalBook);
            library.addBook(physicalBook1);
        } catch (bookexistsexception e) {
            System.out.println("Book Exists");
        }

        library.displayAllBooks();

        // To find a book
        library.findByIsbn("495392L");
        library.findByIsbn("495392L");

        library.findByTitle("Introduction to Java");
        library.findByTitle("Introduction to JS");

        // Implement code to remove a book
        library.removeBook("495392L");
        // Implement code to remove a book that does not exist & handle that
        library.removeBook("495392L");


    }
}
