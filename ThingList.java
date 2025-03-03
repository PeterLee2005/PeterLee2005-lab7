import java.util.Random;

public class ThingList {

    private class Node {
        Thing data;
        Node next;

        public Node (Thing data) {
            this.data = data;
            this.next = null;
        } 
    }

    private Node head;

    public void addThing(Thing t) {
        Node newNode = new Node(t);
        newNode.next = head;
        head = newNode;
    }

    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println("done");
    }

    public void moveAll(Random rand) {
        Node current = head;
        while (current != null) {
            current.data.move(rand);
            current = current.next;
        }
    }
}
