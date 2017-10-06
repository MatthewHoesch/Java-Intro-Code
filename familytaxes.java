import java.io.*;
public class familytaxes 
{
    String lname[];
    double Income[];
    double fIncome[] = new double [12];
    double taxrate;
    int i, flag;
    int members[];
    PrintWriter outfile;
    
    public familytaxes(String lname[] , double Income[], int members[],PrintWriter outfile)
    {
      this.lname= lname;
      this.Income= Income;
      this.members= members;
      this.outfile= outfile;
    }
    
    double tax[] = new double[4];
    double adjIncome[] = new double[4];
    public void tax()
    {
        for(i=0; i< 4; i++)
        {
             if(Income[i] < 60000) 
             {
            adjIncome[i] = Income[i] - (500 * members[i]);
            taxrate = adjIncome[i] / 100000;
            tax[i] = taxrate * adjIncome[i];
             
             }
             else  
             {
            adjIncome[i] = Income[i] - (500 * members[i]);
            taxrate = .50;
            tax[i] = taxrate * adjIncome[i];

             }
        }
        
        for(i=0; i<4 ; i++)
        outfile.println(lname[i] + "  \t\t\t\t\t\t\t  " + Income[i] + "  \t\t\t\t\t\t\t" + adjIncome[i] + "\t\t\t\t\t\t\t" + tax[i]);
    }
    
     public void sort()
    {
     String temp1;
     double temp2;
     int count =3; 
      while (flag == 0)
      {
        flag=1;
        for(i=0; i < count; i++)
        {
          if(lname[i].compareTo(lname[i+1]) > 0)
          {
            temp1= lname[i];
            lname[i]= lname[i+1];
            lname[i+1]= temp1;
            
            temp2= Income[i];
            Income[i] = Income[i+1];
            Income[i+1] = temp2;
            flag=0;
          }
          
        }count--;
      }
      outfile.println("The sorted average is : ");
      for(i=0;i<4;i++)
        outfile.println(lname[i] + "\t\t\t\t\t" + Income[i]);
      
    }
        
}

        
    
      
      
      