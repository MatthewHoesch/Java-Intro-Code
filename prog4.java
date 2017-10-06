//Name: Matthew Hoesch
/* You are burning song music CDs for a party. Arranged a list of songs in the order in which you want to play. Space on the CD holds 100 minutes of music. Write a program to help you complete the task. 

Variable Dictionary:

Seconds = Number of seconds for each song.
Minutes = Number of minutes the song lasts.
sTime = The song time.
sNum = The song number.
tTime = The total time of a song.
count = Increasing by the amount of 1 per song time.
tMinutes = Total minutes that the song runs.
tSeconds = Total seconds left over on the song.
tLeft = Time left with space.
tLeftM = Time left in minutes.
tLeftS = Time left in seconds.

Input:
The total amount of seconds each song lasts.

Outputs:
The Song Number, Song time (In minutes and Seconds), Total Time of song (In minutes and seconds). 

*/
import java.io.*;//import the input/output files
import java.util.Scanner;
public class prog4 
{
  public static void main (String [] args) throws IOException
  {
    Scanner infile = new Scanner (new FileInputStream("data1.dat")); // data from the data1.dat file
    int Seconds;
    int Minutes;
    int sTime;
    int sNum=0;
    int tTime= 0;
    int count=0;
    int tMinutes;
    int tSeconds;
    int tLeft;
    int tLeftM;
    int tLeftS;
    int CDLength=6000;
    int i;
     
    PrintWriter outfile = null;
    
    outfile = new PrintWriter
              (new FileOutputStream ("result.dat")); //results printed on the file result.dat
    System.out.println("Wrting to a file");
    
    
  outfile.println("Song  " + "\t" + "      SongTime     " + "\t" + "    TotalTime  ");
  outfile.println("Number  " +"\t" + "Minutes   Seconds" + "\t"  + "   Minutes    Seconds");
  outfile.println("_______________________________________________________________________");
  
  while(infile.hasNextInt())
  {
    sTime = infile.nextInt();
    Minutes = sTime/60;
    Seconds = sTime%60;
    tTime = tTime + sTime;
    tMinutes = tTime/60;
    tSeconds = tTime%60;
    sNum++;
   
  outfile.println(sNum + "          " + Minutes + "          " + Seconds + "          " 
                    + tMinutes + "          " + tSeconds);
  
  }
  
  tLeft = CDLength - tTime;
  tLeftM = tLeft/60;
  tLeftS = tLeft%60;
  outfile.println("There are " + tLeftM + " minutes and " + tLeftS + " seconds left on the 100 minutes CD.");
  infile.close();
  outfile.close();
  }
  
  
}


      
    
  

      
      
      
      