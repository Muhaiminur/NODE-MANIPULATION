package PALINDROME;
public class PALINDROME{
  public Node head;
  Node no;
  public int size;
  public PALINDROME(){
    head = null;
    size = 0;
  }
  //  //Output should be: 1 2 3 3 2 1
 Object[]b=new Object[6];
 int count=0;
  public void makePalindrome(Object[]a){
    b=new Object[a.length+a.length];
    for(int c=0;c<a.length;c++,count++){
      b[c]=a[c];
    }
    for(int d=a.length-1;d>=0;d--){
      b[count]=a[d];
      count++;
    }
    Node n=new Node(b[0],null);
    int i=1;
    head = n;
    for( ; i<b.length; i++){
      n.next=new Node(b[i],null);
      n = n.next;
    }
  }
  public void printList(){
    for(Node n=head;n!=null;n=n.next){
      System.out.print(n.element);
    }
  }
  //public Node amni=reverse();
  //make reverse
  public Node reverse(){
    Node newHead=null;
    for (Node n=head;n!=null;n=n.next){
      Node newNode=new Node(n.element,n.next);
      newNode.next = newHead;
      newHead = newNode;
    }
    no=newHead;
    return newHead;
  }
  
//  public void printreverse(){
//    System.out.println("Printing reverse");
//    for(Node n=no;n!=null;n=n.next){
//      System.out.println(n.element);
//    }
//  }
  
  public void makePalindromeFromList(){
    System.out.println("Output should be: 1 2 3 3 2 1 1 2 3 3 2 1");
    Node re=reverse();
    Node n=head;
    while(n!=null){
      n=n.next;
      if(n.next==null)
        break;
    }
    n.next=no;
    //System.out.println("Output should be: 1 2 3 3 2 1 1 2 3 3 2 1");
  }
}