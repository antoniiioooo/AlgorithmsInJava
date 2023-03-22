/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author antonioolivera
 */
public class LinkedList {
    Node head;
    
    public LinkedList(){
        head = null;
        
    }
    
    public boolean isEmpty(){
        return head == null; 
        
    }
    
    public void insertFirst(int data){
        // create a node
        Node newNode = new Node(data,null);
        newNode.next = head;
        head = newNode;
        
    }
    public Node deleteFirst(){
        Node temp = head; // this is going to delete an iteam and if its empty it will  be null
        head = head.next;
        return temp;
        
    }
    
    public void display(){
        Node curr = head;
        for(curr = head ; curr != null; curr = curr.next){
            System.out.println();
        }
        //while(curr != null){
            //System.out.println(curr.data + "-->");
            //curr = curr.next;
            
        }
    }
}
    

    