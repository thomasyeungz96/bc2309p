public class VictorianFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    System.out.println("creating victorian chair ...");
    return new VictorianChair();
  }

  @Override
  public Sofa createSofa() {
    System.out.println("creating victorian sofa ...");
    return new VictorianSofa();
  }
  
}
