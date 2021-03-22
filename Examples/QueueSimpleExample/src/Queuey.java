import java.util.LinkedList;

public class Queuey {

    LinkedList queue;

    public Queuey(){
        this.queue = new LinkedList();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    public void enqueue(int n){
        queue.addLast(n);
    }

    public int dequeue(){
        return (int)queue.remove(0);
    }

    public int peek(){
        return (int)queue.get(0);
    }

    public static void main(String[] args) {

        Queuey numberQueue = new Queuey();

        numberQueue.enqueue(5);
        numberQueue.enqueue(8);
        numberQueue.enqueue(11);
        numberQueue.enqueue(17);
        numberQueue.enqueue(19);
        System.out.println(numberQueue.size());
        System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.isEmpty());
        System.out.println(numberQueue.size());
        System.out.println(numberQueue.peek());
        System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.isEmpty());
    }


}































