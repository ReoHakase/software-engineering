package week13_composite;

import java.util.ArrayList;

public interface Component {
  public String toString();

  public ArrayList<Component> getChildren();
}
