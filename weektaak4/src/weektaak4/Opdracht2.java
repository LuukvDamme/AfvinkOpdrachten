package weektaak4;

/**
 *
 * @author Luuk
 */

public class Opdracht2
{
    private static Node root;

    private static void visit(Node t) {
        System.out.println(t.getKey());
    }

    public Opdracht2(int data)
    {
        root = new Node(data);
    }
public static void postOrder(Node t)
{
     if (t != null)
     {
        postOrder(t.getLeft());    
        postOrder(t.getRight());
        visit(t); 
     }
}
public static void inOrder(Node t)
{
     if (t != null)
     {
        inOrder(t.getLeft());
        visit(t); 
        inOrder(t.getRight()); 
     }
}
public static void preOrder(Node t)
{
     if (t != null)
     {
        visit(t); 
        preOrder(t.getLeft());  
        preOrder(t.getRight()); 
     }
}
public void printLevelOrder()
    {
        int h = height(root);
        int i;
        for (i=1; i<=h; i++)
            LevelOrder(root, i);
    }
int height(Node root)
    {
        if (root == null)
            return 0;
        else
        {
            /* de hoogte van de subboom berekenen */
            int lheight = height(root.getLeft());
            int rheight = height(root.getRight());

            /* het gebruiken van de grotere */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1);
        }
    }

    /* Print nodes op het gegeven niveau */
    void LevelOrder (Node root ,int level)
    {
        if (root == null)
            return;
        if (level == 1)
            System.out.print(root.getKey() + " ");
        else if (level > 1)
        {
            LevelOrder(root.getLeft(), level-1);
            LevelOrder(root.getRight(), level-1);
        }
    }

    
    public void add(Node parent, Node child, String orientation)
    {
        if (orientation.equals("left"))
        {
           parent.setLeft(child);
        }
        else
        {
            parent.setRight(child);
        }
    }

    public static void main(String args[])
    {
        Node n1 = new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(2);
        Node n4 = new Node(5);

        Opdracht2 tree = new Opdracht2(3);
        tree.add(root, n1, "left");     
        tree.add(root, n2, "right");            
        tree.add(n2, n3, "left");             
        tree.add(n2, n4, "right");                
        System.out.println("orginele boom: ");
        System.out.println("  3");
        System.out.println(" / |");
        System.out.println("1  4");
        System.out.println("  / |");
        System.out.println(" 2  5");
        System.out.println("\npostOrder:");
        postOrder(root);
        System.out.println("\nInorder:");
        inOrder(root);
        System.out.println("\nPreOrder:");
        preOrder(root);
        System.out.println("\nLevel order:");
        tree.printLevelOrder();
    }
}



class Node {
    private int key;
    private Node left;
    private Node right;

    Node (int key) {
        this.key = key;
        right = null;
        left = null;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right ) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

}