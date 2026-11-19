package linkedlist;

public class CircularLinkedList {
   
    // 1. Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 2. Create nodes
    Node first;
    Node last;

    // 3. Constructor
    CircularLinkedList() {
        first = null;
        last = null;
    }
    void insertAtBeginning(int data) {
        if (first == null) {
            first = new Node(data);
            last = first;
            last.next = first;
            return;
        }
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
        last.next = first;
    }
    void insertAtEnd(int data) {
        if (first == null) {
            first = new Node(data);
            last = first;
            last.next = first;
            return;
        }
        Node newNode = new Node(data);
        last.next = newNode;
        last = newNode;
        last.next = first;
    }
    void insertAtPosition(int data, int position) {
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = first;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == first) {
                System.out.println("Position out of bounds");
                return;
            }
        }
        newNode.next = current.next;
        current.next = newNode;
        if (current == last) {
            last = newNode;
        }
    }
    void display() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = first;
        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != first);
        System.out.println();
    }
    void deleteAtBeginning() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        if (first == last) {
            first = null;
            last = null;
            return;
        }
        first = first.next;
        last.next = first;
    }
    void deleteAtEnd() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        if (first == last) {
            first = null;
            last = null;
            return;
        }
        Node current = first;
        while (current.next != last) {
            current = current.next;
        }
        current.next = first;
        last = current;
    }
    void deleteAtPosition(int position) {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        if (position == 0) {
            deleteAtBeginning();
            return;
        }
        Node current = first;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
            if (current == first) {
                System.out.println("Position out of bounds");
                return;
            }
        }
        if (current.next == first) {
            System.out.println("Position out of bounds");
            return;
        }
        if (current.next == last) {
            deleteAtEnd();
            return;
        }
        current.next = current.next.next;
    }
    void search(int data) {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        Node current = first;
        int position = 0;
        do {
            if (current.data == data) {
                System.out.println("Element " + data + " found at position " + position);
                return;
            }
            current = current.next;
            position++;
        } while (current != first);
        System.out.println("Element " + data + " not found in the list");
    }
   public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtBeginning(5);
        cll.insertAtPosition(15, 2);
        cll.display(); // Output: 5 10 15 20 30
        cll.deleteAtBeginning();
        cll.display(); // Output: 10 15 20 30
        cll.deleteAtEnd();
        cll.display(); // Output: 10 15 20
        cll.deleteAtPosition(1);
        cll.display(); // Output: 10 20
        cll.search(20); // Output: Element 20 found at position 1
        cll.search(100); // Output: Element 100 not found in the list
    }
}
