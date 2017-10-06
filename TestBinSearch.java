import java.util.Scanner;
public class TestBinSearch
{
  public static void main (String[]args)
  {
    int list[] = new int [10], i, key, Position;
    Scanner kb= new Scanner(System.in);
    
    System.out.println("Enter 7 integer numbers in order");
    for(i=0; i<7; i++)
      list[i]= kb.nextInt();
    System.out.println("Enter the key");
    key = kb.nextInt();
    
    //Call the static method
    Position= BinSearch.search(list, key, 0, 6);
    
    if(Position >0)
      System.out.println("Key is found at position " + Position);
    else
      System.out.println("Key is not found.");
  }
}
