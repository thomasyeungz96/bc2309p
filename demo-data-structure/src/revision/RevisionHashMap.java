package revision;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RevisionHashMap {

  private static int counter = 0;
  private static final String KEY_PREFIX = "B";

  public static String genKey() {
    return KEY_PREFIX + ++counter;
  }

  public static Book putNew(Map<String, Book> bookMap, Book book) {
    bookMap.put(genKey(), book);
    return null;
  }

  public static void main(String[] args) {

    // key -> "B1", "B2", "B3"
    Map<String, Book> bookMap = new HashMap<>();
    bookMap.put(genKey(), new Book(40.5, "John"));
    bookMap.put(genKey(), new Book(70, "Alan"));

    List<Book> books = new ArrayList<>();
    for (Map.Entry<String, Book> entry : bookMap.entrySet()) {
      books.add(entry.getValue());
    }
    System.out.println(books);

    //
    RevisionHashMap.putNew(bookMap, new Book(30.2, "Mary"));

    String bookKey = "B3";
    if (!bookMap.containsKey(bookKey)) {
      bookMap.put(bookKey, new Book(40.5, "Sally"));
    }
    String bookKey2 = "B4";
    if (!bookMap.containsKey(bookKey2)) {
      bookMap.put(bookKey2, new Book(40.5, "Tommy"));
    }
    System.out.println(bookMap);

    System.out.println("key=B2=" + bookMap.get("B2"));

  }
}
