package week12;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.util.ArrayList;

public class ObserverView1 implements Observer {
  // 【今日のPoint】Subjectへの参照
  private SubjectModel subjectModel;

  private Frame f1;

  public ObserverView1() {
    f1 = new Frame("View1");
    f1.setLayout(new FlowLayout());
    f1.setVisible(true);
  }

  public SubjectModel getSubjectModel() {
    return subjectModel;
  }

  public void setSubjectModel(SubjectModel subjectModel) {
    this.subjectModel = subjectModel;
  }

  public void update() {
    f1.removeAll();
    ArrayList<String> data = subjectModel.getData();
    for (int i = 0; i < data.size(); i++) {
      f1.add(new Label(data.get(i)));
    }
    f1.pack();
  }
}
