public class Queue {
    Integer[] queue = new Integer[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data){
        if (isFull()){
            System.out.println("it is full");
        }
        else {
            queue[rear] = data;
            rear = (rear - 1) % 5;
            size++;
        }
    }
    public void deQueue(){
        if (isEmpty()){
            System.out.println("im already empty");
        }else {

            front = (front + 1) % 5;
            size--;
        }
    }public int getSize(){
        return size;
    }
    public boolean isEmpty(){
        return size<=0;
    }
    public boolean isFull(){
        return size>=5;
    }
    public void show(){
        for (int i= 0 ;i< getSize();i++){
            System.out.print(queue[(front + 1)%5]);
        }
    }
}
