package BASIC;

public class LinkedListManipulation {
    //Creating a list of elements
    //Iterating over the elements

    public void IterateElements(Node h) {
        for (Node n = h; n != null; n = n.next) {
            System.out.print(n.element + " , ");
        }
        System.out.println("");
    }
    //Counting the number of elements in a list

    public Object CountElements(Node h) {
        int count = 0;
        for (Node n = h; n != null; n = n.next) {
            count++;
        }
        System.out.println(count);
        return count;
    }
    //Getting an element given the index into a list

    public Object NodeAt(Node h, int index) {
        Node n = h;
        for (int c = 0; c < index; c++) {
            n = n.next;
        }
        return n;
    }
    //Setting an element given the index into a list

    public Node SetElement(Node h, int index, Object elem) {
        Node n = (Node) NodeAt(h, index);
        if (n == null) {
            return null;
        }
        n.element = elem;
        return h;
    }
    //Searching for an element in a list

    public int SearchElement(Node h, Object elem) {
        int count = 0;
        for (Node n = h; n != null; n = n.next) {
            if (elem.equals(n.element)) {
                return count;
            }
            count++;
        }
        return -1;
    }
    //Inserting an element into a list

    public Node Insert(Node h, int index, Object elem) {
        Node ne = new Node(elem, null);
        if (index == 0) {
            ne.next = h;
            Node head = ne;
        } else {
            Node pre = (Node) NodeAt(h, index - 1);
            ne.next = pre.next;
            pre.next = ne;
        }
        return h;
    }
    //Removing an element from a list

    public Node Remove(Node h, int index) {
        Node ne;
        if (index == 0) {
            ne = h;
            h = h.next;
        } else {
            Node pre = (Node) NodeAt(h, index - 1);
            ne = pre.next;
            pre.next = pre.next.next;
        }
        ne = null;
        return h;
    }
    //Copying a list

    public Node CopyLinkedList(Node h) {
        Node CopyHead = null;
        Node CopyTail = null;
        for (Node n = h; n != null; n = n.next) {
            Node mn = new Node(n.element, null);
            if (CopyHead == null) {
                CopyHead = mn;
                CopyTail = CopyHead;
            } else {
                CopyTail.next = mn;
                CopyTail = CopyTail.next;
            }
        }
        return CopyHead;
    }
    //Reversing a list

    public Node ReverseLinkedList(Node h) {
        Node NewHead = null;
        for (Node n = h; n != null; n = n.next) {
            Node mn = new Node(n.element, null);
            mn.next = NewHead;
            NewHead = mn;
        }
        return NewHead;
    }
    //Rotating a list left

    public Node RotateLeft(Node h) {
        Node oldHead = h;
        h = h.next;
        Node n = h;
        for (; n.next != null; n = n.next) {
        }
        n.next = oldHead;
        oldHead.next = null;
        return h;
    }

    public Node RotateRight(Node h) {
        Node p = null;
        Node q = h;
        for (; q.next != null; q = q.next) {
            p = q;
        }
        q.next = h;
        h = q;
        p.next = null;
        return h;
    }
}
