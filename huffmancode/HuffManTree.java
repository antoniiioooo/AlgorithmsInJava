/* Antonio Olivera
 * October 26, 2022
 * 
 */


package huffmancode;

/**
 *
 * @author antonioolivera
 */
public class HuffManTree {

    public TheNode root;
    private char[] treecharacters;
    private String[] treecodes;
    private int count = 0;

    public HuffManTree(char characters, int frequency) {
        root = new TheNode();
        root.frequency = frequency;
        root.character = characters;

    }

    public HuffManTree(HuffManTree lChild, HuffManTree rChild) {
        root = new TheNode();
        root.left = lChild.root;
        root.right = rChild.root;

    }

    private void preorder(TheNode localroot, String code) {
        if (localroot != null) {
            System.out.println("Character: " + localroot.character + ", with frequency: " + localroot.frequency + ", with code; " + code);
            treecharacters[count] = localroot.character;
            treecodes[count] = code;
            count++;
            preorder(localroot.left, code + "0");
            preorder(localroot.right, code + "1");
        }

    }

    public void inorder(int size) {
        treecharacters = new char[size * 2];
        treecodes = new String[size * 2];
        System.out.println(" --- displaying the tree contents --- ");
        String code = "";
        inorder(root, code);

    }

    private void inorder(TheNode localroot, String code) {
        if (localroot != null) {
            System.out.println("Character: " + localroot.character + ", with frequency: " + localroot.frequency + ", with code: " + code);
            treecharacters[count] = localroot.character;
            treecodes[count] = code;
            count++;
            preorder(localroot.left, code + "0");
            preorder(localroot.right, code + "1");

        }
    }

    public char[] getTreeCharacters() {
        return treecharacters;
    }

    public String[] getTreeCodes() {
        return treecodes;
    }

    public static void main(String[] args) {

    }
}
