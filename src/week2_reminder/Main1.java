
package week2_reminder;

public class Main1 {
  public static void main(String[] args) {
    // Reminderの動作確認
    Reminder r1 = new Reminder();
    r1.show();
    r1.setName("ミルクを買う");
    r1.setPriority(3);
    r1.show();
  }
}
