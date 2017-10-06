public class DateTry1
{
  private String month;
  private int day, year;
  
  public DateTry1 (String month, int day, int year)
  {
    this.month = month;
    this.day = day;
    this.year = year;
  }
  
  public void writeOutput()
  {
    System.out.println(month + " " + day + " " + year);
  }
}