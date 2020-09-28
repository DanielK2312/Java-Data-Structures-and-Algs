public class Stack {

    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public int peek() {
        return top.data;
    }

    public void push(int data) {
        var newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public int pop(int data) {
        data = top.data;
        top = top.next;
        return data;
    }

    public static void main(String[] args) {
        var x = new Stack();
        x.push(5);
        x.push(20);
        x.push(50);
        System.out.println(x.peek());
        x.pop(50);
        System.out.println(x.peek());
        System.out.println(x.isEmpty());
    }
}