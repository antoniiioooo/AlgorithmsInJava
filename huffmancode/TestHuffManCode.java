/* Antonio Olivera
 * October 26, 2022
 * 
 * 
 */
package huffmancode;

import java.util.Scanner;
/**
 *
 * @author antonioolivera
 */
public class TestHuffManCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String message = sc.nextLine();
        HuffManCode hman = new HuffManCode(message);
        hman.BuiltTree();
        hman.BuildCodeTable();
        System.out.println(" Type the same message that you entereted earlier to endcode: ");
        String encodeThis = sc.nextLine();
        System.out.println(" the encoded message is " + encodeThis + hman.encode(encodeThis));
        System.out.println(" Type the same message that you entereted earlier to decode: ");
        String decodeThis = sc.nextLine();
        System.out.println(" the decoded message  " + decodeThis + hman.decode(decodeThis) + " ");
        
        
        
    }
    
}
