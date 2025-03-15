public class TreeTest {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);
        bst.insert(9);
        bst.insert(4);

        bst.preorder();
    }
}
