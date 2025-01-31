package LinkedList;

public class Main {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
        System.out.println(sll);
        sll.insertInLinkedList(1, 0);
        sll.insertInLinkedList(2, 1);
        sll.insertInLinkedList(3, 2);
        sll.insertInLinkedList(4, 3);
        sll.insertInLinkedList(5, 4);

        sll.traverseLinkedList();
        sll.searchNode(5);

        sll.deleteInLinkedList(4);
        sll.deleteInLinkedList(2);
        sll.deleteInLinkedList(0);
        sll.traverseLinkedList();
    }
}
