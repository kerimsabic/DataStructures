public class BinarySearch {

    public static int search(int[] elements, int key){

        int low=0;
        int high=elements.length-1;

        while(low<=high){

            int middle=low+(high-low)/2;
            if(key<elements[middle]){
                high=middle-1;
            }
            else if(key>elements[middle]){
                low=middle+1;
            }
            else{
                return middle;
            }  

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] elements = { 3, 4, 5, 11, 14, 19, 21, 26, 33, 49, 56, 71, 72, 74, 89, 90, 98, 100 };
        
        int index = BinarySearch.search(elements, 19);
        System.out.println("index: " + index);

        
        int index2 = BinarySearch.search(elements, 42);
        System.out.println("index: " + index2);
    }
    
}
