//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        list.printList();  // Output: 5 -> 10 -> 20 -> null
        list.addLast(10);
        list.addLast(20);
        list.addFirst(5);
        list.printList();  // Output: 5 -> 10 -> 20 -> null


        list.removeFirst();
        list.printList();  // Output: 10 -> 20 -> null
    }
}