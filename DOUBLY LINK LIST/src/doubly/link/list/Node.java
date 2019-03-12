package doubly.link.list;
public class Node{
  public Object elem;
  Node next;
  Node prev;
  Node(Object o,Node n,Node p){
    elem=o;
    next=n;
    prev=p;
  }
  public String toString(){
    return elem+" "+next+prev;
  }
}