public class DStack {

    int capacity = 2;
    Integer[] stack= new Integer[capacity];
    int top = 0 ;
    public void push(int data){
        if (top == capacity){
            expand();
        }else{
            stack[top] = data;
            top++;
        }}
    public void pop(){
        if (isEmpty()){
            System.out.println("Im done");
        }
        else{
            top--;
            int data;
            data = stack[top];
            stack[top] = 0;
            shrink();
        }}


    public void peek(){
        int data;
        data = stack[top - 1];
        System.out.println(data);
    }
    public int getSize(){
        return top;
    }
    public boolean isEmpty(){
        System.out.println();
        return top <= 0;
    }
    public void show(){
        for(int i : stack){
            System.out.print(i + " ");
        }
    }
    private void expand(){
        int length = getSize();
        capacity *= 2;
        Integer[] newDStack = new Integer[capacity];
        System.arraycopy(stack,0,newDStack,0,length);
        stack = newDStack;
    }
    private void shrink(){
        int length = getSize();
        capacity /= 2;
        Integer[] newDStack = new Integer[capacity];
        System.arraycopy(stack,0,newDStack,0,length);
        stack = newDStack;
    }

}
