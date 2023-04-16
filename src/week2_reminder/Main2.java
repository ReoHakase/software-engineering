package week2_reminder;

public class Main2 {
  public static void main(String[] args) {
    // まずリストに追加するReminderを作る
    Reminder r1 = new Reminder();
    r1.setName("ミルクを買う");
    r1.setPriority(3);
    Reminder r2 = new Reminder();
    r2.setName("机の上を片付ける");
    r2.setPriority(1);
    // Reminder Listの動作確認
    ReminderList list = new ReminderList();
    list.show();
    list.add(5, r1);
    list.show();
    list.add(2, r2);
    list.show();
  }
}
