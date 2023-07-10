package week13_composite;

import java.util.ArrayList;

public class File implements Component {

  private String name;
  private String ext;

  public File(String n, String e) {
    name = n;
    ext = e;
  }

  public ArrayList<Component> getChildren() {
    return null;
  }

  public String toString() {
    return name + "." + ext;
  }
}
