package miscpractice.list;

/**
 * Created by Squall on 16/04/2015.
 */
public class ListNodeImpl<T> implements ListNode<T> {

    private T item;
    private ListNode<T> next;

    public ListNodeImpl(T item, ListNode<T> next) {
        setItem(item);
        setNext(next);
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

//    public static <T> ListNode<T> reverse(ListNode<T> head) {
//        ListNode<T> last = null;
//        while (head != null) {
//            head = head.getNext();
//            if (head.getNext() == null) {
//                last = head;
//            }
//        }
//    }

    public static int listSum(ListNode<Integer> head) {
        int number = 0;
        while (head != null)
        {
            number += head.getItem();
            head = head.getNext();
        }
        return number;
    }
}
