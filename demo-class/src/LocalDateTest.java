import java.time.LocalDate;

public class LocalDateTest {

  int year;
  int month;
  int day;

  // constructor
  public LocalDateTest(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }

  // static method
  public static LocalDateTest of(int year, int month, int day) {
    return new LocalDateTest(year, month, day);
  }

  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2023, 12, 31);
    System.out.println(date.getMonth()); // DECEMBER
    System.out.println(date.getDayOfWeek()); // SUNDAY

    LocalDate date2 = LocalDate.of(2024, 2, 27);
    System.out.println(date2.isAfter(date)); // true
    // System.out.println(date2.is); // true

    LocalDateTest date3 = LocalDateTest.of(2023, 12, 31);
    System.out.println(date3.isBetween(date, date2)); // true

    System.out.println(date.compareTo(date2) == -1); // true
    System.out.println(date2.compareTo(date) == 1); // true
    System.out.println(LocalDate.now()); // today: 2023-9-26

    LocalDate date4 = LocalDate.parse("1988-12-10");
    System.out.println(date4.getYear()); // 1988
  }

  public boolean isBetween(LocalDate date1, LocalDate date2) {
    // isAfter, isBefore
    LocalDate thisDate = LocalDate.of(this.year, this.month, this.day); // ?
    if (date1.isEqual(thisDate) || date2.isEqual(thisDate))
      return true;
    if (date2.isAfter(thisDate) && date1.isBefore(thisDate))
      return true;
    return false;
  }
}
