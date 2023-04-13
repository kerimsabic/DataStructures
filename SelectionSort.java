import java.util.Random;

public class SelectionSort extends AbstractSort {

    public static void sort(int[] elements) {

        int size=elements.length;
        for(int i=0;i<size;i++){
            int min=i;
            for(int j=i+1;j<size;j++){
                if(less(elements[j], elements[min])){
                   min=j;
                }
            }
            swap(elements,i,min);
        }
    }

    public static void main(String[] args) {
        int[] elements = new int[10];
        Random random = new Random();
            
        /* Generate random elements */
        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(1000);
        }
            
        /* Sort the array */
        SelectionSort.sort(elements);
            
        printArray(elements);
    }
    
}
