/*Antonio O. 
 * Were being introduced to Stacks, but a bit of a review
 * The stacks are comands with LIFO
 * 
 */
package StackAndQueues;

/**
 *
 * @author antonioolivera
 */


public class Stack {
    
    private int[] array;
    private int top;
    
    public Stack(int size){
        array = new int [size];
        top = -1; //when we push an item on the stack, it is at -1 and it goes to 0
        
        
    }
    public boolean isEmpty() {
        return top == -1;
        
    }
    public boolean isFull(){
        return top == array.length -1; 
        
    }
    public void push(int item) {
        if (isFull()){ //checking to see if the stack is full
            System.out.println("Cannot push, stack is full");
            
        }
        else { //its adding an item to the stack 
            top++;
            array[top] = item; 
        }
    }
    
    public int pop() { //restriction is that you arent removing a certain item,
        if(isEmpty()){
            System.out.println("Cannot delete, Stack is empty");
            return -1;
            
        }
        else {
            return array[top--]; // you are going to return the 
           
        }
    }
    
    public int peek(){
        if(!isEmpty())
            return array[top];
        else 
            return -1;
        
    }
    
        public static void main(String[] args) {
        BracketChecker b = new BracketChecker("a{(b)}");
        b.check();
        
        
    }
    
}
