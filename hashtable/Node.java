/* Antonio Olivera 
 * November 21, 2022
 * 
 */
package hashtable;

/**
 *
 * @author antonioolivera
 */
public class Node {

    private Student data;
    private Node left;
    private Node right;

    public Node(Student a) {
        data = a;
        left = null;
        right = null;

    }

    public Student getStudent() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node n) {
        left = n;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node n) {
        right = n;
    }

    public static void main(String[] args) {
        
    }

}
