import java.util.Arrays;

public class ResizableArray {
    int[] internalArray;
    public ResizableArray(){
        this.internalArray = new int[0];
    }

    // Adds value to the end of the array
    public void add(int value) {
        int[] b = new int[internalArray.length+1];
        for (int i = 0; i<internalArray.length;i++){
            b[i] =internalArray[i];
        }
        b[internalArray.length] = value;
        internalArray = b;
    }

    // Returns the value at the index
    public int get(int index) {
        return internalArray[index];
    }

    // Replaces the value at the index
    public void set(int index, int value) {
        internalArray[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.internalArray);
    }
}