package week12;

//ここに自分の名前
public class Main5 {
  public static void main(String[] args) {
    // Create instances of Observer
    ObserverBarGraph observerBarGraph = new ObserverBarGraph();
    ObserverLineGraph observerLineGraph = new ObserverLineGraph();
    ObserverList observerList = new ObserverList();

    // Create instances of Subject
    SubjectData subjectData = new SubjectData();

    // Reference SubjectData from Observer
    observerBarGraph.setSubjectData(subjectData);
    observerLineGraph.setSubjectData(subjectData);
    observerList.setSubjectData(subjectData);

    // Add Observers to SubjectData
    subjectData.addObserver(observerBarGraph);
    subjectData.addObserver(observerLineGraph);
    subjectData.addObserver(observerList);

    // Update Observers
    subjectData.notifyObserver();
  }
}
