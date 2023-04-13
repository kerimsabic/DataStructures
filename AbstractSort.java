
public abstract class AbstractSort {

    public static boolean less(int first, int second){
            return first<second;
    }

    public static void swap (int[] elements, int i, int j) {
        int temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    static void printArray(int elements[]) {
        int n = elements.length;
        for (int i = 0; i < n; ++i)
            System.out.print(elements[i] + " ");
        System.out.println();
    }
    
}
