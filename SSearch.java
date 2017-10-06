public class SSearch
{
  int list[], flag=0, key, i;
  public SSearch(int list[],int key)
  {
    this.list= list;
    this.key= key;
  }
  public void search()
  {
    for (i=0;i<6;i++)
    {
      if (key == list[i])
      {
        flag=1;
        break;
      }
      
    }
    if (flag==1)
      System.out.println("Key is found at position " + i);
    else
      System.out.println("Key is not found");
  }
}