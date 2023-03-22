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
public class CircTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         CircLinkedList list = new CircLinkedList();
        list.insert(23);
        list.insert(34);
        list.insert(15);
        list.insert(50);
        list.insert(25);
        list.insert(99);
        list.print();
        list.insert(11);
        list.insert(22);
        list.insert(33);
        list.insert(44);
        list.print();
        list.delete();
        list.delete();
        list.delete();
        list.print();
    }
    
}
