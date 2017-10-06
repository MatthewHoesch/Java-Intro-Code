//Compute factorial of 5 
public class Factorial 
{
  public int Fact(int num)
  {
    if(num == 1)
      return 1;
    else 
      return(num * Fact(num-1));
  }
}
