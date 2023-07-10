package week13_composite;

public class Shortcut extends File {

  private String path;

  public Shortcut(String name, String ext, String path) {
    super(name, ext);
    this.path = path;
  }

  public String toString() {
    return name + "." + ext + " -> " + path;
  }
}
