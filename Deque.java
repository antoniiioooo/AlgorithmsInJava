package deque;
// Represents a dequeue
public class Deque {

    static class deque {

        // stores the data
        int[] data;
        int size;
        int capacity;

        // stores the front and rear index
        int front;
        int rear;

        // Constructor
        public deque() {
            data = new int[10];
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
            data[front] = element;
            size++;
        }

        // insert an element at the rear of the dequeue
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
            data[rear] = element;
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

        // Removes an element from the rear of the dequeue
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
            return data[front];
        }

        // Returns the element at the rear of the dequeue
        int getRight() {
            if (isEmpty() || rear < 0) {
                System.out.println("Underflow");
                return -1;
            }
            return data[rear];
        }

        // Displays the elements of the dequeue
        void display() {
            if (isEmpty()) {
                System.out.println("Empty");
                return;
            }
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i + 1) % capacity;
            }
            System.out.println(data[rear]);            
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

        public void enqueue(int element) {
            // Inserting element at the end of the list
            d.insertRight(element); 
        }

        public void dequeue() {
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
        Stack stk = new Stack();

        // push 2,4, and 8 at top of stack
        stk.push(4);
        stk.push(2);
        stk.push(8);
        System.out.print("Initial Stack: ");
        stk.display();

        System.out.println();

        stk.pop();
        System.out.print("Final Stack: ");
        stk.display();

        System.out.println();

        // Object of Queue
        Queue que = new Queue();

        // Insert 10,17, and 4 in queue
        que.enqueue(10);
        que.enqueue(17);
        que.enqueue(4);
        System.out.print("Initial Queue: ");
        que.display();

        // New line
        System.out.println();

        que.dequeue();
        System.out.print("Final Queue: ");
        que.display();

        // New line
        System.out.println();
        System.out.println("Size of stack is " +
                stk.size());
        System.out.println("Size of queue is " +
                que.size());
    }
}