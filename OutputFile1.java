import java.io.*;
public class OutputFile1
{
  public static void main (String[] args) throws IOException
  {
    PrintWriter outfile = null;
    
    outfile = new PrintWriter
              (new FileOutputStream ("result.dat"));
    System.out.println("Wrting to a file");
    
    outfile.print("The quick brown fox");
    outfile.print("Jumped over the slow dog");
    
    outfile.close();
  }
}