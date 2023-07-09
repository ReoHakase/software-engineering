package week12;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.util.ArrayList;

public class ObserverView3 implements Observer {
  // 【今日のPoint】Subjectへの参照
  private SubjectModel subjectModel;

  private Frame f1;
  private List list;

  public ObserverView3() {
    f1 = new Frame("View3");
    list = new List();

    f1.setLayout(new BorderLayout());
    f1.add(list, BorderLayout.CENTER);
    f1.setVisible(true);
  }

  public SubjectModel getSubjectModel() {
    return subjectModel;
  }

  public void setSubjectModel(SubjectModel subjectModel) {
    this.subjectModel = subjectModel;
  }

  public void update() {
    // Remove all elements from list
    list.removeAll();

    // Retrive data from SubjectModel
    ArrayList<String> data = subjectModel.getData();

    // Add data to list
    for (int i = 0; i < data.size(); i++) {
      list.add(data.get(i));
    }

    // Resize the frame
    f1.pack();
  }
}
