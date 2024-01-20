import java.util.Objects;

public class Point {

  private int x;

  private int y;

  // public Point() {

  // }

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return this.y;
  }

  public void setY(int y) {
    this.y = y;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Point))
      return false;
    Point point = (Point) obj;
    return Objects.equals(this.x, point.getX())
        && Objects.equals(this.y, point.getY());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.x, this.y);
  }

  public Point right() {
    this.x += 1;
    return this;
  }

  public Point left() {
    this.x -= 1;
    return this;
  }

  public Point up() {
    this.y += 1;
    return this;
  }

  public Point down() {
    this.y -= 1;
    return this;
  }

  @Override
  public String toString() {
    return "Point(x=" + this.x //
        + ", y=" + this.y + ")";
  }

  public static void main(String[] args) {
    Point point = new Point(0, 0);
    Point point2 = new Point(0, 1);
    Point point3 = new Point(0, 1);

    System.out.println(point2.equals(point3)); // true
    System.out.println(point.equals(point3)); // false

    point.right().up().left().up();

    System.out.println(point); // 0,2

    point.right(); // Java doesn't require to receive the return object from method
    point.up();

    System.out.println(point); // 1,3

    Point.rightAndUp(point); // 2,4
    System.out.println(point);

    String s = "hello";
    String s2 = Point.concatA(s);
    System.out.println(s2); // helloA

  }

  public static void rightAndUp(Point point) { // Pass by reference
    point.setX(point.getX() + 1);
    point.setY(point.getY() + 1);
  }

  public static String concatA(String str) { // pass by value
    str = str + "A";
    return str;
  }

}
