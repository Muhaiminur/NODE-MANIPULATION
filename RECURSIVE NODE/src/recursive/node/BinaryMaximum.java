package recursive.node;
public class BinaryMaximum{
  public int BinaryMax(int[]a,int start,int end){
    if(start==end){
      return a[start];
    }else{
      int mid=(start+end)/2;
      int maxleft=BinaryMax(a,start,mid);
      int maxright=BinaryMax(a,mid+1,end);
      return Math.max(maxleft,maxright);
    }
  }
}