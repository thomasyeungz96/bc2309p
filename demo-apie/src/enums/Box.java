package enums;

public class Box {

  private Color color; //

  // private String color2; // "WHITE" , "WITE", "WHITE ", "W"

  public static final int SIZE = 100;

  public Box(Color color) {
    this.color = color;
  }

  public Color getColor() {
    return this.color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public char getColorCode() { // instance method
    return this.color.getCode();
  }

  public static void main(String[] args) {
    Box box = new Box(Color.BLUE); // Color is not a class, it is a enum

    // Primitive & enum should be always compared by using "=="
    // Wrapper class & custom class should be always compared by "equals()"
    if (box.getColor() == Color.BLUE) {
      System.out.println("this box color is Blue");
    }

    box.setColor(Color.BLACK);
    if (box.getColor() == Color.BLACK) {
      System.out.println("this box color is Black");
    }

    System.out.println("Box Color's code=" + box.getColor().getCode()); // B
    System.out.println("Box Color's code=" + box.getColorCode()); // B

    System.out.println(Color.BLUE.name().toLowerCase()); // blue

    // for-each
    for (Color color : Color.values()) { // Color[]
      System.out.println("color description=" + color.getDescription()
          + ", color code=" + color.getCode());
    }

    // valueOf()
    System.out.println(Color.valueOf("WHITE")); // from String to enum

    System.out.println(Box.SIZE);
  }

  

}
