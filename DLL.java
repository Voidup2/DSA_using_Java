public class DLL {
    Node head;
    int size;
    public void inserFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val){
        if(head == null){
            inserFirst(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<size;i++){
            temp = temp.next;
        }
        Node node = new Node(val, null, temp);
        temp.next = node;
        size++;
    }

    public void insertIndex(int val,int index){
        if(index == 0){
            inserFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next, temp);
        temp.next = node;
        temp.next.next.prev = node;
        size++;
    }

    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void displayRev(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            last = temp;
            temp = temp.next;
        }
        while(last != null){
            System.out.print(last.value+" -> ");
            last = last.prev;
        }
        System.out.println("Start");
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value){
            this.value = value;
        }

        public Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

}
