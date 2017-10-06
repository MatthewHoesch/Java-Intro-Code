import java.util.Scanner;
import java.io.*;

public class ExceptionDemo
{
  public static void main (String[] args)
  {
    int num, count=0;
    double sum=0, avg=0;
    
    try
    {
      Scanner infile = new Scanner(new FileInputStream ("except.dat"));
      
      while(infile.hasNextInt())
      {
        num=infile.nextInt();
        sum= sum+ num;
        count++;
      }
      infile.close();
      avg = sum/count;
    }//try
    
    catch(Exception e)
    {
      System.out.println(e.toString());
    }//Catch block
    System.out.println("The sum of the nimber is = " + sum);
    System.out.println("The avg of the number is = " + avg);
  }
}
    