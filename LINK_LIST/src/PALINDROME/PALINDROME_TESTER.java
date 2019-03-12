package PALINDROME;

public class PALINDROME_TESTER {

    public static void main(String[] args) {
        PALINDROME abir = new PALINDROME();
        Object[] a = {1, 2, 3};
        System.out.println("Before Palindrome");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" , ");
        }
        System.out.println("");
        
        System.out.println("Palindrom From Array");
        //Output should be: 1 2 3 3 2 1
        abir.makePalindrome(a);
        abir.printList();
        System.out.println("");
        //Output should be: 1 2 3 3 2 1 1 2 3 3 2 1
        
        System.out.println("Palindrom From NODE");
        abir.makePalindromeFromList();
        abir.printList();
        System.out.println("");
        //abir.reverse();
        //abir.printreverse();
    }
}
