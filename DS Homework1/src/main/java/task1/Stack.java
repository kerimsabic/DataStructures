package task1;


import java.util.EmptyStackException;

public class Stack<Item> {
    private Queue<Item> q1;
    private Queue<Item> q2;


    public Stack() {
        q1=new Queue<>();
        q2=new Queue<>();
    }

    public void push(Item data) {
        q2.enqueue(data);
        while(!q1.isEmpty()){
            q2.enqueue(q1.dequeue());
        }
        Queue<Item> temp=q1;
        q1=q2;
        q2=temp;

    }

    public Item pop() {
       if(isEmpty()){
           throw new EmptyStackException();
       }

       return q1.dequeue();
    }

    public Item peek() {
        if(isEmpty()){
            throw  new EmptyStackException();
        }
        Item top;
        top = q1.dequeue();
        q2.enqueue(top);
        while (!q1.isEmpty()) {
            q2.enqueue(q1.dequeue());
        }
        while (!q2.isEmpty()) {
            q1.enqueue(q2.dequeue());
        }
        return top;
    }

    public int size() {

        return q1.size();
    }

    public boolean isEmpty() {

        return q1.isEmpty();
    }
}
