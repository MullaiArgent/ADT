class LMain {
    static public void main(String[] args){

        LinkedList llink = new LinkedList();
        llink.push(5);
        llink.push(6);
        llink.push(23);

        llink.insertAtfirst(4);

        llink.insertAt(2,3);
        llink.insertAt(0,27);

        llink.delete(3);

        llink.pop();

        llink.show();
    }
}