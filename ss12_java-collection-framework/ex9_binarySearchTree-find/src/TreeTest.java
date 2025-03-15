import java.util.ArrayList;

public class TreeTest {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(1);
        bst.insert(2);
        bst.insert(3);
        bst.insert(4);

        System.out.println(bst.find(5));
    }
}
