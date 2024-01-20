public class Demo {
  public static void main(String[] args) {
    // All-args constructor
    Book book = new Book("ABC", "John");
    // There is no No-arg constructor
    // Book book2 = new Book();

    // Getter
    System.out.println(book.authorName());
    System.out.println(book.bookName());

    // Private Attributes
    // System.out.println(book.authorName); // Cannot access attribute, so it is private
    // System.out.println(book.bookName); // Cannot access attribute, so it is private

    // No Setter in Java record

    // toString(), equals(), hashCode() ?
    System.out.println(book.toString()); // Book[bookName=ABC, authorName=John]
    Book book2 = new Book("ABC", "John");
    System.out.println(book.equals(book2)); // true

    System.out.println("book hashCode=" + book.hashCode());
    System.out.println("book2 hashCode=" + book2.hashCode());

    Book book3 = new Book("ABCD", "John");
    System.out.println("book3 hashCode=" + book3.hashCode());

    Book book4 = new Book(null, "Peter"); // java.lang.IllegalArgumentException
  }
}
