//Binary search, read 8 numbers to find the key 
import java.util.Scanner;
public class BinarySearch
{
  public static void main(String[]args)
  {
    int list[]= new int[7];
    int i;
    Scanner kb= new Scanner (System.in);
    
    System.out.println("Enter in 7 numbers in order");
    for(i=0;i<7;i++)
     list[i]=kb.nextInt();
    //object BS is created and constructor bSearch is called
    bSearch BS = new bSearch(list);
    BS.searchKey();
  }
}

    