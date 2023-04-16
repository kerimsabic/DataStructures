
public class InsertionSort extends AbstractSort {

    public void sort(int[] elements){
        int size=elements.length;
        for(int i=0;i<size;i++){
            for(int j=i;j>0;j--){
                if(less(elements[j],elements[j-1])){
                    swap(elements, j, j-1);
                }
                else{
                    break;
                }

            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
 
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
 
        printArray(arr);
    }
    
}
