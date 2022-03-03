import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
public class JTreeDemo extends JFrame
{
    private JTree tree;
    public JTreeDemo()
    {
        DefaultMutableTreeNode root=new DefaultMutableTreeNode("FOODS");

        DefaultMutableTreeNode vegetableNode=new DefaultMutableTreeNode("Vegatables");
        DefaultMutableTreeNode fruitNode=new DefaultMutableTreeNode("Fruits");

        DefaultMutableTreeNode tNode=new DefaultMutableTreeNode("Tomato");
        DefaultMutableTreeNode pNode=new DefaultMutableTreeNode("Potato");
        DefaultMutableTreeNode yNode=new DefaultMutableTreeNode("Beans");
        DefaultMutableTreeNode aNode=new DefaultMutableTreeNode("Apple");
        DefaultMutableTreeNode bNode=new DefaultMutableTreeNode("Mango");
        DefaultMutableTreeNode cNode=new DefaultMutableTreeNode("Grapes");
        vegetableNode.add(tNode);
        vegetableNode.add(pNode);
        vegetableNode.add(yNode);
        fruitNode.add(aNode);
        fruitNode.add(bNode);
        fruitNode.add(cNode);
        root.add(vegetableNode);
        root.add(fruitNode);
        tree=new JTree(root);
        add(tree);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("FOODS");

        setBounds(400,300,300,300);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        new JTreeDemo();
    }
}