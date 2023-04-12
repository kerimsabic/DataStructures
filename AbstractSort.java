
public abstract class AbstractSort {

    public static boolean bigger(int first, int second){
            return first>second;
    }

    public static void swap (int[] elements, int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }
    
}
