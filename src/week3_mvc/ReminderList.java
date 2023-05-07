// 4I36 Reo Hakuta

package week3_mvc;

public class ReminderList {

  private Reminder[] reminder;

  public ReminderList() {
    this.reminder = new Reminder[10];
  }

  public void show() {
    System.out.println("----------Reminder List----------");
    // Print the current fields in following format:
    // {{index}}: {{show}}
    for (int i = 0; i < this.reminder.length; i++) {
      if (this.reminder[i] == null)
        continue;
      System.out.print(i + ": ");
      this.reminder[i].show();
    }
    System.out.println("----------End of List----------\n");
  }

  public void add(int i, Reminder r) {
    // If the given index is out of range, do nothing
    if (i < 0 || i >= this.reminder.length)
      return;

    // Assign the given Reminder to the given index
    this.reminder[i] = r;
  }

  public void remove(int i) {
    // If the given index is out of range, do nothing
    if (i < 0 || i >= this.reminder.length)
      return;

    // Remove the Reminder at the given index
    this.reminder[i] = null;
  }

  public void clear() {
    // Create new empty Reminder List
    this.reminder = new Reminder[10];
  }
}
