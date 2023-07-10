package week13_composite;

public class Main1 {
  public static void main(String[] args) {
    Directory root = new Directory("home");
    Directory d1 = new Directory("Documents");
    Directory d2 = new Directory("Pictures");
    Directory d3 = new Directory("Music");
    Directory d4 = new Directory("prog");

    File f1 = new File("MyClass", "java");
    File f2 = new File("calc", "py");
    File f3 = new File("sample", "pl");
    File f4 = new File("myphoto", "jpg");
    File f5 = new File("screen_shot", "png");
    File f6 = new File("report", "doc");
    File f7 = new File("music", "mp3");

    root.add(d1);
    root.add(d2);
    root.add(d3);

    d1.add(d4);
    d1.add(f6);

    d2.add(f4);
    d2.add(f5);

    d3.add(f7);

    d4.add(f1);
    d4.add(f2);
    d4.add(f3);

    MyTreeModel m = new MyTreeModel(root);
    new MyTreeView(m);
  }
}
