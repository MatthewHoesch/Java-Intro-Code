public class findMaxMin
{
  public static void main (String[]args)
  {
    int num[]= {12,97,14,3,101,10};
    int min=10000, max=0, i;
    
    for(i=0;i<6;i++)
    {
      if(max<num[i])
        max=num[i];
      if(min>num[i])
        min=num[i];
    }
    System.out.println("The max number is =" + max);
    System.out.println("The min number is =" + min);
  }
}
  
      