package week12;

public class Main1 {
  public static void main(String[] args) {
    // Observerを作る
    ObserverView1 v1 = new ObserverView1();
    ObserverView2 v2 = new ObserverView2();
    // Subjectを作る
    SubjectModel m = new SubjectModel();

    // ObserverからSubjectを参照する
    v1.setSubjectModel(m);
    v2.setSubjectModel(m);
    // SubjectにObserverを追加する
    m.addObserver(v1);
    m.addObserver(v2);
    // 各Observerを更新する
    m.notifyObserver();
  }
}
