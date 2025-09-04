public class LinkedList {
    // Node class
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    // Head and tail references
    private Node head;
    private Node tail;

    // Add to the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

        // If the list was empty, tail should also point to newNode
        if (tail == null) {
            tail = newNode;
        }
    }

    public void addAt(int index, int data) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index must be >= 0");
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;
        int currentIndex = 0;

        // Traverse to the node just before the desired index
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;

        // If the new node is added at the end, update tail
        if (newNode.next == null) {
            tail = newNode;
        }
    }


    // Add to the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (tail != null) {
            tail.next = newNode;
        }
        tail = newNode;

        // If the list was empty, head should also point to newNode
        if (head == null) {
            head = newNode;
        }
    }

    public void removeAt(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Index must be >= 0");
        }

        if (head == null) {
            throw new IllegalStateException("List is empty");
        }

        // Remove the head
        if (index == 0) {
            head = head.next;
            // If list is now empty, reset tail
            if (head == null) {
                tail = null;
            }
            return;
        }

        Node current = head;
        int currentIndex = 0;

        // Traverse to node just before the one to remove
        while (current != null && currentIndex < index - 1) {
            current = current.next;
            currentIndex++;
        }

        // If we're at the end or next node is null, index is invalid
        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        // Bypass the node to remove
        current.next = current.next.next;

        // If we removed the last node, update tail
        if (current.next == null) {
            tail = current;
        }
    }


    // Remove the first element
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        head = head.next;

        // If the list becomes empty, tail must also be null
        if (head == null) {
            tail = null;
        }
    }

    // Print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}