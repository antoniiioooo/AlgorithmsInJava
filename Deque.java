/*
 * Name: Antonio Olivera
 * Date: September 21, 2022
 * Queue Assignment Project
 * This code is based on queues and stack, based on an array
 */
package deques;


/**
 *
 * @author antonioolivera
 */

public class Deque {

    static class deque {

        // stores the data
        int[] array;
        int size;
        int capacity;

        // stores the front and rear index
        int front;
        int rear;

        // Constructor
        public deque() {
            array = new int[10];
            size = 0;
            capacity = 10;
            front = -1;
            rear = -1;
        }

        // If list is empty
        boolean isEmpty() {
            return size == 0;
        }

        // If list is full
        boolean isFull() {
            return size == capacity;
        }

        // Returns the size of the dequeue
        int size() {
            return size;
        }

        // Inserts an element at the front of the dequeue
        void insertLeft(int element) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else if (front == 0) {
                front = capacity - 1;
            } else {
                front--;
            }
            array[front] = element;
            size++;
        }

        // insert an element at the end of the dequeue
        void insertRight(int element) {
            if (isFull()) {
                System.out.println("Overflow");
                return;
            }
            if (isEmpty()) {
                front = 0;
                rear = 0;
            } else if (rear == capacity - 1) {
                rear = 0;
            } else {
                rear++;
            }
            array[rear] = element;
            size++;
        }

        // Removes an element from the front of the dequeue
        void deleteLeft() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (front == capacity - 1) {
                front = 0;
            } else {
                front++;
            }
            size--;
        }

        // Removes an element from the end of the dequeue
        void deleteRight() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return;
            }
            if (front == rear) {
                front = -1;
                rear = -1;
            } else if (rear == 0) {
                rear = capacity - 1;
            } else {
                rear--;
            }
            size--;
        }

        // Returns the element at the front of the dequeue
        int getLeft() {
            if (isEmpty()) {
                System.out.println("Underflow");
                return -1;
            }
            return array[front];
        }

        // Returns the element at the end of the dequeue
        int getRight() {
            if (isEmpty() || rear < 0) {
                System.out.println("Underflow");
                return -1;
            }
            return array[rear];
        }

        // Displays the elements of the dequeue
        void display() {
            if (isEmpty()) {
                System.out.println("Empty");
                return;
            }
            int i = front;
            while (i != rear) {
                System.out.print(array[i] + " ");
                i = (i + 1) % capacity;
            }
            System.out.println(array[rear]);            
        }
    }

// Implementation of stack using dequeue
static class Stack {
    deque d = new deque();

    public void push(int element) {
        // Inserting element at the end of the list
        d.insertRight(element); 
    }

    public int peek() {
        // Return the last element of the list
        return d.getRight();
    }

    public int size() {
        // Returning the size of the list
        return d.size(); 
    }

    public void pop() {
        // Deleting element from the end of the list
        d.deleteRight(); 
    }

    public void display() {
            // Displaying the list
        d.display();
    }
}

    // Implementation of queue using dequeue
    static class Queue {
        deque d = new deque();

        public void endqueue(int element) {
            // Inserting element at the end of the list
            d.insertRight(element); 
        }

        public void deletequeue() {
            // Deleting element from the start of the list            
            d.deleteLeft(); 
        }

        // display
        public void display() {
            // Displaying the list
            d.display(); 
        }

        public int peek() {
            // Returning the first element of the list
            return d.getLeft();
        }

        public int size() {
            // Returning the size of the list
            return d.size(); 
        }

    }

    public static void main(String[] args) {

        // Object of Stack
        Stack s = new Stack();

        // pushing numbers to the top of stack
        s.push(73);
        s.push(32);
        s.push(23);
        s.push(14);
        s.push(93);
        System.out.print("Initial Stack: ");
        s.display();

        System.out.println();

        s.pop();
        s.pop();
        System.out.print("Final Stack: ");
        s.display();

        System.out.println();

        // Object of Queue
        Queue q = new Queue();

        // Inserting numbers into the queue
        q.endqueue(21);
        q.endqueue(2);
        q.endqueue(93);
        q.endqueue(72);
        q.endqueue(55);
        q.endqueue(35);
        System.out.print("The Initial Queue: ");
        q.display();

        // New line
        System.out.println();

        q.deletequeue();
        System.out.print("The Final Queue: ");
        q.display();

        // New line
        System.out.println();
        System.out.println("Size of stack is " + s.size());
        System.out.println("Size of queue is " + q.size());
    }
}
    