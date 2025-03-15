public class BST<E extends Comparable<E>> extends AbstractTree<E> {
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {}

    public BST(E[] objects) {
        for (int i = 0; i < objects.length; i++) {
            insert(objects[i]);
        }
    }

    @Override
    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);
        } else {
            TreeNode<E> parent = null;
            TreeNode<E> current = root;
            while (current != null) {
                if (e.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (e.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(e);
            } else {
                parent.right = new TreeNode<>(e);
            }
        }
        size++;
        return true;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void inorder() {
        inorder(root);
    }

    protected void inorder(TreeNode<E> root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    @Override
    public boolean remove(E e) {
        if (root == null) {
            return false;
        }

        TreeNode<E> parent = null;
        TreeNode<E> current = root;
        while (current != null && !current.element.equals(e)) {
            if (e.compareTo(current.element) < 0) {
                parent = current;
                current = current.left;
            } else if (e.compareTo(current.element) > 0) {
                parent = current;
                current = current.right;
            }
        }

        if (current == null) {
            return false;
        }

        if (current.left == null) {
            if (current == parent.left) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        } else {
            TreeNode<E> rightMost = current.left;
            TreeNode<E> parentOfRightMost = null;
            while (rightMost.right != null) {
                parentOfRightMost = rightMost;
                rightMost = rightMost.right;
            }
            current.element = rightMost.element;
            parentOfRightMost.right = rightMost.left;
        }

        size--;
        return true;
    }
}
