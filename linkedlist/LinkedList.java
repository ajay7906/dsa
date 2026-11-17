package linkedlist;

public class LinkedList {
    // create a node class
    class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    Node first = new Node(12);
    Node second = new Node(13);
    Node third = new Node(14);
    LinkedList() {
        first.next = second;
        second.next = third;
    }
    void insertAtBeginning(int data) {
        // if the list is empty
        if (first == null) {
            first = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = first;
        first = newNode;
    }
    void insertAtEnd(int data) {
        if(first == null) {
            first = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        Node current = first;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
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
        current.next = newNode;
    }
    void deleteAtBeginning() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        first = first.next;
    }
    void deleteAtEnd() {
        if (first == null) {
            System.out.println("List is empty");
            return;
        }
        if (first.next == null) {
            first = null;
            return;
        }
        Node current = first;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }
     void deleteAtPosition(int position) {
        if (position == 0) {
            deleteAtBeginning();
            return;
        }
        Node current = first;
        for (int i = 0; i < position - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Position out of bounds");
            return;
        }
        current.next = current.next.next;
    }
    
    void Display() {
        Node current = first;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.Display();
        list.insertAtBeginning(11);
        list.insertAtEnd(15);
        list.insertAtPosition(16, 3);
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.deleteAtPosition(1);
        list.Display();
    }
    
}
