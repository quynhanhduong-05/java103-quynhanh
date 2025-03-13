public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<Integer>();
        list.add(0, 1);
        list.printList();
        list.addFirst(2);
        list.printList();
        list.addLast(3);
        list.printList();
        list.remove(1);
        list.printList();
        System.out.println(list.contains(2));
        System.out.println(list.indexOf(2));
        System.out.println(list.get(1));
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
