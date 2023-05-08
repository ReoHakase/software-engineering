// 4I36 Reo Hakuta

package week4_mvc;

public class Controller {

  private View view;

  private ReminderList reminderList;

  public void add(int i, String n, int p) {
    // 追加するReminderインスタンスを1つ作る
    Reminder r1 = new Reminder();
    // 引数で渡されたリマインダ情報をインスタンスにsetする
    r1.setName(n);
    r1.setPriority(p);
    // i番目にリマインダを追加する
    reminderList.add(i, r1);
  }

  public void remove(int i) {

  }

  public void clear() {

  }

  public View getView() {
    return view;
  }

  public void setView(View view) {
    this.view = view;
  }

  public ReminderList getReminderList() {
    return reminderList;
  }

  public void setReminderList(ReminderList reminderList) {
    this.reminderList = reminderList;
  }

}
