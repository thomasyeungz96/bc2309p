package transporation;

public class Location {

  private int x; // 1 -> 10

  public Location() {
    this.x = 1;
  }

  public int getX() {
    return this.x;
  }

  public void setX(int x) {
    this.x = x;
  }


  public static void main(String[] args) {
    // one Bus & one Taxi
    // while loop, isArrivedDestination, exit loop, print bus or taxi win?
    Bus bus = new Bus(20);
    Taxi taxi = new Taxi(20);
    // taxi.accelerate();
    while (!bus.isArrivedDestination()
        && !taxi.isArrivedDestination()) {
      if (bus.move().isWinner()) {
        Movable.staticPrintWinner("Bus");
        break;
      }
      if (taxi.move().isWinner()) {
        // taxi.printWinner("Taxi");
        Movable.staticPrintWinner("Taxi");
        break;
      }
    }

  }

}
