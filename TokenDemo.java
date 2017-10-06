import java.util.Scanner;
import java.util.StringTokenizer;

//Example of using String Tokenizer
public class TokenDemo
{
  public static void main(String[] args)
  {
    String inputline, word;
    Scanner kb = new Scanner (System.in);
    
    System.out.println("Enter an inputline");
    inputline = kb.nextLine();
    
    StringTokenizer token = new StringTokenizer(inputline);
    
    while(token.hasMoreTokens())
    {
      word = token.nextToken();
      System.out.println(word);
    }
  }
}
