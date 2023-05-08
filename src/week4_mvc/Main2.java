// 4I36 Reo Hakuta

package week4_mvc;

public class Main2 {
  public static void main(String[] args) {
    // Viewを作成する
    View view = new View();
    // Modelを作成する
    ReminderList list = new ReminderList();
    // ViewとModelを相互に関係付ける
    list.setView(view);
    view.setReminderList(list);

    // まずリストに追加するReminderを作る
    Reminder r1 = new Reminder();
    r1.setName("ミルクを買う");
    r1.setPriority(3);
    Reminder r2 = new Reminder();
    r2.setName("机の上を片付ける");
    r2.setPriority(1);
    // removeの動作確認
    list.add(5, r1);
    list.add(2, r2);
    list.show();
    list.remove(5);
    list.show();
  }
}
