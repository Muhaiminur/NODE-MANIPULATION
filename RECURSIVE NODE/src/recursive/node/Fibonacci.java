package recursive.node;

public class Fibonacci {

    public static int Fibonaccimethod(int o) {
        if (o == 0 || o == 1) {
            return 1;
        } else {
            System.out.print(o + ", ");
            return Fibonaccimethod(o - 1) + Fibonaccimethod(o - 2);

        }
    }
}
