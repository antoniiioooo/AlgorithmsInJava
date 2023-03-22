/*
 * 
 * 
 * 
 */
package StackAndQueues;

/**
 *
 * @author antonioolivera
 */
public class Reverser {
    private String input;
    private String output;
    
    public Reverser (String input) {
        this.input = input;
        
    }
    
    public String reverse(){
        Stack s = new Stack(input.length());
        for(int i = 0; i < input.length(); i++){
            //char c = input.charAt(i);
            s.push(input.charAt(i));
        }
        output = " ";
        while(!s.isEmpty()){
            char c = (char)s.pop();
            output = output + c;
            
        }
        return output; 
    }
}
