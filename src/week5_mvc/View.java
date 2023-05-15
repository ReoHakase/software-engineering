// 4I36 Reo Hakuta
package week5_mvc;

import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.awt.Button;
import java.awt.TextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.Choice;

public class View implements ActionListener {

  private ReminderList reminderList;

  private Controller controller;

  // Frame型の変数f1(変数名は何でもよい)
  private Frame f1 = new Frame();

  // List型の変数l1(変数名は何でもよい)
  private List l1 = new List();

  // Frame型の変数f2(変数名は何でもよい)
  private Frame f2 = new Frame();

  // Frame型の削除ボタン用フレーム
  private Frame removerFrame;
  private Choice removerIndexChoice;
  private Button removeButton;

  // TextField型の変数index, name, priority(変数名は何でもよい)
  private Choice indexChoice = new Choice();
  private TextField name = new TextField();
  private Choice priorityChoice = new Choice();

  // Button型の変数add(変数名は何でもよい)
  private Button addButton = new Button("add");

  public void actionPerformed(ActionEvent e) {
    int i, p;
    String n;
    // 押されたボタンがどれなのかを調べる
    if (e.getSource() == addButton) {
      // ポップアップメニューから情報を取得するして整数に変換する
      // （メソッドparseIntは取得した文字列をint型に変換する）
      i = Integer.parseInt(indexChoice.getSelectedItem());
      p = Integer.parseInt(priorityChoice.getSelectedItem());
      n = name.getText();
      // Controllerのメソッドaddを呼び出す
      // ・iは追加する配列の場所
      // ・nはリマインダの名前
      // ・pはリマインダ優先度
      controller.add(i, n, p);
    }

    // 削除ボタンの場合
    if (e.getSource() == removeButton) {
      // テキストフィールドから情報を取得するして整数に変換する
      i = Integer.parseInt(removerIndexChoice.getSelectedItem());
      // Controllerのメソッドremoveを呼び出す
      // iは削除する配列の場所
      controller.remove(i);
    }

    if (e.getSource() == l1) {
      // ダブルクリックで選択された項目の場所をsに代入
      int s = l1.getSelectedIndex();
      // リマインダのリストを取得
      Reminder[] l = reminderList.getReminder();
      // テキストフィールドにリマインダの情報をsetする
      // （整数はString.valueOfで文字列に変換）
      indexChoice.select(new String(String.valueOf(s)));
      name.setText(l[s].getName());
      priorityChoice.select(new String(String.valueOf(l[s].getPriority())));
    }
  }

  public View() {

    // 出力用フレーム

    // フレームを1つ作る(f1で参照)
    this.f1 = new Frame();

    // リストを1つ作る(l1で参照)
    this.l1 = new List();

    // リストl1のイベントリスナにView自身を登録する
    l1.addActionListener(this);

    // f1にl1を追加する(場所はBorderLayout.CENTERに追加)
    f1.add(l1, BorderLayout.CENTER);

    // f1のサイズを決める
    f1.setSize(300, 300);

    // f1をsetVisibleメソッドで表示する
    f1.setVisible(true);

    // 入力用フレーム

    // フレームを1つ作る(f2で参照)
    this.f2 = new Frame();

    this.removerFrame = new Frame();
    this.removerFrame.setLayout(new FlowLayout());
    this.removerIndexChoice = new Choice();
    this.removeButton = new Button("remove");
    this.removeButton.addActionListener(this);
    this.removerFrame.add(removerIndexChoice);
    this.removerFrame.add(removeButton);
    this.removerFrame.pack();
    this.removerFrame.setVisible(true);

    // テキストフィールドを3つ作る(index, name, priorityで参照, 文字幅を指定するとよい)
    this.indexChoice = new Choice();
    this.name = new TextField(20);
    this.priorityChoice = new Choice();

    // ボタンを1つ作る(addで参照)
    this.addButton = new Button("add");

    // 優先度のセレクタに項目を追加する
    for (int i = 0; i < 5; i++) {
      priorityChoice.add(String.valueOf(i));
    }

    // f2のレイアウトをFlowLayoutにする
    this.f2.setLayout(new FlowLayout());

    // f2にindex, name, priority, addを追加する(FlowLayoutは部品を左から順に追加する)
    this.f2.add(indexChoice);
    this.f2.add(name);
    this.f2.add(priorityChoice);
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

    // 追加先の添え字のセレクタの項目を更新する
    indexChoice.removeAll();
    // リマインダの配列の長さ分だけ項目を作る
    for (int i = 0; i < l.length; i++) {
      indexChoice.add(String.valueOf(i));
    }

    // 削除先の添え字のセレクタの項目を更新する
    removerIndexChoice.removeAll();
    // リマインダの配列の長さ分だけ項目を作る
    for (int i = 0; i < l.length; i++) {
      removerIndexChoice.add(String.valueOf(i));
    }

    // メニュー項目が変わったので念のためフレームの部品を再配置する
    f2.pack();
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
