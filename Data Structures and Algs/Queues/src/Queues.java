public class Queues {

    private Node head;
    private Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public int peak() {
        return head.data;
    }

    public void add(int data) {
        var newNode = new Node(data);
        if (tail != null) {
            tail.next = newNode;
            tail = newNode;
        }
        if (head == null) {
            head = newNode;
        }
    }

    public void remove(int data) {
        data = head.data;
        head = head.next;
//        if (head == null) {
//            tail = null;
//        }
    }

    public static void main(String[] args) {
        var x = new Queues();
        x.add(50);
        x.add(30);
        x.add(5);
        System.out.println(x.peak());
        x.remove(50);
        System.out.println(x.peak());

    }
}
