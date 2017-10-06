/* Population in a city in the year 2000 is 300000, if the pop grows, suppose within 14 years, the pop growth 
 * is 3%, calculate the population for each year.*/ 
//Name: Matthew Hoesch 
 
import java.util.Scanner; 
  public class population 
{ 
  public static void main (String[] args)
  { 
    Scanner kb = new Scanner (System.in); 
     
    int Year,Pop; 
     
      System.out.println("Enter the Population"); 
      Pop= kb.nextInt(); 
      Year = kb.nextInt(); 
      System.out.println("Year         Population"); 
      System.out.println("----------------"); 
     
      for ( Year= 2000; Year<=2014; Year++) 
      { 
        System.out.println(Year + "\t" + Pop); 
        Pop = Pop+(int)(Pop * .03); 
      } 
  } 
} 
 
        