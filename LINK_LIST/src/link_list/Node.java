package link_list;
public class Node{
  int elem;
  Node next;
  Node(){
  }
  Node(Node n){
    next=n;
  }
  Node(int o,Node n){
    elem=o;
    next=n;
  }
  public String toString(){
    return elem+" ";
  }
}