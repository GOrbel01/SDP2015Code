package miscpractice.list;

/**
 * Created by Squall on 16/04/2015.
 */
public interface ListNode<T> {
    public T getItem();
    public void setItem(T item);
    public ListNode<T> getNext();
    public void setNext(ListNode<T> l);
}
