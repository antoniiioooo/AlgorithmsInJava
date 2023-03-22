/*
 * October 27, 2022
 * 
 * 
 */
package huffmancode;

/**
 *
 * @author antonioolivera
 */
public class TheNode {

    public char character;
    public int frequency;
    public TheNode left;
    public TheNode right;

    public void DisplayNode() {
        System.out.println("{ ");
        System.out.println(frequency);
        System.out.println(", ");
        System.out.println(character);
        System.out.println(" }");

    }
}
