package recursive.node;
public class Minimum{
  public Node MinNode(Node h){
    if(h.next==null){
      return h;
    }else{
      Node min=h;
      Node minRest=MinNode(h.next);
      if(((Comparable)minRest.ele).compareTo(min.ele)<0){
        min=minRest;
      }
      return min;
    }
  }
  public int MinIndex(int[]a,int start,int end){
    if(start==end){
      return start;
    }else{
      int mid=(start+end)/2;
      int minLeft=MinIndex(a,start,mid);
      int minRight=MinIndex(a,mid+1,end);
      int minIndex=minLeft;
      if(a[minRight]<a[minLeft]){
        minIndex=minRight;
      }
      return minIndex;
    }
  }
}