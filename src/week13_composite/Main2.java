package week13_composite;

public class Main2 {
  public static void main(String[] args) {
    // Directories
    Directory root = new Directory("se-112");
    Directory srcDirectory = new Directory("src");
    Directory srcKadaiDirectory = new Directory("kadai");
    Directory binDirectory = new Directory("bin");
    Directory binKadaiDirectory = new Directory("kadai");

    // Java source files
    File observerBarGraphJavaFile = new File("ObserverBarGraph", "java");
    File subjectDataJavaFile = new File("SubjectData", "java");
    File observerJavaFile = new File("Observer", "java");
    File subjectJavaFile = new File("Subject", "java");

    // Java class files
    File observerBarGraphClassFile = new File("ObserverBarGraph", "class");
    File subjectDataClassFile = new File("SubjectData", "class");
    File observerClassFile = new File("Observer", "class");
    File subjectClassFile = new File("Subject", "class");

    // se-112
    root.add(srcDirectory);
    root.add(binDirectory);

    // src
    srcDirectory.add(srcKadaiDirectory);
    srcDirectory.add(observerJavaFile);
    srcDirectory.add(subjectJavaFile);

    // src/kadai
    srcKadaiDirectory.add(observerBarGraphJavaFile);
    srcKadaiDirectory.add(subjectDataJavaFile);

    // bin
    binDirectory.add(binKadaiDirectory);
    binDirectory.add(observerClassFile);
    binDirectory.add(subjectClassFile);

    // bin/kadai
    binKadaiDirectory.add(observerBarGraphClassFile);
    binKadaiDirectory.add(subjectDataClassFile);

    MyTreeModel m = new MyTreeModel(root);
    new MyTreeView(m);
  }
}
