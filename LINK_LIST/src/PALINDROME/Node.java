package PALINDROME;
public class Node{
  public Object element;
  public Node next;
  Node(Object e,Node n){
    element=e;
    next=n;
  }
  public String toString(){
    return element+" ";
  }
}