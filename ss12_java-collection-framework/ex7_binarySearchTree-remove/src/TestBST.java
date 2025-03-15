public class TestBST {
    public static void main(String[] args) {
        BST<Integer> bst = new BST<>();
        bst.insert(20);
        bst.insert(10);
        bst.insert(16);
        bst.insert(40);
        bst.insert(30);
        bst.insert(50);
        bst.insert(80);
        bst.insert(27);

        bst.remove(10);
        bst.inorder();
        System.out.println();
        System.out.println(bst.getSize());
    }
}
