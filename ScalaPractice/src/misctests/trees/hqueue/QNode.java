package misctests.trees.hqueue;

/**
 * Created by Squall on 25/04/2015.
 */
public class QNode {
    private QNode[] ITEM;
    private QNode next;

    private String key;

    public QNode() {
        this.key = null;
        next = null;
        ITEM = new QNode[5];
    }

    public void initArray() {
        for (int i = 0; i < ITEM.length; i++) {
            ITEM[i] = new QNode();
        }
    }

    public QNode[] getITEM() {
        return ITEM;
    }

    public QNode getNext() {
        return next;
    }

    public void setNext(QNode next) {
        this.next = next;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setITEM(String key, int index) {
        ITEM[index].setKey(key);
    }

    public QNode getItemNoDelete(int index) {
        return ITEM[index];
    }

    public QNode getItem(int index) {
        QNode store = new QNode();
        store.setKey(ITEM[index].getKey());
        ITEM[index].setKey(null);
        return store;
    }

    public boolean hasNext() {
        return next != null;
    }
}
