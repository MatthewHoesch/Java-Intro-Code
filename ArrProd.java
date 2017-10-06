//Write a program that will read 5 numbers, then find the product of Array1 and Array2 and print in Array3

import java.util.Scanner;
public class ArrProd
{
  public static void main (String[] args)
  {
    int i;
    int list1[] = new int[5];
    int list2[] = new int[5];
    int list3[] = new int[5];
    
    Scanner kb= new Scanner (System.in);
  System.out.println("Enter in 5 integer numbers for the 2 arrays");
  
  for (i=0; i<list1.length; i++)
  {
    list1[i]= kb.nextInt();
    list2[i]= kb.nextInt();
    list3[i]= list1[i] * list2[i];
  }
  
  for (i=0; i< list1.length; i++)
    System.out.println(list1[i] + "*" + list2[i] + "=" + list3[i]);
  }
}
    
  