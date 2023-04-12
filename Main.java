
public class Main {
    
    public static void main(String[] args) {
 
        LinkedList<Integer> list = new LinkedList<Integer>();
            
        list.addToRear(1);
        list.addToRear(2);
        list.addToRear(3);
        list.addToRear(4);
        list.addToFront(5);
        list.addToFront(6);
             
        list.removeFromRear();
        list.removeFromFront();
         
        for (Integer i: list) {
            System.out.println(i);
        }
            
        System.out.println(list.get(0));
        System.out.println(list.get(2));
        System.out.println("list size: " + list.count());
    }
    
    
    
}
