// Make a program that translates the Score received into a grade.
// Matthew Hoesch
import java.util.Scanner;
  public class Grade
{
  public static void main (String[] args)
  {
    Scanner kb = new Scanner (System.in);
    
    int Score;
    char Grade;
    
    System.out.println("Enter your Score");
    Score=kb.nextInt();
    
    if (Score >=90)
      Grade='A';
      else if (Score >=80)
      Grade='B';
      else if (Score >=70)
      Grade='C';
      else if (Score >=60)
      Grade='D';
      else
      Grade='F';
      
      System.out.println("Your grade is a " + Grade);
  }
}
      
      
      
      