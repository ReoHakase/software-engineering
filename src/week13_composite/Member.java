package week13_composite;

import java.util.ArrayList;

public class Member implements Component {
  private String name;
  private String type;
  private String sort; // Either "field" or "method"

  public Member(String n, String t, String s) {
    this.name = n;
    this.type = t;
    this.sort = s;
  }

  public ArrayList<Component> getChildren() {
    return null;
  }

  public String toString() {
    // sort is either "field" or "method"
    switch (sort) {
      case "field":
        return "  " + type + ": " + name;
      case "method":
        return "  " + type + ": " + name + "()";
      default:
        return "[Error] Invalid sort; a property \"sort\" must be either \"field\" or \"method\"";
    }
  }
}
