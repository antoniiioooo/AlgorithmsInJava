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
public class BracketChecker {
    String input;
    
    public BracketChecker(String input) {
        this.input = input;
    }
    public void check() {
        Stack s = new Stack(input.length()); //this is creating a new stack
        
        for(int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch(c) {
                case '{' :
                case '[' :
                case '(' :
                    s.push(c);
                    break; 
                case '}' :
                case ']' :
                case ')' :
                    if(!s.isEmpty()) {
                        char ch = (char)(s.pop());
                        if(c == '}' && ch  == '{' || c ==']' && ch=='[' || c == ')' && ch == '(');
                            System.out.println("Error: not matchiing");
                        
                    }
                    else {
                        System.out.println("Error: incomplete brackets");
                        
                    }
                    break; 
                default: 
                    break; 
            }
        }
        if(s.isEmpty()){
            System.out.println("Error: missing right bracket");
            
        }
    }
}
