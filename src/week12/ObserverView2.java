package week12;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.util.ArrayList;

public class ObserverView2 implements Observer {
  // 【今日のPoint】Subjectへの参照
  private SubjectModel subjectModel;

  private Frame f1;
  private ScrollPane sp1;
  private Panel p1;

  public ObserverView2() {
    f1 = new Frame("View2");
    sp1 = new ScrollPane();
    p1 = new Panel();

    sp1.add(p1);

    f1.setLayout(new BorderLayout());
    f1.add(sp1, BorderLayout.CENTER);
    p1.setLayout(new FlowLayout());
    f1.setVisible(true);
  }

  public SubjectModel getSubjectModel() {
    return subjectModel;
  }

  public void setSubjectModel(SubjectModel subjectModel) {
    this.subjectModel = subjectModel;
  }

  public void update() {
    p1.removeAll();
    ArrayList<String> data = subjectModel.getData();
    for (int i = 0; i < data.size(); i++) {
      p1.add(new Label(data.get(i)));
    }
    sp1.setSize(200, 50);
    f1.pack();
  }
}
