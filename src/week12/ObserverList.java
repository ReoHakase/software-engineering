package week12;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.List;
import java.util.ArrayList;

public class ObserverList implements Observer {
  private SubjectData subjectData;
  private Frame f1;
  private List list;

  public ObserverList() {
    f1 = new Frame("ObserverList");
    list = new List();

    f1.setLayout(new BorderLayout());
    f1.add(list, BorderLayout.CENTER);
    f1.setVisible(true);
  }

  public SubjectData getSubjectData() {
    return subjectData;
  }

  public void setSubjectData(SubjectData subjectData) {
    this.subjectData = subjectData;
  }

  public void update() {
    // Remove all elements from list
    list.removeAll();

    // Retrive data from SubjectModel
    ArrayList<Integer> data = subjectData.getData();

    // Add data to list
    for (int i = 0; i < data.size(); i++) {
      list.add(data.get(i).toString());
    }

    // Resize the frame
    f1.pack();
  }
}
