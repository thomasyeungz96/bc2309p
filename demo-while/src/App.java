public class App {
  public static void main(String[] args) {
    // for loop
    for (int i = 0; i < 5; i++) {
      System.out.println(i);
    }

    // while loop
    int j = 0;
    int k = 10;
    while (j < 5 && k > 0) {
      System.out.println(j);
      j++;
      k--;
      System.out.println("hello");
    }

    // sum: 1 - 10
    int z = 1;
    int sum = 0;
    while (z < 11) {
      sum += z;
      z++;
    }
    System.out.println(sum);

    // sum: even number in 1 - 10
    int x = 1;
    sum = 0;
    while (++x < 11) {
      if (x % 2 == 0) {
        sum += x;
      }
      x++;
      
    }
    System.out.println(sum);

    // do-while
    int count = 0;
    do {
      System.out.println("count=" + count);
    } while (++count < 5);

    // break
    // 1 - 10, odd number and > 6
    int s = 10;
    while (true) { // always fulfill
      if (s % 2 == 1) {
        System.out.println(s);
      }
      if (--s <= 6) {
        break;
      }
    }

  }
}
