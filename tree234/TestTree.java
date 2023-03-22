/*
 * Antonio Olivera
 * November 9, 2022
 * 
 */
package tree234;

/**
 *
 * @author antonioolivera
 */
public class TestTree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tree234 t = new Tree234();
        t.insert(56);
        t.insert(12);
        t.insert(36);
        t.inorder();
        
    }
}
