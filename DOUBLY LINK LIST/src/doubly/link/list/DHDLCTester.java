package doubly.link.list;
public class DHDLCTester{
  public static void main(String[]args){
    DHDLC abir1=new DHDLC();
    //Creating a list of elements
    // Create the dummy head node
    Node header=new Node(null,null,null);
    // And then make it circular
    header.next=header;
    header.prev=header;
    //add a single int element
    Node n1=new Node(55,null,null);
    Node n2=new Node(44,null,null);
    Node n3=new Node(66,null,null);
    n1.next=header.next;
    n1.prev=header;
    header.next=n1;
    header.prev=n1;
    n1.next=n2;
    n2.prev=n1;
    n2.next=header;
    header.prev=n2;
    n2.next=n3;
    n3.prev=n2;
    n3.next=header;
    header.prev=n3;
    abir1.Iterating(header);
    
    //Inserting an element into a list
    System.out.println("======================== ADDING AFTER 99 ======================");
    abir1.insertAfter(header,99);
    abir1.Iterating(header);
    System.out.println("======================== ADDING 3333 at index 2 ======================");
    abir1.insert(header,3333,2);
    abir1.Iterating(header);
    
    System.out.println("======================== REMOVE 55 ======================");
    //Removing an element from a list
    abir1.removeNode(n1);
    abir1.Iterating(header);
  }
}