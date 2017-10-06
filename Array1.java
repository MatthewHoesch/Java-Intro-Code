public class Array1
{
  //Instance Variables 
  int list[], count, i;
  double sum, avg, diff;
  
  public Array1 (int list[])
  {
    this.list= list;
  }
  
  public void findavg()
  {
    sum =0;
    count=0;
    for(i=0; i<5;i++)
    {
      sum= sum+ list[i];
      count++;
    }
    
    avg= sum/count;
    System.out.println("Avg = " + avg);
    System.out.println();
  }
  
  public void finddiff()
  {
    for (i=0; i<list.length;i++)
    {
      diff = avg- list[i];
      System.out.println("The difference between " + avg + " and " + list[i] + " = " +diff);
    }
  }
}