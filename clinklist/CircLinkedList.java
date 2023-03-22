/*
 * Antonio O.
 * Advanced Data Structures 282
 * 
 */
package clinklist;

/**
 *
 * @author antonioolivera
 */
public class CircLinkedList {

    public class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node current;

    CircLinkedList() {
        current = null;

    }
    // Creating the insert method

    void insert(int data) {
        Node newNode = new Node(data);
        if (current == null) {
            newNode.next = newNode;
            current = newNode;
        } else {
            newNode.next = current.next;
            current.next = newNode;
        }
    }
    // Creating the delete method

    void delete() {
        if (current != null) {
            if (current.next == current) {
                current = null;
            } else {
                current.next = current.next.next;
            }
        }
    }

    void step() {
        if (current != null) {
            current = current.next;
        }
    }

    void print() {
        if (current != null) {
            Node temp = current;
            do {
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != current);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
