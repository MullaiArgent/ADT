
public class LinkedList {
    Node head;
    public void push(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (head ==  null){
            head =node;
        }else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
    }}
    public void show(){
        Node n = head;
        while(n.next != null){
            System.out.println(n.data);
            n = n.next;
        }System.out.println(n.data);
    }
    public void insertAtfirst(int data){
        Node node =new Node();
        node.data = data;
        node.next = null;

        node.next = head;
        head = node;
    }public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        if (index == 0){
            insertAtfirst(data);
        }
        else{
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void delete(int index){
        if (index == 0){
            head = head.next;
        }else{
            Node temp = null;
            Node n = head;
            for(int i=0; i<index-1; i++){
                n = n.next;
            }
            temp = n.next;
            n.next = temp.next;
            temp = null;
        }
    }
    public void pop(){
        int Counter = 0;
        Node n = head;
        while(n.next != null){
            Counter += 1;
            n = n.next;
        }delete(Counter);
    }
}
