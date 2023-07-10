package week13_composite;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTree;

public class MyTreeView {

  private JFrame f1;
  private JTree tr1;

  public MyTreeView(MyTreeModel m) {
    f1 = new JFrame("TreeView");
    tr1 = new JTree(m);

    f1.setLayout(new BorderLayout());
    f1.add(tr1, BorderLayout.CENTER);

    f1.setSize(500, 500);
    f1.setVisible(true);
    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
