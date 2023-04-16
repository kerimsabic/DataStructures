package task1;

public class Queue<Item> {
    private static class Node<Item> {
        Item data;
        Node<Item> next;
    }

    private Node<Item> head = null;
    private Node<Item> tail = null;
    private  int size = 0;

    public void enqueue(Item item) {
        Node<Item> newNode = new Node<>();
        newNode.data = item;
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public Item dequeue() throws IndexOutOfBoundsException {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Queue is empty.");
        }
        Item data = head.data;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty () {
        return size == 0;
    }
}