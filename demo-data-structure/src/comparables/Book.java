package comparables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book implements Comparable<Book> {

  private String name;

  private double price;

  public Book(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public double getPrice() {
    return this.price;
  }

  // public int compareTo(T o);
  @Override
  public int compareTo(Book book) { // the larger price, come first
    if (book.getPrice() > this.price)
      return 1;
    return -1;
  }

  @Override
  public String toString() {
    return "Book(name=" + this.name + //
        ", price=" + this.price + ")";
  }

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>(
        List.of(new Book("A", 30.5), new Book("B", 50.8), new Book("C", 40.9)));

    // Sorting
    Collections.sort(books);

    System.out.println(books);
    // [Book(name=B, price=50.8), Book(name=C, price=40.9), Book(name=A, price=30.5)]

  }

}
