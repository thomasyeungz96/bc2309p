public class BusinessException extends Exception { // Checked Exception

  private int code;

  public BusinessException(ErrCode errCode) {
    super(errCode.getErrMsg());
    this.code = errCode.getCode();
  }

  public int getCode() {
    return this.code;
  }

  // "10002 - Server Connection Time Out."
  public String getFullMessage() {
    return String.valueOf(this.code).concat(" - ").concat(super.getMessage());
  }
}
