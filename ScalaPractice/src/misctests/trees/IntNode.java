package misctests.trees;

/**
 * Created by Squall on 23/04/2015.
 */
public class IntNode {
    private int key;
    private IntNode left, right;

    public IntNode() {
        left = right = null;
    }

    public IntNode(int key) {
        this(key, null, null);
    }

    public IntNode(int key, IntNode left, IntNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public IntNode getLeft() {
        return left;
    }

    public IntNode getRight() {
        return right;
    }

    public void setLeft(IntNode left) {
        this.left = left;
    }

    public void setRight(IntNode right) {
        this.right = right;
    }
}
