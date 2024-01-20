public class DividedByNegativeException extends RuntimeException {

  private int code;

  public DividedByNegativeException() {
    super(ErrCode.DIVIDED_BY_NEGATIVE_EXCEPTION.getErrMsg());
    this.code = ErrCode.DIVIDED_BY_NEGATIVE_EXCEPTION.getCode();
  }

  public int getCode() {
    return this.code;
  }

  public String getFullMessage() {
    return String.valueOf(this.code).concat(" - ").concat(super.getMessage());
  }

  public static void main(String[] args) {

    int balance = -4;
    int result = -1;

    if (balance < 0) {
      result = 0;
    } else {
      result = 10 / balance;
    }
    // try {
    // result = 10 / balance;
    // } catch (DividedByNegativeException e) {
    // result = 0;
    // }

    calculate(4);
  }

  public static int calculate(int balance) throws DividedByNegativeException {
    if (balance < 0)
      throw new DividedByNegativeException();
    return 10 / balance;
  }

}
