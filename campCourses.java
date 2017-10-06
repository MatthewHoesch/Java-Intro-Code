//Suppose a college has 3 campuses and each campus offers 4 courses, write a program to calculate 
//and print the total enrollment for each campus and course.
import java.io.*;
import java.util.Scanner;
public class campCourses
{
  public static void main (String[] args) throws IOException
  {
    int table[][] = new int[3][4];
    int course, campus;
    double sum;
    Scanner infile = new Scanner (new FileInputStream ("array.dat" ));
    
    PrintWriter outfile = null;
    //null means blank, ready to write 
    outfile= new PrintWriter (new FileOutputStream ("result.dat"));
            
    for(campus=0;campus<3;campus++)
    {
      for(course=0;course<4;course++)
      {
      table[campus][course]= infile.nextInt();
      outfile.print(table[campus][course] + " ");
      }
      outfile.println();
    }
    infile.close();
    
    //The object is created and the constructor is called
    multiArray arr = new multiArray(table, outfile);
    arr.showTcampus();//call methods
    arr.showTcourse();
    outfile.close();
  }
}