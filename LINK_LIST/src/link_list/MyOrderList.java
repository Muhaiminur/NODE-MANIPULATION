package link_list;
public class MyOrderList{
  static Node cursor=null;
  Node head;
  MyOrderList(){
    head=new Node(null);
    //
  }
  //void insert (Node newElement)
  public void insert(Node newElement){
    if(head.next==null){
      head.next=newElement;
      newElement.next=head;
      cursor=newElement;
    }else if(head.next.next==null){
      if(head.next.elem <= newElement.elem){
        head.next.next=newElement;
        newElement.next=head;
        //System.out.println(head.next.elem+" "+head.next.next.elem);
      }else if(head.next.elem>newElement.elem){
        newElement.next=head.next;
        newElement.next.next=head.next;
        head.next=newElement;
        //System.out.println(head.next.elem+" "+head.next.next.elem);
      }
    }else{
      for(Node n=head.next;n!=head;n=n.next){
        if(n==head.next && newElement.elem<n.elem){
          newElement.next=n;
          head.next=newElement;
        }else if(n.next==head && n.elem<newElement.elem){
          n.next=newElement;
          newElement.next=head;
        }else if(newElement.elem>n.elem && newElement.elem<n.next.elem){
          newElement.next=n.next;
          n.next=newElement;
        }
      }
      for(Node p=head.next;p!=head;p=p.next) {
        System.out.print(p.elem+ " ");
      }
      System.out.println();
    }
  }
  //Node retrieve (int searchKey)
  public Node retrieve(int searchKey){
    if(head.next==null){
      return null;
    }
    int count=0;
    for(cursor=head.next;cursor!=head;cursor=cursor.next,count++){
      if(cursor.elem==searchKey){
        System.out.println("cursor = "+cursor +"which has elem = "+cursor.elem+"at "+count);
        return cursor;
      }
    }
    System.out.println("pai ni");
    return cursor;
  }
  //Node remove ( )
  public Node remove(){
    if(head.next==null){
      return null;
    }
    for(Node n=head.next;n!=head;n=n.next){
      if(head.next==cursor && cursor.next==head){
        Node r=cursor;
        cursor=null;
        System.out.println(cursor +" = i delete,there is no list");
        return r;
      }else if(head.next==cursor && cursor.next!=head){
        Node r=cursor;
        n.next=cursor.next;
        cursor=cursor.next;
        System.out.println(r +" = delete");
        return r;
      }else if(cursor.next==head && n.next==cursor){
        Node r=cursor;
        n.next=head;
        cursor=head.next;
        System.out.println("Element "+" :"+r.elem+" removed .");
        return r;
      }else if(n.next==cursor && cursor.next!=head){
        Node r=cursor;
        n.next=cursor.next;
        cursor=cursor.next;
        System.out.println(r +" = i delete done");
        return r;
      }
    }
    System.out.println("nai");
    return null;
  }
  //Node remove (int deleteKey)
  public Node remove(int deleteKey){
    if(head.next==null){
      return null;
    }
    for(Node n=head.next;n!=head;n=n.next){
      if(n.elem==deleteKey){
        cursor=n;
        return remove();
      }
    }
    return null;
  }
  //void clear ( )
  public void clear(){
    if(head.next==null){
      System.out.println("list is null");
    }
    head.next=null;
    System.out.println("all the data are clear");
  }
  //boolean isEmpty ( )
  public boolean isEmpty(){
    if(head.next==null){
      System.out.println("list is null");
      return true;
    }else{
      System.out.println("list is not null");
      return false;
    }
  }
  //Node gotoBeginning ( )
  public Node gotoBeginning(){
    if(head.next==null){
      System.out.println("list is null");
      return null;
    }else{
      cursor=head.next;
      System.out.println(cursor +" =is at Beginning and element is "+cursor.elem);
      return cursor;
    }
  }
  //Node gotoEnd ( )
  public Node gotoEnd(){
    if(head.next==null){
      System.out.println("list is null");
      return null;
    }else{
      for(Node n=head.next;n!=head;n=n.next){
        if(n.next==head){
          cursor=n;
        }
      }
      System.out.println(cursor +" =is at Beginning and element is "+cursor.elem);
      return cursor;
    }
  }
  //Node gotoNext ( )
  public Node gotoNext(){
    if(head.next==null){
      System.out.println("list is null");
      return null;
    }else if(cursor.next==head && head.next==cursor) {
      System.out.println("there is only 1 element in the list."+cursor+" : "+cursor.elem );
      return cursor;
    }else if(cursor.next==head){
      cursor=head.next;
      System.out.println(cursor+" : contains "+ cursor.elem);
      return cursor;
    }else{
      cursor=cursor.next;
      System.out.println(cursor+" : contains "+ cursor.elem);
      return cursor;
    }
  }
  //Node gotoPrior ( )
  public Node gotoPrior(){
    if(head.next==null){
      System.out.println("list is null");
      return null;
    }else if(cursor.next==head && head.next==cursor) {
      System.out.println("there is only 1 element in the list."+cursor+" : "+cursor.elem );
      return cursor;
    }else{
      for(Node n=head.next;n!=null;n=n.next){
        if(n.next==cursor){
          cursor=n;
          System.out.println(cursor+" : contains "+ cursor.elem);
          return cursor;
        }else if(head.next==cursor && n.next==head){
          cursor=n;
          System.out.println(cursor+" : contains "+ cursor.elem);
          return cursor;
        }
      }
    }
    return null;
  }
  //Node getCursor ( )
  public Node getCursor(){
    if(head.next==null){
      System.out.println("list is null");
      return null;
    }
    System.out.println(cursor+" : contains "+ cursor.elem);
    return cursor;
  }
  //void showList ( )
  public void showList(){
    if(head.next==null){
      System.out.println("list is null");
    }else{
      for(Node n=head.next;n!=head;n=n.next){
        System.out.println(n.elem);
      }
    }
  }
}