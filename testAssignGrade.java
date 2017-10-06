import java.util.Scanner;
public class testAssignGrade
{
  public static void main(String[] args)
  {
    String name[]= new String[3];
    int score[] = new int [3];
    int i;
    
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter 3 last names and 3 scores");
    for(i=0;i<3; i++)
    {
      name[i]= kb.next();
      score[i]= kb.nextInt();
    }
    System.out.println();
    
    for(i=0; i<3; i++)
      System.out.println(name[i] + " " + score[i]);
    
    AssignGrade gr = new AssignGrade(name, score);
    
    gr.findgrade();
    gr.bsort();
  }
}
