//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.addFirst(3);  // Output: 5 -> 10 -> 20 -> null


        list.removeFirst();
        list.printList();  // Output: 10 -> 20 -> null
    }
}