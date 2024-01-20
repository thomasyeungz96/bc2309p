package revision;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RevisionArrayList {
  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book(30.0, "ABC"));
    books.add(new Book(45.5, "DEC"));
    books.add(new Book(100.2, "OKM"));

    // for-each loop -> "ABC,30.0"
    for (Book b : books) {
      System.out.println(b.getAuthor() + "," + String.valueOf(b.getPrice()));
    }
    // ABC,30.0
    // DEC,45.5
    // OKM,100.2
    double sum = 0.0d;
    for (Book b : books) {
      sum += b.getPrice();
    }
    // array [] -> arr.length
    // String -> str.length()
    // ArrayList<>() -> books.size()
    System.out.println("The average price of books = " + sum / books.size());
    // The average price of books = (175.7 /3)
    List<Book> books2 = new ArrayList<>();
    books2 = books.subList(2, books.size() - 1);
    // books refer to original list Books
    Book removed = books.remove(0);

    // remove all books with price > 50
    for (Book book : books) {
      if (book.getPrice() > 50.0) {
        System.out.println("book=" + book);
        // books.remove(book); // java.util.ConcurrentModificationException
        // books.add(book); // java.util.ConcurrentModificationException
      }
    }
    for (int i = 0; i < books.size(); i++) {
      if (books.get(i).getPrice() > 50.0) {
        removed = books.remove(i);
        System.out.println("removed book=" + removed);
      }
    }
    System.out.println(books);

    // Add all the books to a Set collection (HashSet)
    Set<Book> bookset = new HashSet<>();
    for (Book book : books) {
      bookset.add(book);
    }
    bookset.clear();
    bookset.addAll(books);
    // Add all the books to an Array (Book[])
    Book[] bookArray = new Book[books.size()];
    for (int i = 0; i < books.size(); i++) {
      bookArray[i] = books.get(i);
    }
  }
}
