//Write a program to read several numbers ended with negative 1, find the average 

import java.util.Scanner;
  public class loopavg
{
  public static void main(String[] args)
  {
    Scanner kb= new Scanner (System.in);
    
    int Num,Count=0;
    double Sum=0.0, Avg;
    
    System.out.println("Enter in numbers");
    Num=kb.nextInt();
    while(Num != -1)
    {
      Sum= Sum+Num;
      Count++;
      Num =kb.nextInt();
    }
    Avg = Sum/Count;
      System.out.println("The Average Value is=" + Avg);
  }
}
        
     