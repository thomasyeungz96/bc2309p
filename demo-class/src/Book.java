public class Book {
  // class used to describe the objects (the world how it is unquie.) as a template.
  int noOfPages; // state

  String author; // state

  // instance method (An instance means an object) Method = behaviour (工具)
  // instance method belongs to object.

  public void setAuthor(String author) { // no static here
    this.author = author;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setPages(int noOfPages) {
    this.noOfPages = noOfPages;
  }

  public int getPages() {
    return this.noOfPages;
  }

  public static String print() {
    return "hello";

  }

  // "static" method cannot be associated to the object 要癡住個class
  // "static mehtod" belong to the class

  public static void main(String[] args) {
    Person person1 = new Person();
    person1.setAge(3);

    System.out.println(person1.getAge()); // 3
    System.out.println(Book.print()); // hello



    // public static void main(String[] args) { // run only run "main"

    Book book1 = new Book(); // book1 is an object.
    book1.setAuthor("John");
    book1.setPages(10);
    System.out.println(book1.getAuthor()); // John
    System.out.println(book1.getPages()); // 10

    Book book2 = new Book(); // book2 is an object
    System.out.println(book2.getAuthor()); // null default value
    System.out.println(book2.getPages()); // 0 default value



  }
}
