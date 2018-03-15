
class Node {
    int data;
    Node next;

    Node(int x) {
        this.data = x;
        this.next = null;
    }
}

class LinkedListUtils {
    public static void main(String[] args){
        Node root = new Node(5);

        LinkedListUtils llUtls = new LinkedListUtils();
        llUtls.AddNode(root, 10);
        llUtls.AddNode(root, 15);
        llUtls.AddNode(root, 20);
        llUtls.AddNode(root, 25);
        llUtls.AddNode(root, 30);

        llUtls.printNode(root);
        
    }

    private void printNode(Node node) {
        while(node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    private void AddNode(Node root, int data) {
        if(root != null) {
            Node temp = root;
            while(temp.next != null) 
                temp = temp.next;
            
            temp.next = new Node(data);
    
        }
        
    }
}