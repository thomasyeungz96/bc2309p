public class DemoOuter {

  public static void main(String[] args) {
    Outer outer = new Outer("ABC");

    Outer.NestedClass staticNestedClass = new Outer.NestedClass("ABC");
    staticNestedClass.display(); // ABC -20

    Company.Employee employee = new Company.Employee("John", 123); // -> static?
    Employee employee2 = new Employee();

    Company.Employee employee3 = Company.createEmployee("John", 123);

    Outer outer2 = new Outer("DEF");
    Outer.InnerClass inner = outer2.new InnerClass("IJK");

    inner.display(); // Outer name1=DEF , inner name3=IJK
    outer2.display(); // outer name1=DEF

    // Example Inner Class
    Library library1 = new Library("ABC");
    Library.Book b1 = library1.new Book("Book1"); // library1.newBook("Book1")
    Library.Book b2 = library1.createBook("Book1"); // library1.newBook("Book1")

    System.out.println("book1 info=" + b1.info()); // book1 info=ABCBook1


  }
}
