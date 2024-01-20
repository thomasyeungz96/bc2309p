public class ArrayList2 {

  private Integer[] integers;

  public ArrayList2() {
    this.integers = new Integer[0];
  }

  public boolean add(Integer integer) { // 10
    // you need to have a new array with length 1
    Integer[] newIntegers = new Integer[this.integers.length + 1];
    int i = 0;
    // O(n)
    for (Integer old : this.integers) { // loop n times
      newIntegers[i++] = old;
    }
    newIntegers[i] = integer;
    this.integers = newIntegers; // !!!!???
    return true;
  }

  public Integer[] getIntegers() {
    return this.integers;
  }

  public Integer set(int index, Integer newInteger) {
    // return the old element
    Integer old = this.integers[index];
    this.integers[index] = newInteger;
    return old;
  }

  public Integer get(int index) {
    return this.integers[index];
  }

  public int lastIndexOf(Integer integer) {
    for (int i = this.integers.length - 1; i >= 0; i--) {
      if (this.integers[i].equals(integer)) // Use equals() to compare object's value
        return i;
    }
    return -1;
  }

  public static void main(String[] args) {
    ArrayList2 arrayList = new ArrayList2(); //
    arrayList.add(10);
    arrayList.add(1);
    arrayList.add(100);
    arrayList.add(-50);
    for (Integer i : arrayList.getIntegers()) {
      System.out.println(i);
    }
    arrayList.add(100);
    System.out.println(arrayList.lastIndexOf(100)); // 4
  }

}
