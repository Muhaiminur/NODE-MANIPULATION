package recursive.node;
public class Exponentiation{
  public int Exp(int m,int n){
    if(n==0){
      return 1;
    }else{
      return m*Exp(m,n-1);
    }
  }
}