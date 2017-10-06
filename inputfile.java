//Name: Matthew Hoesch
//Write a program that will use a data file

import java .io.*;
import java.util.Scanner;

public class inputfile
{
  public static void main (String [] args) throws IOException
  {
    int num, count=0;
    double sum=0, avg;
    
    Scanner infile = new Scanner 
      (new FileInputStream("data1.dat"));
    
    while(infile.hasNextInt())
    {
      num = infile.nextInt(); //put time for program 
      sum = sum + num;
      count++;
    }
    infile.close();
    
    avg =sum/count;
    System.out.println("The sum of the number is " + sum);
    System.out.println("The avg of the number is " + avg);
  }
}