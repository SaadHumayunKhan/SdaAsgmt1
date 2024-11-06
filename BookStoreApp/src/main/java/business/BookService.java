//BL
package business;

import data.Book;
import data.BookDataAccess;

public class BookService {
    private BookDataAccess dataAccess;

    public BookService() {
        dataAccess = new BookDataAccess();
    }

    public String searchBookByTitle(String title) {
        Book book = dataAccess.searchBook(title);
        if (book != null) {
            return "Book Avialabe:\nBook Details \nTitle: " + book.getTitle() + "\nAuthor: " + book.getAuthor() + "\nISBN: " + book.getIsbn();
        } else {
            return "Sorry Book not found!";
        }
    }
}


