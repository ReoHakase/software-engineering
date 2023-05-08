// 4I36 Reo Hakuta

package week4_mvc;

//第4週用Main1
public class Main1 {
  public static void main(String[] args) {
    // Viewを作成する
    View view = new View();
    // Modelを作成する
    ReminderList list = new ReminderList();
    // Controllerを作成する
    Controller controller = new Controller();

    // ViewとModelを相互に関係付ける
    list.setView(view);
    view.setReminderList(list);

    // ViewとControllerを相互に関係付ける
    view.setController(controller);
    controller.setView(view);

    // ControllerからModelを参照可能にする
    controller.setReminderList(list);

    // 最初にViewを更新しておく
    view.update();
  }
}
