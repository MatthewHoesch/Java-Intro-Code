//write a program to read F temp call a function (convert) to convert to C.

import java.util.Scanner; 
  public class temperature
{
  public static void main (String [] args)
  {
    double Ftemp, Ctemp;
    Scanner kb= new Scanner (System.in);
    System.out.println("Enter a temperature in F");
    Ftemp=kb.nextDouble();
  //Call function convert 
    Ctemp=convert(Ftemp);
    System.out.println("Ctemp = " + Ctemp + " degrees");
  }//Main
    public static double convert (double Ftemp)
  {
    double Ctemp;
    Ctemp=(Ftemp - 32.0)/1.8;
    return Ctemp;
  }//function
}//Class
    
    
    