import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Queue {
    /**
     * Unit tests the {@code Queue} data type.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    }
}

class queue<Item> {
    private int n;         // number of elements on queue
    private Node first;    // beginning of queue
    private Node last;     // end of queue

    // helper linked list class
    private class Node {
        private Item item;
        private Node next;
    }

    public queue() {
        first = null;
        last  = null;
        n = 0;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }

    public int length() {
        return n;
    }


    public Item peek() {
        if ( isEmpty() ) throw new NoSuchElementException("Queue underflow");
        return first.item;
    }

    public void enqueue(Item item) {
        Node oldlast = last;
        last = new Node();
        last.item = item;
        last.next = null;
        if ( isEmpty() )
            first = last;
        else
            oldlast.next = last;
        n++;
    }

    public Item dequeue() {
        if ( isEmpty() ) throw new NoSuchElementException("Queue underflow");
        Item item = first.item;
        first = first.next;
        n--;
        if (isEmpty()) last = null;
        return item;
    }
}
