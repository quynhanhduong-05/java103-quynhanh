public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<Integer>(10);
        list.add(0, 9);
        list.add(1, 8);
        list.add(2, 7);
        list.add(3, 6);
        list.add(4, 5);
        list.add(5, 4);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                System.out.print(list.get(i));
            }
        }
        System.out.println();
        list.remove(4);
        list.remove(5);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                System.out.print(list.get(i));
            }
        }
        System.out.println();
        System.out.println(list.contains(4));
        System.out.println(list.indexOf(4));
    }
}
