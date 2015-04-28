package misctests.trees;

/**
 * Created by Squall on 23/04/2015.
 */
public class BSTTest {
    public static void main(String[] args) {
        BSTTest bt = new BSTTest();
        bt.launch();
    }

    public void launch() {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert("TIME");
        bst.insert("PERH");
        bst.insert("THRE");
        bst.insert("MONT");
        bst.insert("PART");
        bst.insert("THER");
        bst.insert("SUPE");
        bst.insert("READ");
        bst.insert("COMM");
        bst.insert("STUD");
        bst.insert("MAKE");
        bst.insert("CHAN");
        bst.insert("EXTE");
        bst.insert("BASI");
        bst.insert("BEAR");
//        bst.insert(6);
//        bst.insert(4);
//        bst.insert(5);
//        bst.insert(3);
//        bst.insert(8);
//        bst.insert(7);
//        bst.insert(3);
//        bst.insert(9);
//        bst.insert(2);
//        bst.recursivePreTraverse(bst.getRootNode());
//        bst.iterativePreTraverse(bst.getRootNode());
        bst.deleteNode(bst.rootNode, "MAKE");
        bst.recursivePreTraverse(bst.rootNode);
//        System.out.println("Post Next");
//        bst.recursivePostTraverse(bst.getRootNode());
        System.out.println("In Next");
        bst.recursiveInTraverse(bst.getRootNode());
    }
}
