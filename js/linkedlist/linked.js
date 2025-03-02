// Node class represents each element in the linked list
class Node {
    constructor(data) {
      this.data = data;  // Data of the node
      this.next = null;   // Points to the next node (null initially)
    }
  }
  
  // LinkedList class manages the linked list operations
  class LinkedList {
    constructor() {
      this.head = null;  // Points to the first node in the list
    }
  }
  
  // Example usage: Create an empty linked list
  const list = new LinkedList();
  