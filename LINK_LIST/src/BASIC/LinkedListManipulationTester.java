package BASIC;

import java.util.Scanner;

public class LinkedListManipulationTester {

    public static void main(String[] args) {
        LinkedListManipulation abir = new LinkedListManipulation();
        //Creating a list of elements
        Node Head = null;
        Node n1 = new Node("A", null);
        Node n2 = new Node("B", null);
        Node n3 = new Node("I", null);
        Node n4 = new Node("R", null);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        Head = n1;
        //Iterating over the elements
        System.out.println("========Iterate LINK LIST=======");
        abir.IterateElements(Head);
        System.out.println(n1);
        System.out.println(n1.next);
        //Counting the number of elements in a list
        System.out.println("========Count LINK LIST=======");
        abir.CountElements(Head);
        //Getting an element given the index into a list
        System.out.println("========Node At 2 LINK LIST=======");
        Node at = (Node) abir.NodeAt(Head, 2);
        System.out.println(at.element);
        //Setting an element given the index into a list
        System.out.println("========Insert into LINK LIST=======");
        Node insert = abir.SetElement(Head, 2, "M");
        abir.IterateElements(insert);
        //Searching for an element in a list
        System.out.println("========Search index LINK LIST=======");
        int index = abir.SearchElement(Head, "R");
        System.out.println(index);
        //Inserting an element into a list
        System.out.println("========Insert Node into LINK LIST=======");
        Node insert_node = abir.Insert(Head, 2, "M");
        abir.IterateElements(insert_node);
        //Removing an element from a list
        System.out.println("========Remove From LINK LIST=======");
        Node remove = abir.Remove(Head, 0);
        abir.IterateElements(remove);
        //Copying a list
        System.out.println("========Copy LINK LIST=======");
        Node copy = abir.CopyLinkedList(Head);
        abir.IterateElements(copy);
        //Reversing a list
        System.out.println("========Reverse LINK LIST=======");
        Node reverse = abir.ReverseLinkedList(Head);
        abir.IterateElements(reverse);
        //Rotating a list left
        System.out.println("========Rotate Left LINK LIST=======");
        Node Rotate_Left = abir.RotateLeft(Head);
        abir.IterateElements(Rotate_Left);
        //Rotating a list right
        System.out.println("========Rotate Right LINK LIST=======");
        Node Rotate_right = abir.RotateRight(Head);
        abir.IterateElements(Rotate_right);

    }
}
