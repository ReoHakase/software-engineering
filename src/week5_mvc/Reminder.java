// 4I36 Reo Hakuta

package week5_mvc;

public class Reminder {

  private String name;

  private int priority;

  public Reminder() {
    this.name = "no name";
    this.priority = 0;
  }

  public void show() {
    // Print the current fields in following format:
    // {{name}}({{priority}})
    System.out.println(this.name + "(" + this.priority + ")");
  }

  // Setter and getter for name
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  // Setter and getter for priority
  public int getPriority() {
    return this.priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  }
}
