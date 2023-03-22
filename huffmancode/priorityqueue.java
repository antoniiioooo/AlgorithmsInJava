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
public class priorityqueue {

    private HuffManTree[] arr;
    private int aitems;

    public priorityqueue(int Size) {
        arr = new HuffManTree[Size];
        aitems = 0;

    }

    public boolean ifEmpty() {
        return aitems == 0;

    }

    public boolean ifFull() {
        return aitems == arr.length;

    }

    public HuffManTree Delete() {
        if (!ifEmpty()) {
            HuffManTree temp = arr[aitems - 1];
            aitems--;
            return temp;

        } else {
            return null;
        }
    }

    public void Insert(HuffManTree items) {
        int i;
        if (!ifFull()) {
            if (aitems == 0) {
                arr[aitems++] = items;

            } else {
                for (i = aitems - 1; i >= 0; i--) {
                    if (items.root.frequency > arr[i].root.frequency) {
                        arr[i + 1] = arr[i];
                    } else {
                        break;
                    }
                }
                arr[i + 1] = items;
                aitems++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
