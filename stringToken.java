import java.util.Scanner;
import java.util.StringTokenizer;

public class stringToken
{
  public static void main(String[] args)
  {
    String lname, fname, midname, myinput;
    Scanner kb= new Scanner (System.in);
    
    for(int i=0; i<3; i++)
    {
      System.out.println("Enter your last name, first name and middle name");
      
      myinput = kb.nextLine();
      
      StringTokenizer token = new StringTokenizer (myinput);
      lname = token.nextToken();
      fname = token.nextToken();
      midname = token.nextToken();
      
      System.out.println(fname + " " +  midname + " " + lname);
    }
  }
}
