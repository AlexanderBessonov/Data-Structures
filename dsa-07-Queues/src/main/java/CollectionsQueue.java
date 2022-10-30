import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.TreeMap;

public class CollectionsQueue {
    public static void main(String[] args) {

        MyQueue<Integer> mq = new MyQueue<>();
        mq.enqueue(1);
        mq.enqueue(2);
        System.out.println(mq.dequeue());

    }
}
