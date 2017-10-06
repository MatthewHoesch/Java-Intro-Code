//Write a program to sort 6 numbers
import java.util.Scanner;
public class BubbleSort
{
  public static void main(String [] args)
  {
    int List[]= new int[6], i;
    Scanner kb= new Scanner (System.in);
    System.out.println("Enter in 6 numbers");
    for (i=0;i<6;i++)
    {
      List[i]=kb.nextInt();
    }
    System.out.println();
    Bsort sr = new Bsort(List);
    sr.sort();
    for(i=0;i<6;i++)
      System.out.println(List[i]);
  }
}