package misctests.trees;

/**
 * Created by Squall on 24/04/2015.
 */
public class StringNode {
    private String key;

    private StringNode left, right;

    public StringNode() {
        left = right = null;
    }

    public StringNode(String key) {
        this(key, null, null);
    }

    public StringNode(String key, StringNode left, StringNode right) {
        this.key = key;
        this.left = left;
        this.right = right;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public StringNode getLeft() {
        return left;
    }

    public StringNode getRight() {
        return right;
    }

    public void setLeft(StringNode left) {
        this.left = left;
    }

    public void setRight(StringNode right) {
        this.right = right;
    }
}
