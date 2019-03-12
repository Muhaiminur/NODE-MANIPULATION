package recursive.node;
public class Factorial{
  public int Factorialmethod(int o){
    if(o==0 ||o==1){
      return 1;
    }else{
      return o*Factorialmethod(o-1);
    }
  }
}