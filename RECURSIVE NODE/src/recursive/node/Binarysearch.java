package recursive.node;
public class Binarysearch{
  public boolean BinaryArray(Object[]a,int start,int end,Object key){
    if(start>end){
      return false;
    }else{
      int mid=(start+end)/2;
      if(a[mid]==key){
        return true;
      }else if(((Comparable)key).compareTo(a[mid])>0){
        return BinaryArray(a,mid+1,end,key);
      }else{
        return BinaryArray(a,start,mid-1,key);
      }
    }
  }
}