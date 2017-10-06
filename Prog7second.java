import java.util.Scanner;
import java.io.*;

public class Prog7second 
{
  public static void main (String [] args) throws IOException
  {
    String lname[] = new String[4];
    String fname[] = new String[12];
 
    double Income[] = new double [12];
    double amount;
    int index=0;
    int members[] = new int[12];
    
    
    PrintWriter outfile = null;
    outfile = new PrintWriter
              (new FileOutputStream ("info.dat"));
    System.out.println("Writing to a file called info.dat");
    outfile.println("Last Name" + "\t\t\t\t\t" + "Family Income" + "\t\t\t\t\t" + "Adjusted Income" + "\t\t\t\t\t" + "Taxes");
    
      Scanner infile = new Scanner (new File("Finput.dat"));
    while (infile.hasNext())
    {
      String L = infile.next();
      String F = infile.next();
      double x = infile.nextDouble();
      while (true)
      {
        if(L.equals(lname[index]))
        {
          Income[index]+= x;
          members[index]++;
          break;
        }
        else if (lname[index] == null)
        {
          lname[index]= L;
          Income[index]= x;
          members[index]++;
          break;
        }
        index++;
      }
    }
       

    infile.close();
    
    familytaxes ft = new familytaxes(lname, Income, members, outfile);
    
    ft.tax();
    ft.sort();
   outfile.close();
  }
  
}
