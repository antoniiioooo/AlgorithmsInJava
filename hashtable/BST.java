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
public class BST {

    private Node root;
    private int size;

    public BST() {
        root = null;
        size = 0;
    }

    public void insert(Student s) {
        Node node = new Node(s);
        size++;
        if (root == null) {
            root = node;
        } else {
            Node current = root;
            while (true) {
                if (s.getId() < current.getStudent().getId()) {
                    Node left = current.getLeft();
                    if (left != null) {
                        current = left;
                    } else {
                        current.setLeft(node);
                        break;
                    }
                } else {
                    Node right = current.getRight();
                    if (right != null) {
                        current = right;
                    } else {
                        current.setRight(node);
                        break;
                    }
                }
            }
        }
    }

    public void delete(int id) {
        Node parent = null;
        int child = 0;
        Node current = root;
        while (current != null) {
            if (id < current.getStudent().getId()) {
                parent = current;
                child = -1;
                current = current.getLeft();
            } else if (id > current.getStudent().getId()) {
                parent = current;
                child = 1;
                current = current.getRight();
            } else {
                break;
            }
        }
        if (current != null) {
            Node left = current.getLeft();
            Node right = current.getRight();
            Node replacement;
            if (left == null) {
                replacement = right;
            } else if (right == null) {
                replacement = left;
            } else if (right.getLeft() == null) {
                right.setLeft(left);
                replacement = right;
            } else {
                Node parent2 = right;
                Node current2 = right.getLeft();
                while (current2.getLeft() != null) {
                    parent2 = current2;
                }
                parent2.setLeft(current2.getRight());
                current2.setRight(right);
                current2.setLeft(left);
                replacement = current2;
            }
            if (child == -1) {
                parent.setLeft(replacement);
            } else if (child == 1) {
                parent.setRight(replacement);
            } else {
                root = replacement;
            }
            size--;
        }
    }

    public Node search(int id) {
        Node result = null;
        Node current = root;
        while (current != null) {
            if (id < current.getStudent().getId()) {
                current = current.getLeft();
            } else if (id > current.getStudent().getId()) {
                current = current.getRight();
            } else {
                result = current;
                break;
            }
        }
        return result;
    }

    public void display() {
        display(root);
        System.out.println();
    }

    private void display(Node node) {
        if (node != null) {
            display(node.getLeft());
            System.out.print(node.getStudent() + " -> ");
            display(node.getRight());
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

    }
}
