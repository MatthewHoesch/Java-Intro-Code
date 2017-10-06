//Write a program to calculate the average of 4 numbers, then call a function to find the difference between 
// each number and average.
import java.util.Scanner;
public class TestArray1
{
  public static void main (String [] args)
{
  int list[] = new int[5];
  
  Scanner kb= new Scanner (System.in);
  System.out.println("Enter in 5 integer numbers");
  
  for (int i=0; i<5; i++)
    list[i]= kb.nextInt();
  
  //object is created and the constructor is called
  Array1 arr = new Array1(list);
  
  arr.findavg(); //calling methods
  arr.finddiff();
}
}
    