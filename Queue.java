public class Queue {

    int Q[];
    int front;
    int rear;
    int size;

    public Queue(int q) {
        Q = new int[q];
    }

    public boolean isEmpty() {
        return (getSize() == 0);
    }

    public boolean isFull() {
        return (getSize() == Q.length);
    }

    public void enQueue(int val) {
        if(isFull()) {
            System.out.println("Queue is full"); return;
        }
        Q[rear] = val;
        rear = (rear+1) % Q.length;
        size++;
    }

    public void deQueue() {
        if(isEmpty()) {
            System.out.println("Queue is Empty"); return;
        }
        front = (front+1) % Q.length;
        size--;
    }

    public int getSize() {
        return size;
    }

    public void printQ() {
        for(int i=0; i<size; i++) {
            System.out.print(Q[(front+i) % Q.length] + "  ");
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enQueue(5);
        q.enQueue(6);
        q.enQueue(7);
        q.enQueue(9);

        q.deQueue();
        q.deQueue();

        q.enQueue(1);
        q.enQueue(3);

        q.printQ();

        System.out.println("size is - " + q.getSize());
        System.out.println(q.isEmpty());
        System.out.println(q.isFull());
    }
}
