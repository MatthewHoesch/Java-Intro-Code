import java.io.*;
import java.util.Scanner;
public class travAgency
{
//Instance Variables
    int option;
    int NumPeople;
    int Days;
    int CInstrn;
    int Erental;
    int SInst;
    int LodgingWL;
    int LodgingLI;
    boolean Answer;
    double Deposit;
    double Rate;
    double BaseCharge=0;
    PrintWriter outfile;
  Scanner KB = new Scanner(System.in);
  
  public travAgency(int NumPeople, PrintWriter outfile)
  {
    this.NumPeople = NumPeople;
    this.outfile= outfile;
  }
  
  public void menu() //The options of vacation packages
  {
    System.out.println("\t 1:Devil'c Courthouse Adventure Weekend");
    System.out.println("\t 2:Scuba Bahama");
    System.out.println("\t 3:Sky Dive Colorado");
    System.out.println("\t 4:Barron Cliff Spelunk");
    System.out.println("\t 5:Quit");
  }
  
  public void Climbing()
  {
    System.out.println("How many people are going?");
    NumPeople= KB.nextInt();
    if(NumPeople >= 5) //If the number of people going is greater than 5 then the discount is 10% of the base charges.
    {
      BaseCharge = NumPeople * (350 *.9);
    }
    else 
    {
      BaseCharge = NumPeople * 350;
    }
    System.out.println("How many people need instruction?");
    NumPeople= KB.nextInt();
    CInstrn = NumPeople * 100; // The rate for climbing instruction.
    System.out.println("Do you need rental Equipment? true or false");
    Answer = KB.nextBoolean(); //Answer of true or false for equipment rental.
    if (Answer == true)
    {
      System.out.println("How many people need equipment? And for how many days?");
      NumPeople=KB.nextInt();
      Days= KB.nextInt();
      Erental = (40 * Days) * NumPeople; //The charge of equpment rental.
    }
    else
      Erental = 0;

    Rate= BaseCharge + CInstrn + Erental; //The total Rate for Climbing
    Deposit = Rate/2; //Total Deposit for Climbing 
    System.out.println("Press 5 to see your vacation plan");
    
    outfile.println("Devil's Courthouse Adventure Weekend");
    outfile.println("____________________________________");
    outfile.println("The rate of your trip is= $ " + Rate );
    outfile.println("The deposit will be =$ " + Deposit);
  }
    
  public void Scuba()
  {
    System.out.println("How many people are going?");
    NumPeople= KB.nextInt();
    if(NumPeople >= 5)
    {
      BaseCharge = NumPeople * (1000*.9);
    }
    else 
    {
      BaseCharge = NumPeople * 1000;
    }

    System.out.println("How many people need instruction?");
    NumPeople= KB.nextInt();
    SInst= NumPeople * 100; //Charge for scuba instruction
    Rate = BaseCharge + SInst; //Total rate for the Scuba trip
    Deposit = Rate/2; //Total Deposit for trip
    System.out.println("Press 5 to see your vacation plan");
   
    outfile.println("Scuba Bahama");
    outfile.println("____________________________________");
    outfile.println("The rate of your trip is =$ " + Rate);
    outfile.println("The deposit will be =$ " + Deposit);
  }
   
  public void SkyDive()
  {
    System.out.println("How many people are going?");
    NumPeople= KB.nextInt();
    if(NumPeople >= 5)
    {
      BaseCharge = NumPeople * (400*.9);
    }
    else 
    {
      BaseCharge = NumPeople * 400;
    }

    BaseCharge = NumPeople * 400;
    System.out.println("Will you be staying at the Wilderness Lodge? true or false"); 
    
    Answer = KB.nextBoolean();
    if (Answer == true)
    {
      System.out.println("How many days staying? With how many people?");
      Days= KB.nextInt();
      NumPeople= KB.nextInt();
      LodgingWL= (65 *Days) * NumPeople; //Rate for staying at the Lodge
      Rate= BaseCharge+ LodgingWL; //Total rate for trip
      Deposit = Rate/2; //Total deposit for trip
      System.out.println("Press 5 to see your vacation plan");
      
      outfile.println("Sky Dive Colorado");
      outfile.println("____________________________________");
      outfile.println("The rate of your trip is = $ " + Rate);
      outfile.println("The deposit will be =$ " + Deposit);
    }
    else
    {
      System.out.println("How many days staying? With how many people?");
      Days= KB.nextInt();
      NumPeople= KB.nextInt();
      LodgingLI= (120 *Days) * NumPeople; //Rate for the Inn
      Rate= BaseCharge + LodgingLI; //Total rate for the trip
      Deposit = Rate/2; //Total rate for deposit
      System.out.println("Press 5 to see your vacation plan");
     
      outfile.println("Sky Dive Colorado");
      outfile.println("____________________________________"); 
      outfile.println("The rate of your trip is = $ " + Rate);
      outfile.println("The deposit will be =$ " + Deposit);
    }
  }
  
  public void Spelunk()
  {
    System.out.println("How many people are going?");
    NumPeople= KB.nextInt();
    if(NumPeople >= 5)
    {
      BaseCharge= NumPeople * (700*.9);
    }
    else
    {
      BaseCharge= NumPeople * 700;
    }
    
    System.out.println("Do you need rental Equipment? true or false");
    Answer = KB.nextBoolean();
    if (Answer == true)
    {
      System.out.println("How many people need equipment? And for how many days?");
      NumPeople=KB.nextInt();
      Days= KB.nextInt();
      Erental = (400 * Days) * NumPeople;
    }
    else
      Erental = 0;
    Rate= BaseCharge + Erental; //Rate for the trip
    Deposit = Rate/2; //Total for deposit
    System.out.println("Press 5 to see your vacation plan");
    outfile.println("Barron Cliff Spelunk");
    outfile.println("____________________________________"); 
    outfile.println("The rate of your trip is= $ " + Rate );
    outfile.println("The deposit will be =$ " + Deposit);
  }
}

  
  
    
                        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    