
public class Stock {

  double price;
  String rank;

  public Stock() {
    this.price = 100;
    this.rank = "";
  }

  public Stock(double inPrice) {
    this.price = inPrice;
  }

  public void setPrice(double inPrice) {
    this.price = inPrice;
  }

  public void setRank(String inString) {
    this.rank = inString;
  }

  public double getPrice(){
    return this.price; 
  }
  public String getRank(){
    return this.rank;
  }


  public static void main(String[] args) {



  }

}
