/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinklist;

/**
 *
 * @author antonioolivera
 */
public class CLinkList {
   
    private Node head; 
    private Node tail;
    private int size; 
    
    public CLinkList(){
        this.size = 0;
    }
    
    
    private class Node {
        private int value;
        private Node next;
        
        public Node(int value){
            this.value = value;
        }
    }
    
    
    public void insertion(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        if(tail == null){
            tail = head;
            
        }
        size += 1;
        
    }
    public void insertLast(int val){
        if(tail == null){
            insertion(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    
    public void insert(int val, int index){
        if(index == 0){
            insertion(val);
            return;
        }
        if (index == size){
            insertion(val);
            return;
            
        }
        Node temp = head;
        for (int i = 1; i < index; i++){
            temp = temp.next;
        }
        
        Node node = new Node(val);
        temp.next = node;
        
        size++;

    }
    public int deletelast(){
        if (size <= 1){
            return delete();
        }
        Node secondlast = get(size - 2);
        int val = tail.value;
        
        tail = secondlast;
        tail.next = null;
        
        return val;
    }
    
    public Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }
    
    public int delete(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;

        }
        return size--;
    }
    
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
        
    }
    
}
