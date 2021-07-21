public class Stack {
    Integer[] stack = new Integer[5];
    int top =  0;

    public void push(int data){
        if (top == 5){
            System.out.println(" You know wht im full");
        }else{
            stack[top] = data;
            top++;
    }}
    public void pop(){
        if (top==0){
            System.out.println("Im done");
            }
        else{
            top--;
            int data;
            data = stack[top];
            stack[top] = 0;
    }}
    public void peek(){
        int data;
        data = stack[top - 1];
        System.out.println(data);
    }
    public void show(){
        for(int i : stack){
            System.out.print(i + " ");
        }
    }
    public int getSize(){
        return top;
    }
    public boolean isEmpty(){
        System.out.println();
        return top <= 0;
    }
}
