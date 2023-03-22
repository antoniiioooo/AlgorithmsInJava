/* Antonio Olivera
 * November 21, 2022
 * 
 * 
 */
package hashtable;

/**
 *
 * @author antonioolivera
 */
public class TestLP {

    
    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
       ht.insert(new Student(23,"W"));
       ht.insert(new Student(21,"B"));
       ht.insert(new Student(20, "T"));
       ht.insert(new Student(26,"Z"));
       ht.insert(new Student(14,"N"));
       ht.insert(new Student(1, "A"));
       ht.display();

        Node node21 = ht.search(21);
        System.out.println("Search 21: " + node21.getStudent());

        Node node1 = ht.search(1);
        System.out.println("Search 1: " + node1.getStudent());
        
        Node node26 = ht.search(26);
        System.out.println("Search 26; " + node26.getStudent());
        

        System.out.println();

        ht.delete(21);
        ht.display();

        ht.delete(14);
        ht.display();

        ht.delete(1);
        ht.display();

        ht.delete(26);
        ht.display();
    
    }
    
}
