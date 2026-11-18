
package linkedlist;

public class DoubleList {

    // 1. Node class
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // 2. Create nodes
    Node first;
    Node last;

    // 3. Constructor
    DoubleList() {
        first = null;
        last = null;
    }
    void insertAtBeginning(int data) {
        if (first == null) {
            first = new Node(data);
            last = first;
            return;

        }
        Node newNode = new Node(data);
        newNode.next = first;
        first.prev = newNode;
        first = newNode;
    }
    void insertAtEnd(int data) {
        if (first == null) {
            first = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.prev = current;
    }
    void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = first;
        for (int i = 0; i < position - 1; i++) {
            if (current == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        newNode.next = current.next;
        if (current.next != null) {
            current.next.prev = newNode;
        }
        current.next = newNode;
        newNode.prev = current;
    }

    // 4. Display
    void display() {
        Node current = first;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        DoubleList list = new DoubleList();
        list.insertAtBeginning(11);
        list.insertAtBeginning(12);
        list.insertAtBeginning(13);
        list.insertAtEnd(15);
        list.insertAtPosition(14, 3);
        list.display();
    }
}
