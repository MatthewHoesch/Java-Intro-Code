import java.io.*;
import java.util.Scanner;
public class arrTable
 {
 double table[][];
 int mnum[];
 int DNum,CNum;
 double cost,Lcost;
 int max=1000, min=0, i;
 PrintWriter outfile;
 
 public arrTable(double table[][],PrintWriter outfile)
 {
  this.table= table;
  this.outfile= outfile;
 }
public void findDCost()
{
 for(DNum=0; DNum < 6; DNum++)
 {
  cost=0;
  for(CNum=0; CNum <5; CNum++)
  {
    cost= cost + table[DNum][CNum];
   table[DNum][CNum]= table[DNum][CNum] * cost;
  }
  outfile.println(table[DNum][CNum]); 
  Lcost = table[DNum][CNum] *(cost*.15);
  outfile.println("The labor cost of each device is = $" + Lcost);
 }
}
public void findMax()
{
  for(i=0; i < 30; i++)
  {
    if(max < mnum[i])
        max = mnum[i];
      if(min > mnum[i])
        min = mnum[i];
  }
  outfile.println("The max number is =" + max);
}
}
  



  
  
  
  
