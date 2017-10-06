import java.util.Scanner;
import java.io.*;
public class Prog8
{
  public static void main (String [] args) throws IOException
  {
   
    String lname[] = new String[12];
    String names;
    double Income[] = new double [12];
    double amount;
    int dependents;
    Scanner infile = new Scanner 
      (new FileInputStream("Finput.dat"));
    
    PrintWriter outfile = null;
    outfile = new PrintWriter
              (new FileOutputStream ("Foutput.dat"));
    System.out.println("Writing to a file called Foutput.dat");
    outfile.println("Last Name" + "\t\t\t\t\t" + "Income");
  
for(int i=0; i<12; i++)
{
  lname[names]= infile.nextLine();
  infile.next();
  Income[amount]= infile.nextDouble();
  names++;
  amount++;
}
    
for(i=0;i<4;i++)
        outfile.println(lname[names] +"  " + fIncome[i] + "  " );
    infile.close();
    
    familytaxes ft = new familytaxes(lname, Income, outfile);
    ft.tax();
    ft.sort();
    
   outfile.close();
  }
}
