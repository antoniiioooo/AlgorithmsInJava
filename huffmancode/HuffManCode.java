/* Antonio Olivera
 * October 27, 2022
 * 
 * 
 */
package huffmancode;

/**
 *
 * @author antonioolivera
 */
public class HuffManCode {

    private priorityqueue priorityqueue;
    private String message;
    private int count;
    private HuffManTree fTree;
    private char[] finalChartree;
    private String[] FinalCodeTree;
    private int codetablecount = 0;

    public HuffManCode(String message) {
        this.message = message;
        priorityqueue = new priorityqueue(message.length());
        finalChartree = new char[message.length()];
        FinalCodeTree = new String[message.length()];

    }

    public void displaytree() {
        fTree.inorder(message.length());

    }

    public void inserttoque() {
        char[] characters = new char[message.length()];
        int insertcount = 0;
        for (int i = 0; i < message.length(); i++) {
            if (!isrepeated(message.charAt(i), i)) {
                characters[insertcount] = message.charAt(i);
                insertcount++;
            }
        }

        for (int i = insertcount - 1; i >= 0; i--) {
            HuffManTree HT = new HuffManTree(characters[i], getFrequency(characters[i]));
            priorityqueue.Insert(HT);
            count++;

        }
    }

    public void BuiltTree() {
        inserttoque();
        for (int i = 0; i < count - 1; i++) {
            HuffManTree parent = new HuffManTree(priorityqueue.Delete(), priorityqueue.Delete());
            parent.root.frequency = parent.root.left.frequency + parent.root.right.frequency;
            priorityqueue.Insert(parent);

        }
        fTree = priorityqueue.Delete();
        displaytree();

    }

    public int getFrequency(char a) {
        int count = 0;
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == a) {
                count++;

            }
        }
        return count;
    }

    public boolean isrepeated(char a, int index) {
        for (int i = index + 1; i < message.length(); i++) {
            if (message.charAt(i) == a) {
                return true;
            }
        }
        return false;
    }

    public boolean Message(char key) {
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == key) {
                return true;
            }
        }
        return false;
    }

    public void BuildCodeTable() {
        String[] treecodes = fTree.getTreeCodes();
        char[] treechar = fTree.getTreeCharacters();

        System.out.println(" ------- The Code Table ------- ");

        for (int i = 0; i < treecodes.length; i++) {
            if (Message(treechar[i])) {
                System.out.println("The character: " + treechar[i] + ", and has the code of: " + treecodes[i]);
                finalChartree[codetablecount] = treechar[i];
                FinalCodeTree[codetablecount] = treecodes[i];
                codetablecount++;

            }
        }
    }

    public int getcharacterindex(char key) {
        for (int i = 0; i < finalChartree.length; i++) {
            if (key == finalChartree[i]) {
                return i;
            }
        }
        return -1;
    }

    public int getcodeindex(String key) {
        for (int i = 0; i < codetablecount; i++) {
            if (FinalCodeTree[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public boolean incodearray(String key) {
        for (int i = 0; i < codetablecount; i++) {
            if (FinalCodeTree[i].equals(key)) {
                return true;
            }
        }
        return false;
    }

    public String encode(String message) {
        String MessageEncoded = "";
        for (int i = 0; i < message.length(); i++) {
            if (Message(message.charAt(i))) {
                MessageEncoded = MessageEncoded + FinalCodeTree[getcharacterindex(message.charAt(i))];
            } else {
                System.out.println("Character " + message.charAt(i) + " is not in the tree");
                MessageEncoded = " its impossible to encode! ";
                break;
            }
        }
        return MessageEncoded;
    }

    public String decode(String message) {
        String MessageDecoded = "";
        String temp = "";
        for (int i = 0; i < message.length(); i++) {
            temp = temp + message.charAt(i);

            if (incodearray(temp)) {
                MessageDecoded = MessageDecoded + finalChartree[getcodeindex(temp)];
                temp = "";
            }
        }
        if (temp.length() == message.length()) {
            MessageDecoded = " its impossible to decode! ";
        }
        return MessageDecoded;
    }

    public static void main(String[] args) {
        // TODO code application logic here

    }

}
