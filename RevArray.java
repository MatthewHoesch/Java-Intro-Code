public class RevArray
{
  public static void main(String[]args)
  {
    int list[]={12,34,45,43,21,67,89,66};
    int i, temp, left=0, right= list.length-1;
    
    while (left <= right)
    {
      temp= list[left];
      list[left]= list[right];
      list[right] = temp;
      right--;
      left++;
    }
    for(i=0; i< list.length; i++)
      System.out.print(list[i] + " ");
    System.out.println();
  }
}
