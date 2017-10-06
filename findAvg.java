//Write a program to find the average of 5 numbers.

import java.util.Scanner;
public class findAvg
{
  public static void main (String[] args)
  {
    int num, count=0, i;
    double sum=0.0, avg;
    Scanner kb= new Scanner (System.in);
    System.out.println("Enter 5 numbers");
    
    for(i=0; i < 5; i++)
    {
      num= kb.nextInt();
      sum= sum+num;
      count++;
    }
    //The new method
    avg=calcAvg(sum,count);
    //Method calcAvg is called to calculate the avg
    System.out.println("avg =" + avg);
  }"Main
   //double is the return type, type of variable that you return, what you return it should be in the body  
    public static double calcAvg (double sum, int count)
  {
    double avg;
    avg = sum/count;
    return avg;
  }
}
  