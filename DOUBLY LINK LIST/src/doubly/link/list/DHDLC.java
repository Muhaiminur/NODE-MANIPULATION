package doubly.link.list;
public class DHDLC{
  //Creating a list of elements
  //Iterating over the elements
  //Iterating over the elements
  public void Iterating(Node h){
    System.out.println("===================Printing forword====================");
    for(Node n=h.next;n!=h;n=n.next){
      System.out.print(n.elem+",");
    }
      System.out.println("");
    System.out.println("========================printing backword======================");
    for(Node n=h.prev;n!=h;n=n.prev){
      System.out.print(n.elem+", ");
    }
      System.out.println("");
  }
  //Inserting an element into a list
  public static Node insertAfter(Node pre,Object elem){
    Node notun=new Node(elem,null,null);
    Node temp=pre.next;
    notun.next=pre.next;
    notun.prev=pre;
    pre.next=notun;
    temp.prev=notun;
    return  pre;
  }
  //Insert anywhere
  public static void insert(Node header,Object elem,int index){
    Node pre=null;
    if(index==0){
      pre=header;
    }else{
      pre=header.next;
      for(int c=0;c<index-1;c++){
        pre=pre.next;
      }
    }
    insertAfter(pre,elem);
  }
  //Removing an element from a list
  public static void removeNode(Node n){
    Node p=n.next;
    Node q=n.prev;
    q.next=p;
    p.prev=q;
  }
}