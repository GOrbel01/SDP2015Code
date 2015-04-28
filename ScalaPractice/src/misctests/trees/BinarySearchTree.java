package misctests.trees;

import java.util.Stack;

/**
 * Created by Squall on 23/04/2015.
 */
public class BinarySearchTree {

    protected StringNode rootNode;

    private int size;

    private static int visitCounter;

    public BinarySearchTree() {
        size = 0;
        rootNode = null;
    }

    public void insert(String key) {
        boolean done = false;
        StringNode pointer = rootNode;
        if (pointer == null) {
            rootNode = new StringNode(key);
            done = true;
        }
        while (!done) {
            if (pointer != null) {
                if (compareStrings(pointer.getKey(), key))
                {
                    if (pointer.getLeft() == null)
                    {
                        pointer.setLeft(new StringNode(key));
                        done = true;
                    }
                    else
                    {
                        pointer = pointer.getLeft();
                    }
                }
                else
                {
                    if (pointer.getRight() == null)
                    {
                        pointer.setRight(new StringNode(key));
                        done = true;
                    }
                    else
                    {
                        pointer = pointer.getRight();
                    }
                }
            }
        }
        size++;
    }

    public int getSize() {
        return size;
    }

    public void visit(StringNode pointer) {
        visitCounter++;
        if (visitCounter > size) {
            visitCounter = 1;
        }
        System.out.println("Visit Number: " + visitCounter + " At Node: " + pointer.getKey());
    }

    public void recursivePreTraverse(StringNode pointer) {
        if (pointer != null) {
            visit(pointer);
            recursivePreTraverse(pointer.getLeft());
            recursivePreTraverse(pointer.getRight());
        }
    }

    public void recursivePostTraverse(StringNode pointer) {
        if (pointer != null) {
            recursivePostTraverse(pointer.getLeft());
            recursivePostTraverse(pointer.getRight());
            visit(pointer);
        }
    }

    public void recursiveInTraverse(StringNode pointer) {
        if (pointer != null) {
            recursiveInTraverse(pointer.getLeft());
            visit(pointer);
            recursiveInTraverse(pointer.getRight());
        }
    }

    public void iterativePreTraverseWithStackPosition(StringNode pointer, int position) {
        iterativePreTraverse(pointer, position);
    }

    private void iterativePreTraverse(StringNode pointer, int position) {
        Stack<StringNode> stack = new Stack<>();
        int counter = 0;
        while (true) {
            if (pointer != null) {
                visit(pointer);
                counter++;
                printStackAtPosition(stack, position);
                stack(stack, pointer);
                pointer = pointer.getLeft();
            }
            else {
                if (stack.isEmpty()) {
                    return;
                }
                else {
                    pointer = unstack(stack);
                    pointer = pointer.getRight();
                }
            }
        }
    }

    public void deleteNode(StringNode root, String key) {
        StringNode A;
        StringNode B = null;
        StringNode C;
        StringNode D;
        A = root;
        while (A != null && (!(A.getKey().equals(key)))) {
            B = A;
            A = (compareStrings(A.getKey(), key) ? A.getLeft() : A.getRight());
        }
        if (A == null) {
            System.out.println("Node Not Found");
        }
        else
        {
            if (A.getLeft() == null) {
                C = A.getRight();
            }
            else if (A.getRight() == null) {
                C = A.getLeft();
            }
            else {
                C = A.getRight();
                if (C.getLeft() != null) {
                    do {
                        D = C;
                        C = C.getLeft();
                    } while (C.getLeft() != null);
                    D.setLeft(C.getRight());
                    C.setRight(A.getRight());
                }
                C.setLeft(A.getLeft());
            }
            if (A == root) {
                rootNode = C;
            }
            else if (B.getLeft() == A) {
                B.setLeft(C);
            }
            else {
                B.setRight(C);
            }
            size--;
            release(A);
        }
    }

    private void release(StringNode node) {
        node.setLeft(null);
        node.setRight(null);
    }

    public void printStackAtPosition(Stack<StringNode> stack, int position) {
        System.out.print("Stack After Visit " + visitCounter + ": ");
        for (int i = 0; i < stack.size(); i++) {
            if (i < stack.size() - 1) {
                if (i == position) {
                    System.out.print(stack.elementAt(i).getKey() + ", ");
                }
            }
            else
            {
                if (i == position) {
                    System.out.print(stack.elementAt(i).getKey());
                }
            }
        }
        System.out.println();
    }

    public void stack(Stack<StringNode> stack, StringNode item) {
        stack.push(item);
    }

    public StringNode unstack(Stack<StringNode> stack) {
        return stack.pop();
    }

    public StringNode getRootNode() {
        return rootNode;
    }

    private boolean compareStrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (!(s1.charAt(i) == s2.charAt(i))) {
                return s1.charAt(i) > s2.charAt(i);
            }
        }
        return false;
    }
}
