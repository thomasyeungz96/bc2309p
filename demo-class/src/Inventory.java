public class Inventory {

  // Stock stock;
  Stock[] stocks;
  static String location = "TST";

  // constructor with stock parameter
  public Inventory(Stock inStock) {
    // this.location = inlocation;
    this.stocks = new Stock[100];
    this.stocks[0] = inStock;
  }

  // constructor no parameter
  public Inventory() {
    this.stocks = new Stock[100];
  }



  // public void setLocation(String inlocation) {
  //   this.location = inlocation;
  // }

  public String getLocation() {
    return this.location;
  }

  public int size() {
    int count = 0;
    for (int i = 0; i < this.stocks.length; i++) {
      if (this.stocks[i] != null)
        count++;
    }
    return count;
  }

  public void add(Stock inStock) {
    for (int i = 0; i < this.stocks.length; i++) {
      if (stocks[i] == null) {
        stocks[i] = inStock;
        break;
      }
    }
  }

  public Stock[] getStocks() {
    return this.stocks;
  }

  public static void main(String[] args) {

    // new a Stock;
    // new a Inventory;
    // how to set stock into inventory;

    Stock stock1 = new Stock(0);
    stock1.setPrice(119.19);
    System.out.println("stock1.price=" + stock1.price);
    stock1.setRank("AAA");
    System.out.println("stock1.rank=" + stock1.rank);

    Stock stock2 = new Stock();
    stock2.setPrice(288);
    System.out.println(stock2.price);

    Stock stock3 = new Stock();
    stock3.setPrice(388);
    System.out.println(stock3.price);

    Inventory inventory1 = new Inventory();
    inventory1.add(stock1);
    inventory1.add(stock2);
    inventory1.add(stock3);
    int size = inventory1.size();
    System.out.println("size=" + size);



    // System.out.println(
    // "inventory1.getStock().getPrice()=" + inventory1.getStock().getPrice());

    // System.out.println("inventory1=" + inventory1.stock.price);
    // System.out.println("inventory1=" + inventory1.stock.rank);

    // for (Stock s: inventory1.getStocks()){
    // }
    for (int i = 0; i < inventory1.getStocks().length; i++) {
      Stock s = inventory1.getStocks()[i];
      if (s != null) {
        System.out.println(
            "Stock " + i + ", rank= " + inventory1.getStocks()[i].getRank());
      }
    }
      System.out.println(Inventory.location);
  }
}
