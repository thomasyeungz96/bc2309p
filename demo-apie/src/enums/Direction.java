package enums;

public enum Direction {
  NORTH('N', 1), WEST('W', 2), EAST('E', -2), SOUTH('S', -1),;

  private char code;
  private int val;

  private Direction(char code, int val) {
    this.code = code;
    this.val = val;
  }

  public char getCode() {
    return this.code;
  }

  public int getVal() {
    return this.val;
  }

  public boolean isOpposite(Direction direction) {
    return this.val * -1 == direction.getVal();
  }

  public static void main(String[] args) {
    System.out.println(Direction.SOUTH.isOpposite(Direction.NORTH)); // true
    System.out.println(Direction.SOUTH.isOpposite(Direction.SOUTH)); // false
    System.out.println(Direction.SOUTH.isOpposite(Direction.EAST)); // false
    System.out.println(Direction.SOUTH.isOpposite(Direction.WEST)); // false
  }

}
