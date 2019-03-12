package recursive.node;
public class Length{
  public int LengthString(String s){
    if(s.equals("")){
      return 0;
    }else{
      return 1+LengthString(s.substring(1));
    }
  }
  public int Lengthlinkedlist(Node h){
    if(h==null){
      return 0;
    }else{
      return 1+Lengthlinkedlist(h.next);
    }
  }
}