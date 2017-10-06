import java.io.*;

public class arrTable
 {
 double table[][], DNum,CNum;
 double cost;
 PrintWriter outfile;
 
 public arrTable(double table[][],PrintWriter outfile)
 {
  this.table= table;
  this.outfile= outfile;
 }
public void findCost()
{
 for(DNum=0; DNum < 6; DNum++)
 {
  cost=0
  for(CNum=0; CNum <5; CNum++)
  {
   cost= cost + table[DNum][CNum];
  }
  outfile.println()
 }
}


}
