public class Book { // A template to describe the objects
  
  // what is instance? means object

  int noOfPages; // instance variable

  String author; // instance variable

  // instance method (An instance means an object)
  public void setAuthor(String author) { // no static here!
    this.author = author; // this object
  }

  public String getAuthor() {
    return this.author;
  }

  public void setNoOfPages(int noOfPages) {
    this.noOfPages = noOfPages;
  }

  public int getNoOfPages() {
    return this.noOfPages;
  }

  // static method
  public static String print() { 
    return "hello";
  }

  // static method cannot be associated to the object
  // We use Class name to call static method, i.e. Book.print()
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.setAge(3);

    System.out.println(Book.print()); // hello

  }

  public String toString() {
    return "author=" + this.author //
        + ", noOfPages=" + this.noOfPages;
  }

}
