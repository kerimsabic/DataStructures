
public class Queue<Item> {

    private Node<Item> head = null;
    private Node<Item> tail = null;
    private int size = 0;

    /*
     * enqueue(): adds an item to the rear of the queue
     * dequeue(): removes an item from the front of the queue, and returns its value
     * to the user
     * isEmpty(): checks whether the queue is empty or not
     * size(): (optional) returns the number of items currently in the queue
     */
    public boolean isEmpty(){
        return this.size==0;
    }
    
    public void enqueue(Item item) {
        Node<Item> nodeToBeAdded = new Node<Item>();
        nodeToBeAdded.data = item;
        if (this.isEmpty()) {
            this.head = nodeToBeAdded;
        } 
        else {
            this.tail.next = nodeToBeAdded;
        }
        this.tail=nodeToBeAdded;
        this.size++;

    }

    public Item dequeue(){
        if(isEmpty())
            throw new IndexOutOfBoundsException("Queue is empty");
        
        Item dataToRead=this.head.data;
        this.head=this.head.next;
        size--;
        if(isEmpty()){
            this.tail=null;
        }
        return dataToRead;
    }

    public int size(){
        return this.size;
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<Integer>();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(4);

        System.out.println("queue size: " + queue.size());
        System.out.println(queue.dequeue());
    }

}
