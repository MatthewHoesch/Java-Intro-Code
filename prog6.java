//Name : Matthew Hoesch
//Write a program that will calculate and itemize the charges for each package
/* Variable Dictionary:
 * option= The option of choice to pick the package.
 * NumPeople= Number of people.
 * Days= Number of days.
 * CIstrn= Climbing Instruction.
 * Erental= Equipment rental.
 * SInst= Scuba Instruction.
 * LodgingWL= Lodging at "Wilderness Lodge".
 * LodgingLI= Lodging at "Luxury Inn".
 * Answer= Answer of true or false.
 * Deposit= The sum needed to pay for half of the trip, to reserve your trip, to set money down for it.
 * Rate= The total cost of the trip.
 * BaseCharge= The base charge.
 * */
/* Input:
 * The option of what package.
 * The number of people.
 * The amount of days staying and the amount for equipment rental.
 * The answer of true or false.
 * Output:
 * The Total Rate for the trip. 
 * The Total Deposit for the trip.
 * */
import java.io.*;
import java.util.Scanner;
public class prog6
{
  public static void main (String[] args) throws IOException
  {
    int option; 
    int NumPeople = 0;
    
    Scanner kb= new Scanner (System.in);
    
    PrintWriter outfile = null;  
    outfile = new PrintWriter
              (new FileOutputStream ("Trip.dat"));
    System.out.println("Wrting to a file");
    
    travAgency TA = new travAgency(NumPeople, outfile);
    
    TA.menu();
  do
   {
    System.out.println("Which travel package are you looking for?");
    option = kb.nextInt();
    
      switch(option)
      {
        case 1: TA.Climbing(); //Devils Courthouse Adventure weekend Package
                break;
                
        case 2: TA.Scuba(); //Scuba Bahamas Package
                break;
                
        case 3: TA.SkyDive(); //Sky Dive Colorado Pacakge
                break;
                
        case 4: TA.Spelunk(); //Barron Cliff Spelunk Package
                break; 
        
        case 5: System.out.println("Quit"); //Quit options
                break;
      }
  }while (option != 5); outfile.close(); //Press 5 to quit
  }
}
        
    