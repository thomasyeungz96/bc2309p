public class DemoSwitch {
  public static void main(String[] args) {

    System.out.println(get(Weekday.WEDNESDAY)); // "Wednesday"
  }

  public static String get(Weekday weekday) {
    // switch
    String day = "";
    switch (weekday) {
      case MONDAY:
        day = "Monday";
        break;
      case TUESDAY:
        day = "Tuesday";
        break;
      case WEDNESDAY:
        day = "Wednesday";
        break;
      case THURSDAY:
        day = "Thursday";
        break;
      case FRIDAY:
        day = "Friday";
        break;
      default:
    }
    return day;
  }

  // Similar to Lambda expression
  public static String get2(Weekday weekday) {
    return switch (weekday) {
      case MONDAY -> "Monday";
      case TUESDAY -> "Tuesday";
      case WEDNESDAY -> "Wednesday";
      case THURSDAY -> "Thursday";
      case FRIDAY -> "Friday";
    };
  }

  // yield
  public static String get3(Weekday weekday) {
    return switch (weekday) {
      case MONDAY:
        yield "Monday";
      case TUESDAY:
        yield "Tuesday";
      case WEDNESDAY:
        yield "Wednesday";
      case THURSDAY:
        yield "Thursday";
      case FRIDAY:
        yield "Friday";
    };
  }
}
