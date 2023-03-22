/*
 * Antonio O.
 * Advanced Data Structure 282
 * 
 */
package StackAndQueues;

/**
 *
 * @author antonioolivera
 */

class Deque {

    static class DQueNode {
        int value;
        DQueNode next;
        DQueNode prev;
    }

    static class deque {

        private DQueNode head;
        private DQueNode tail;

        // Constructor
        public deque() {
            head = tail = null;
        }

        // If list is empty
        boolean isEmpty() {
            if (head == null)
                return true;

            return false;
        }
        
        //If list is full
        boolean isFull() {
            if (tail == null)
                return true;
            
            return false;
        }

        int size() {

            if (!isEmpty()) {
                DQueNode temp = head;
                int len = 0;

                while (temp != null) {
                    len++;
                    temp = temp.next;
                }
                return len;
            }
            return 0;
        }

        void insertLeft(int element) {

            DQueNode temp = new DQueNode();
            temp.value = element;

            if (head == null) {
                head = tail = temp;
                temp.next = temp.prev = null;
            } else {
                head.prev = temp;
                temp.next = head;
                temp.prev = null;
                head = temp;
            }
        }

        void insertRight(int element) {

            DQueNode temp = new DQueNode();
            temp.value = element;

            if (head == null) {
                head = tail = temp;
                temp.next = temp.prev = null;
            } else {
                tail.next = temp;
                temp.next = null;
                temp.prev = tail;
                tail = temp;
            }
        }

        void deleteLeft() {

            if (!isEmpty()) {
                DQueNode temp = head;
                head = head.next;
                head.prev = null;

                return;
            }
            System.out.print("List is Empty");
        }

        void deleteRight() {

            if (!isEmpty()) {
                DQueNode temp = tail;
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
                return;
            }
            System.out.print("List is Empty");
        }

        void display() {

            if (!isEmpty()) {
                DQueNode temp = head;

                while (temp != null) {
                    System.out.print(temp.value + " ");
                    temp = temp.next;
                }

                return;
            }
            System.out.print("List is Empty");
        }
    }   
}
    
