package com.deloitte.libraryManagement;

import com.deloitte.libraryManagement.exceptions.bookexistsexception;
import com.deloitte.libraryManagement.exceptions.booknotfoundexception;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {

    public static final long version = 1L;

    private Map<String, Book> books;
    private static Set<String> bookIsbns;

    public Library() {
        books = new HashMap<>();
        bookIsbns = new HashSet<>();
    }

    public void addBook(Book book) {

        if (bookIsbns.stream().noneMatch(isbn -> isbn.equals(book.getISBN()))) {
            books.put(book.getISBN(), book);
            bookIsbns.add(book.getISBN());
        } else {
            throw new bookexistsexception("Book with ISBN " + book.getISBN() + " already exists");
        }
    }

    // Create a BookNotFoundException
    // if book is not present throw that exception below
    public void removeBook(String isbn) {
        if (books.containsKey(isbn)) {
            Book removedBook = books.remove(isbn);
            System.out.println("Removed: " + removedBook);
        }
    }

    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library");
        } else {
            System.out.println("Books in library: ");
            books.forEach((isbn, book) -> System.out.println(book));

        }
    }

    public Book findByIsbn(String isbn) {
        if (books.containsKey(isbn)) {
            Book book = books.get(isbn);
            System.out.println("Book Found: ");
            System.out.println(book);
        } else {
            System.out.println("Book Not Found");
        }
        return null;
    }

    public void findByTitle(String title) {
        for (Map.Entry<String, Book> entry : books.entrySet()) {
            if (entry.getValue().getName().equals(title)) {
                System.out.println("Book Found: ");
                System.out.println(entry.getValue());
            } else {
                System.out.println("Book Not Found");
            }
        }
    }


    public void lendBook(Borrowable book) {
        book.borrow();
    }

    public void returnBook(Borrowable book) {
        book.returnBook();
    }

}
