import java.io.*;
public class multiArray
{
  //instance variables
  int table[][], campus, course, sum;
  PrintWriter outfile;
  
  public multiArray(int table[][], PrintWriter outfile)
  {
    this.table= table;
    this.outfile= outfile;
  }
  
  public void showTcampus()
  {
    for(campus=0;campus<3; campus++)
    {
      sum=0;
      for (course=0;course<4;course++)
      {
        sum=sum+ table[campus][course];
      }
      outfile.println("The total enrollment for campus" + (campus+1) + "is= " +sum);
    }
    outfile.println();
  }
    public void showTcourse()
    {
      System.out.println();
      for (course=0;course<4;course++);
      {
        sum=0;
        for(campus=0;campus<3;campus++)
        {
          sum= sum+ table[campus][course];
        }
        outfile.println("The total enrollment for course" + (course+1) + "is= " +sum);
      }
    }
  }
          
        