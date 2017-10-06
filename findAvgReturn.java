import java.util.Scanner;
public class findAvgReturn
{
  public static void main(String[]args)
  {
    int num, count = 0;
    double sum = 0.0, avg;
    
    Scanner kb = new Scanner (System.in);
    System.out.println("Enter in 5 numbers");
    
    for (int i=0; i<5; i++)
    {
      num = kb.nextInt();
      sum= sum + num;
      count++;
    }
    avg =findAverage (sum, count);
    System.out.println(" avg = " + avg);
  }
  public static double findAverage (double sum, int count)
  {
    double avg;
    avg = sum / count;
    return avg;
  }
}
    
      
  
