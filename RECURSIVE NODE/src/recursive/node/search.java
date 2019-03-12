package recursive.node;
public class search{
  public boolean searchArray(Object[]a,int x,Object key){
    if(x>=a.length){
      return false;
    }else if(a[x]==key){
      return true;
    }else{
      return searchArray(a,x+1,key);
    }
  }
  public boolean searchLinkedList(Node h,Object key){
    if(h==null){
      return false;
    }else if(h.ele==key){
      return true;
    }else{
      return searchLinkedList(h.next,key);
    }
  }
  
}