package misctests.trees.hqueue;

/**
 * Created by Squall on 25/04/2015.
 */
public class HybridQueue {

    private QNode F;
    private QNode R;

    private int FIRST;
    private int LAST;

    public HybridQueue() {
        FIRST = 0;
        LAST = 0;
        F = null;
        R = null;
    }


    public void queue(String key) {
        if (F == null) {
            F = new QNode();
            F.initArray();
            R = F;
        }
        else {
            if (LAST > 4) {
                QNode oldR = R;
                R = new QNode();
                R.initArray();
                LAST = 0;
                oldR.setNext(R);
            }
        }
        setItem(R, key);
        LAST++;
    }

    public QNode deque() {
        QNode node = null;
        System.out.println("VAL: " + getItemNoDelete(F, FIRST).getKey());
        System.out.println("F: " + FIRST);
        if (F == null) {
            System.out.println("Queue is Empty");
        }
        else {
            if (FIRST < 4) {
                if (getItemNoDelete(F, FIRST+1).getKey() == null) {
                    if (F == R) {
                        node = getItem(F);
                        FIRST = 0;
                        LAST = 0;
                    }
                    else
                    {
                        F = F.getNext();
                        FIRST = 0;
                    }
                }
                else {
                    node = getItem(F);
                    FIRST++;
                }
            }
            else {
                if (F != R) {
                    F = F.getNext();
                    FIRST = 0;
                }
                else {
                    node = getItem(F);
                    FIRST = 0;
                    LAST = 0;
                }
               }
            }
            return node;
        }


    public int getFIRST() {
        return FIRST;
    }

    public int getLAST() {
        return LAST;
    }

    public boolean isEmpty(QNode node) {
        int count = 0;
        for (int i = 0; i < node.getITEM().length; i++) {
            if (node.getITEM()[i].getKey() == null) {
                count++;
            }
        }
        return count == node.getITEM().length;
    }

    public boolean isFullRear() {
        return LAST > 4;
    }

    public void setItem(QNode P, String key) {
        P.setITEM(key, LAST);
    }

    public QNode getItem(QNode P) {
        return P.getItem(FIRST);
    }

    public QNode getItemNoDelete(QNode P, int index) {
        return P.getItemNoDelete(index);
    }

    public QNode getFirst() {
        return F;
    }

    public void setFirst(QNode first) {
        this.F = first;
    }

    public QNode getLast() {
        return R;
    }

    public void setLast(QNode last) {
        this.R = last;
    }

    public void printQueue() {
        QNode P = F;
        while (P != null) {
            System.out.print("{");
            for (int i = 0; i < P.getITEM().length; i++) {
                if (P.getITEM()[i].getKey() != null) {
                    if (i == 4) {
                        System.out.print(P.getITEM()[i].getKey());
                    }
                    else
                    {
                        System.out.print(P.getITEM()[i].getKey() + ", ");
                    }
                }
                else {
                    if (i == 4) {
                        System.out.print("EMPTY");
                    }
                    else {
                        System.out.print("EMPTY, ");
                    }
                }
            }
            System.out.print("} ");
            P = P.getNext();
        }
        System.out.println();
    }

}
