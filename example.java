import java.io.*;
import java.util.Scanner;
public class example 
{
 public static void main(String[] args) throws IOException 
 {
  int table[][] = new int [6][5];
  int DevNumber, CompNumber;
  double cost= new double[6];;  
  Scanner infile = new Scanner (new FileInputStream ("info.dat"));
  PrintWriter outfile = null;
  outfile= new PrintWriter
    (new FileOutputStream ("2Dtable.dat")); 
  
 outfile.println("\t\t\t\t\tComponent Number\t\t\t\t\t");
 outfile.println();
 outfile.println( "Device Number" + "\t" + "1" + "\t" + "2" + "\t" + "3" + "\t" + "4" + "\t" + "5");
 outfile.println("_______________________________________________________________________________");
 
for(DevNumber=0;DevNumber <6;DevNumber++)
{
  for(CompNumber=0;CompNumber <5;CompNumber++)
  {
  table[DevNumber][CompNumber]= infile.nextInt();
  outfile.print(table[DevNumber][CompNumber] + " ");
  }
  outfile.println();
 }

infile.close();

arrTable at = new arrTable(table, outfile);
at.findCost();
at.findmax();
at.Avgsort();
outfile.close();
}
}
 