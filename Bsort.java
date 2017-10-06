public class Bsort
{
  //instance variables
  int List[], i, flag=0, temp, count=5;
  
  //Constructor 
  public Bsort(int List[])
  {
    this.List=List; //will go to the list in the variables 
  }
  
  public void sort()
  {
    while(flag==0)
    {
      flag=1; //stop the loop if no more swap
      
      for(i=0; i<count;i++)
      {
        if (List[i] > List[i+1])
        {
          temp=List[i];
          List[i]=List[i+1]; //swap
          List[i+1]=temp;
          flag=0;
        }//if
      } count--;//for
    }//while
  }
}