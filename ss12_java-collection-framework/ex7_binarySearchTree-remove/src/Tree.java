public interface Tree<E> {
    public boolean insert(E e);
    public boolean remove(E e);
    public int getSize();
    public void inorder();
}
