
public class BubbleSort extends AbstractSort {

    public void sort(int[] element) {
        int size = element.length;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < size - i; j++) {
                if (bigger(element[j - 1], element[j])) {
                    swap(element, j - 1, j);
                }
            }
        }
    }

    void printArray(int elements[]) {
        int n = elements.length;
        for (int i = 0; i < n; ++i)
            System.out.print(elements[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort ob = new BubbleSort();
        int arr[] = { 5, 1, 4, 2, 8, 3 };
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);

    }
}
