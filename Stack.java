public class Stack<Item> {

    /* Node implementation */
    private class Node <Item>{
        Item data;
        Node<Item> next;
    }

    private Node<Item> top = null;
    private int size = 0;

    /* Push an item onto the stack */
    public void push(Item item) {
        Node<Item>newNode=new Node<Item>();
        newNode.data=item;
        newNode.next=top;
        top=newNode;
        size++;
    }

    /* Check if the stack is empty */
    public boolean isEmpty() {
        return top==null;
    }

    /* Remove the top item from the stack, and return its data */
    public Item pop() {
        if(isEmpty()){
            throw new IndexOutOfBoundsException();
        }
        Item dataToRead=this.top.data;
        this.top=this.top.next;
        this.size--;
        return dataToRead;
    }

    /* Return the current size of the stack */
    public int size() {
        return this.size;
    }
}