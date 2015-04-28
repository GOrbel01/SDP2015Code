package misctests.trees.hqueue;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by Squall on 26/04/2015.
 */
public class HQueueTest {
    public static void main(String[] args) {
        HybridQueue hq = new HybridQueue();
        hq.queue("a");
        hq.queue("b");
        hq.queue("c");
        hq.queue("d");
        hq.queue("e");
        hq.queue("f");
        hq.queue("g");
        hq.queue("h");
        hq.printQueue();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.printQueue();
        hq.deque();
        hq.printQueue();
        hq.deque();
        hq.printQueue();
        hq.deque();
        hq.printQueue();
        System.out.println();
        hq.queue("z");
        hq.queue("y");
        hq.queue("x");
        hq.queue("w");
        hq.queue("v");
        hq.queue("u");
        hq.queue("t");
        hq.queue("s");
        hq.queue("r");
        hq.queue("q");
        hq.queue("p");
        hq.queue("o");
        hq.queue("n");
        hq.printQueue();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        hq.queue("a");
        hq.queue("b");
        hq.deque();
        hq.deque();
        hq.deque();
        hq.printQueue();
        hq.deque();
        hq.deque();
        hq.queue("s");
        hq.queue("t");
        hq.queue("u");
        hq.queue("v");
        hq.queue("w");
        hq.deque();
        hq.deque();
        hq.deque();
        hq.deque();
        System.out.println(hq.deque().getKey());
        hq.printQueue();
//        hq.queue("a");
//        hq.printQueue();
    }
}
