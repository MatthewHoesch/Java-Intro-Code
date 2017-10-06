//Store 6 numbers in 2 arrays, list1, list2

import java.util.Scanner;
public class inputArr
{
  public static void main (String [] args)
  {
    int list1[]= new int[6];
    int list2[]= new int[6], i;
    
    
    Scanner kb = new Scanner (System.in);
    
    System.out.println("Enter in 6 integer numbers for each array");
    for (i=0;i<6;i++)
    {
      list1[i]= kb.nextInt();
      list2[i]= kb.nextInt();
    }
    
    Checkarrays(list1,list2); //Method Checkarrays is called
  }//End of main 
  
  public static void Checkarrays(int list1[], int list2[])
  {
    int i, flag=1;
    
    for(i=0;i<6;i++)
    {
      if (list1[i] != list2[i])
      {
        flag=0;
        break;
      }
    }
    
    if (flag ==1)
      System.out.println("Two arrays are identical");
    else 
      System.out.println("Two arrays are different");
  }
}
                                   