import java.time.LocalDate;
import java.time.LocalDateTime;

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

  public static LocalDateTest of(int year, int month, int day) {
    return new LocalDateTest(year, month, day);

  }


  public static void main(String[] args) {
    LocalDate date = LocalDate.of(2023, 12, 31);
    System.out.println(date.getMonth()); // DECEMBER
    System.out.println(date.getDayOfWeek()); // SUNDAY

    LocalDate date2 = LocalDate.of(2024, 2, 27);
    System.out.println(date2.isAfter(date)); // true

    LocalDateTest date3 = LocalDateTest.of(2023, 12, 31); // .of create object
    System.out.println(date3.isBetween(date, date2));

    System.out.println(date.compareTo(date2) == -1); // true
    System.out.println(date2.compareTo(date) == 1); // true
    System.out.println(LocalDate.now());

    // LocalDate date4 = LocalDate.parse("2045-09-23");
    LocalDateTest date4 = LocalDateTest.of(2023, 12, 31); // .of create object
    System.out.println(date4);
    System.out.println(date4.getMonth());
    System.out.println(date4.getDayOfWeek());
    System.out.println(date4.isBetween(date, date2));



  }


  public boolean isBetween(LocalDate date1, LocalDate date2) {
    // isAfter , isbefore
    LocalDate thisDate = LocalDate.of(this.year, this.month, this.day);
    if (date1.isEqual(thisDate) || date2.isEqual(thisDate))
      return true;
    if (date2.isAfter(thisDate) && date1.isBefore(thisDate))
      return true;
    return false;

  }

}
