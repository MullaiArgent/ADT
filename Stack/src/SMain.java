class SMain{
    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(2);
        stack.push(3);
        stack.push(2);
        stack.push(3);

        stack.push(3);

        stack.pop();

        stack.peek();

        stack.show();

        System.out.println(stack.getSize());

        System.out.println(stack.isEmpty());
    }
}
