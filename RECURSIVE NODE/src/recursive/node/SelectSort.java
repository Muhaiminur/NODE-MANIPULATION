package recursive.node;
public class SelectSort extends Minimum{
  public void SelectionSort(Node h){
    if(h==null||h.next==null){
      return;
    }else{
      Node min=MinNode(h);
      swap(h,min);
      System.out.println(h.ele);
      SelectionSort(h.next);
    }
  }
  public void SelectionSortArray(int[]a,int start,int end){
    if(start>=end){
      return;
    }else{
      int min=MinIndex(a,start,end);
      swapArray(a,start,min);
      SelectionSortArray(a,start+1,end);
    }
  }
  public void swap(Node h,Node m){
    Node temp=h.next;
    h.next=m.next;
    m.next=temp;
    h=m;
  }
  public void swapArray(int[]a,int from,int to){
    int temp=a[from];
    a[from]=a[to];
    a[to]=temp;
  }
    
  public void print(Node h){
    for(Node n=h;n!=null;n=n.next){
      System.out.println(n.ele);
    }
  }
    
}