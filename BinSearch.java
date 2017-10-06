//"The best program"
public class BinSearch 
{
  public static int search (int list[], int key, int first, int last)
  {
    int mid; 
    mid = (first + last)/2;
    
    if (first>last)
      return -1; //key is found 
    
    else if (key == list[mid])//key is found in the mid
      return mid;
    else if (key < list[mid])
      return search(list, key, first, mid-1);//last does change 
    else  //if (key > list[mid])
      return search(list, key, mid+1, last);//first does change
  }
}
