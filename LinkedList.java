import java.util.Iterator;

public class LinkedList <Item> implements Iterable<Item>{
    
    private Node<Item> head;
    private int size = 0;


    public void addToFront(Item item) {
        Node<Item> newNode = new Node<Item>();
        newNode.data = item;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void removeFromFront() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Linked list is empty");
        }
        head = head.next;
        size--;
    }

    public void addToRear(Item item) {
        Node<Item> newNode = new Node<Item>();
        newNode.data = item;
        if (head == null) {
            head = newNode;
        } else {
            Node<Item> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void removeFromRear() {
        if (head == null) {
            throw new IndexOutOfBoundsException("Linked list is empty");
        } else if (size == 1) {
            head = null;
        } else {
            Node<Item> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
        size--;
    }

    public int count(){
        return size;
    }

    Item get(int index) {                           //returns data of a node from a given index
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid linked list node.");
        }
        Node<Item> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.data;
    }


    private class LinkedListIterator implements Iterator<Item>{
        Node<Item> current=head;

        @Override
        public boolean hasNext() {
            return current.next!=null;
        }

        @Override
        public Item next() {
            Item item=current.data;
            current=current.next;
            return item;
        }
    }

    public Iterator<Item> iterator() {              //returns instance of LinkedListIterator class
        return new LinkedListIterator();
    }
    
}