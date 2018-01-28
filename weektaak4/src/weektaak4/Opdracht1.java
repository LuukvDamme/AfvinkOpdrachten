/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weektaak4;

/**
 *
 * @author Luuk
 */
import javax.swing.*;
import javax.swing.tree.*;

public class Opdracht1 extends JFrame{

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // TODO code application logic here
        JFrame frame = new Opdracht1();
        frame.setSize(400,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Opdracht1");
        frame.setContentPane(new Boom());
        frame.setVisible(true);
    
        
    }
}
    class Boom extends JTree{
        private DefaultTreeModel treeModel;
        public Boom(){
            DefaultMutableTreeNode wortel, kind1, kind2, kleinkind1, kleinkind2;
            wortel = new DefaultMutableTreeNode("root");
            kind1 = new DefaultMutableTreeNode("Kind1");
            kind2 = new DefaultMutableTreeNode("Kind2");
            kleinkind1 = new DefaultMutableTreeNode("Kleinkind1");
            kleinkind2 = new DefaultMutableTreeNode("Kleinkind2");
            
            wortel.add(kind1);
            wortel.add(kind2);
            
            kind1.add(kleinkind1);
            kind1.add(kleinkind2);
            
            treeModel=new DefaultTreeModel(wortel);
            
            setModel(treeModel);
        }
    }

