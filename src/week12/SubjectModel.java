package week12;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SubjectModel implements ActionListener {

  private ArrayList<String> data;
  // 【今日のPoint】Observerのリスト
  private ArrayList<Observer> observer;

  private Frame f1;
  private TextField input;
  private Button add;

  public SubjectModel() {
    data = new ArrayList<String>();
    observer = new ArrayList<Observer>();

    f1 = new Frame("Add");
    input = new TextField(10);
    add = new Button("add");

    f1.setLayout(new FlowLayout());
    f1.add(input);
    f1.add(add);

    add.addActionListener(this);
    f1.pack();
    f1.setVisible(true);
  }

  public ArrayList<String> getData() {
    return data;
  }

  public void setData(ArrayList<String> data) {
    this.data = data;
  }

  public ArrayList<Observer> getObserver() {
    return observer;
  }

  public void setObserver(ArrayList<Observer> observer) {
    this.observer = observer;
  }

  // 【今日のPoint】Observerをリストに追加する
  public void addObserver(Observer o) {
    observer.add(o);
  }

  // 【今日のPoint】全てのObserverに更新を通知する
  public void notifyObserver() {
    // ArrayListの全要素のupdateメソッドを呼び出す
    for (int i = 0; i < observer.size(); i++) {
      // ArrayListはgetメソッドで要素を取得できる
      Observer o = observer.get(i);
      o.update();
    }
  }

  public void add(String str) {
    data.add(str);
    // 【今日のPoint】Observerにdataの更新を通知する
    this.notifyObserver();
  }

  public void actionPerformed(ActionEvent e) {
    this.add(input.getText());
  }

}
