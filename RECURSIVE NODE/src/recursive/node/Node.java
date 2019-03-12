package recursive.node;
public class Node{
  public Object ele=null;
  public Node next=null;
  Node(Object o,Node n){
    ele=o;
    next=n;
  }
  public String toString(){
    return (int)ele+"";
  }
}