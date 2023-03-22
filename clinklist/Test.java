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
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       CLinkList list = new CLinkList();
       list.insertion(23);
       list.insertion(32);
       list.insertion(51);
       list.insertion(932);
       list.insertLast(777);
       
       list.display();
       System.out.println(list.delete());
       list.display();
       System.out.println(list.deletelast());
       list.display();
        
    }
    
}
