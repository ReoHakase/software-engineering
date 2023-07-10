package week13_composite;

import java.util.ArrayList;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

public class MyTreeModel implements TreeModel {

  private Component root;

  public MyTreeModel(Component n) {
    root = n;
  }

  public Object getRoot() {
    return root;
  }

  public Object getChild(Object parent, int index) {
    Component p = (Component) parent;
    ArrayList<Component> children = p.getChildren();
    return children.get(index);
  }

  public int getChildCount(Object parent) {
    Component p = (Component) parent;
    ArrayList<Component> children = p.getChildren();
    return children.size();
  }

  public boolean isLeaf(Object node) {
    if (node instanceof File || node instanceof Member) {
      return true;
    } else {
      return false;
    }
  }

  public int getIndexOfChild(Object parent, Object child) {
    Component p = (Component) parent;
    ArrayList<Component> children = p.getChildren();

    for (int i = 0; i < children.size(); i++) {
      Component n = children.get(i);
      if (n == child) {
        return i;
      }
    }
    return -1;
  }

  public void valueForPathChanged(TreePath path, Object newValue) {
  }

  public void addTreeModelListener(TreeModelListener l) {
  }

  public void removeTreeModelListener(TreeModelListener l) {
  }
}
