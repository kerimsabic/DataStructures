import java.util.Random;

public class ShellSort extends AbstractSort {
    public static void sort(int[] elements){
        int h=1;
        while(h<elements.length/3){
            h=3*h+1;
        }

        while(h>=1){
            for(int i=h;i<elements.length;i++){
                for(int j=i;j>=h;j=j-h){
                    if(less(elements[j],elements[j-h])){
                        swap(elements, j, j-h);
                    }
                    else{
                        break;
                    }
                }
            }
            h=h/3;
        }
    
    }
    public static void main(String[] args) {
        int[] elements = new int[10];
        Random random = new Random();
    

        for (int i = 0; i < elements.length; i++) {
            elements[i] = random.nextInt(1000);
        }
        
   
        ShellSort.sort(elements);
        ShellSort.printArray(elements);
    }
}
