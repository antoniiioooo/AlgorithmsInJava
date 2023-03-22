/* Antonio Olivera
 * November 21, 2022
 * Hashtable Project for Advanced Data Structures
 */
package hashtable;

/**
 *
 * @author antonioolivera
 */
public class HashTable {
    BST[] array;

    public HashTable(int size) {
        array = new BST[size];
        for (int i = 0; i < size; i++) {
            array[i] = new BST();
        }
    }

    public int hash(int id) {
        return id % array.length;
    }

    public void insert(Student s) {
        int index = hash(s.getId());
        array[index].insert(s);
    }

    public void delete(int id) {
        int index = hash(id);
        array[index].delete(id);
    }

    public Node search(int id) {
        int index = hash(id);
        return array[index].search(id);
    }

    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(i + " ");
            array[i].display();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
    }
    
}
