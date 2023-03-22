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
public class Student {

    private int id;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {

        return "ID is " + id + " name is " + name;
    }

    public static void main(String[] args) {
        
    }
    
}
