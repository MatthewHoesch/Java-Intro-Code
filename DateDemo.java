public class DateDemo
{
  public static void main(String[] args)
  {
    
    //object date1 is created and the constructor DateTry1 is invoked 
    
    DateTry1 date1 = new DateTry1("May", 10, 2010);
    
    System.out.println("date1:");
    date1.writeOutput();
    System.out.println();
    
    //object date2 is created and the constructor DateTry1 is invoked
    
    DateTry1 date2 = new DateTry1 ("June", 12, 2011);
    System.out.println("date2: ");
    date2.writeOutput();
  }
}