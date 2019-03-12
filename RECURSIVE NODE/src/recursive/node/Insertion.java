package recursive.node;
public class Insertion{
  public void InsertionSort(int[]a,int start,int end){
    if(start>=end){
      return;
    }else{
      InsertionSort(a,start,end-1);
      // Now insert the r'th key by moving leftwards
      int key=a[end];
      int c=end-1;
      // Shift left, making room for the key
      while(c>=0 && key<a[c]){
        a[c+1]=a[c];
        c--;
      }
      // Now insert the key in the right position
      a[c+1]=key;
    }
  }
}