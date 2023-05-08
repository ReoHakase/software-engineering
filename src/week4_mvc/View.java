// 4I36 Reo Hakuta
package week4_mvc;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

public class View implements ActionListener {

  private ReminderList reminderList;

  private Controller controller;

  // Frame型の変数f1(変数名は何でもよい)
  private Frame f1 = new Frame();

  // List型の変数l1(変数名は何でもよい)
  private List l1 = new List();

  // Frame型の変数f2(変数名は何でもよい)
  private Frame f2 = new Frame();

  // TextField型の変数index, name, priority(変数名は何でもよい)
  private TextField index = new TextField();
  private TextField name = new TextField();
  private TextField priority = new TextField();

  // Button型の変数add(変数名は何でもよい)
  private Button addButton = new Button("add");

  public void actionPerformed(ActionEvent e) {

  }

  public View() {

    // 出力用フレーム

    // フレームを1つ作る(f1で参照)
    this.f1 = new Frame();

    // リストを1つ作る(l1で参照)
    this.l1 = new List();

    // f1にl1を追加する(場所はBorderLayout.CENTERに追加)
    f1.add(l1, BorderLayout.CENTER);

    // f1のサイズを決める
    f1.setSize(300, 300);

    // f1をsetVisibleメソッドで表示する
    f1.setVisible(true);

    // 入力用フレーム

    // フレームを1つ作る(f2で参照)
    this.f2 = new Frame();

    // テキストフィールドを3つ作る(index, name, priorityで参照, 文字幅を指定するとよい)
    this.index = new TextField(5);
    this.name = new TextField(20);
    this.priority = new TextField(5);

    // ボタンを1つ作る(addで参照)
    this.addButton = new Button("add");

    // f2のレイアウトをFlowLayoutにする
    this.f2.setLayout(new FlowLayout());

    // f2にindex, name, priority, addを追加する(FlowLayoutは部品を左から順に追加する)
    this.f2.add(index);
    this.f2.add(name);
    this.f2.add(priority);
    this.f2.add(addButton);

    // f2のサイズを決める(メソッドpackを使うと楽)
    this.f2.pack();

    // f2をsetVisibleメソッドで表示する
    this.f2.setVisible(true);

    // addに自身をリスナに登録する(メソッドaddActionListenerを使う)
    this.addButton.addActionListener(this);
  }

  public void update() {
    // リストの内容を全て消す
    l1.removeAll();
    // リマインダの配列を取得する
    Reminder[] l = reminderList.getReminder();
    // 取得した配列に繰り返し処理をする
    for (int i = 0; i < l.length; i++) {
      // リマインダの情報から文字列を作る
      String str = "";
      // 配列の添字を追加
      str += "[" + String.valueOf(i) + "] ";
      if (l[i] != null) {
        // リマインダの名前を取得して追加
        str += l[i].getName();
        // リマインダの優先度を取得して追加
        str += "(" + l[i].getPriority() + ") ";
      }
      // リストにリマインダ情報の文字列を追加
      l1.add(str);
    }
  }

  public ReminderList getReminderList() {
    return reminderList;
  }

  public void setReminderList(ReminderList reminderList) {
    this.reminderList = reminderList;
  }

  public Controller getController() {
    return controller;
  }

  public void setController(Controller controller) {
    this.controller = controller;
  }

}
