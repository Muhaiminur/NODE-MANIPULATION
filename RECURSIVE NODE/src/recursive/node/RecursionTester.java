package recursive.node;

public class RecursionTester {

    public static void main(String[] args) {
        Object[] a = {"A", "B", "C", "D", "E"};
        int[] a1 = {7, 13, 19, 5, 2};
        Node n1 = new Node(7, null);
        Node n2 = new Node(13, null);
        Node n3 = new Node(19, null);
        Node n4 = new Node(5, null);
        Node n5 = new Node(8, null);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Node Head = n1;

        Factorial abir1 = new Factorial();
        System.out.println("========== Factorial Of 5 ================");
        System.out.println(abir1.Factorialmethod(5));

        System.out.println("========== Fibonacci Of 5 ================");
        Fibonacci abir2 = new Fibonacci();
        abir2.Fibonaccimethod(5);
        System.out.println("");

        System.out.println("========== Length of a String 'ABIR' ================");
        Length abir3 = new Length();
        System.out.println(abir3.LengthString("ABIR"));
        System.out.println("========== Length of a linked list '{7, 13, 19, 5, 8}' ================");
        System.out.println(abir3.Lengthlinkedlist(Head));

        System.out.println("========== Sequential search in a sequence ================");
        search abir4 = new search();
        System.out.println(abir4.searchLinkedList(Head, "c"));
        System.out.println(abir4.searchArray(a, 0, "D"));

        System.out.println("========== Binary search in a sorted array ================");
        Binarysearch abir5 = new Binarysearch();
        System.out.println(abir5.BinaryArray(a, 0, 4, "D"));

        System.out.println("========== Finding the maximum in a sequence (linear version) ================");
        Maximum abir6 = new Maximum();
        System.out.println(abir6.MaximumArray(a1, 0, 4));

        System.out.println("========== Finding the maximum in an array (binary version) ================");
        BinaryMaximum abir7 = new BinaryMaximum();
        System.out.println(abir7.BinaryMax(a1, 0, 4));

        System.out.println("========== Minimum ================");
        Minimum abir8 = new Minimum();
        System.out.println(abir8.MinNode(Head));
        //System.out.println(abir8.MinIndex(a1, 0, 4));

//        System.out.println("========== Selection sort ================");
//        SelectSort abir9 = new SelectSort();
//        abir9.SelectionSort(Head);
//        abir9.print(Head);
//        abir9.SelectionSortArray(a1, 0, 4);
//        abir9.SelectionSortArray(a1, 0, 4);
//        for (int c = 0; c < a1.length; c++) {
//            System.out.println(a1[c]);
//        }

        System.out.println("========== Exponentiation – an (2,3) ================");
        Exponentiation abir10 = new Exponentiation();
        System.out.println(abir10.Exp(2, 3));
    }
}
