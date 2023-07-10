package week13_composite;

import java.util.ArrayList;

public class Directory implements Component {

  private String name;
  private ArrayList<Component> children;

  public Directory(String n) {
    name = n;
    children = new ArrayList<Component>();
  }

  public void add(Component n) {
    children.add(n);
  }

  public ArrayList<Component> getChildren() {
    return children;
  }

  public String toString() {
    return name;
  }
}
