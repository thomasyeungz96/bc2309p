package transporation;

public class Taxi implements Movable {

  private int speed;

  private Location location;

  public Taxi(int speed) {
    this.speed = speed;
    this.location = new Location();
  }

  public Location getLocation() {
    return this.location;
  }

  public int getSpeed() {
    return this.speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  @Override
  public Taxi move() {
    int newX = this.location.getX() + this.speed / 10;
    this.location.setX(newX);
    return this;
  }

  @Override
  public void accelerate() {
    this.speed += 30;
  }

  public boolean isArrivedDestination() {
    return this.location.getX() >= 100;
  }

  public boolean isWinner() {
    return this.isArrivedDestination();
  }

}
