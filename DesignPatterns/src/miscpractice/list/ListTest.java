package miscpractice.list;

/**
 * Created by Squall on 16/04/2015.
 */
public class ListTest {
    public static void main(String[] args) {
        ListNode<Integer> list = new ListNodeImpl<>(4, new ListNodeImpl<Integer>(6, new ListNodeImpl<Integer>(8, null)));
        System.out.println(ListNodeImpl.listSum(list));
    }
}
