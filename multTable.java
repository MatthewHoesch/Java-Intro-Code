import java.util.Scanner;
public class multTable
{
  public static void main (String[] args)
  {
    Scanner kb= new Scanner (System.in);
    int num1, num2, Sum;
  } 

for (i=0; i<4; i++)
{
  for (j=0; j<5; j++)

  num1=kb.nextInt();
  num2=kb.nextInt();
  Sum=num1 * num2;
  System.out.println(num1 + "*" + num2 + "=" + Sum);
  System.out.println("--------------");
}

