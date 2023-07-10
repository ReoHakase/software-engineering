package week13_composite;

public class Main4 {
  public static void main(String[] args) {

    // Classes
    Class carClass = new Class("Car");
    Class dateClass = new Class("Date");

    // Members
    Member numMember = new Member("num", "int", "field");
    Member gasMember = new Member("gas", "double", "field");
    Member showMember = new Member("show", "void", "method");
    Member yearMember = new Member("year", "int", "field");
    Member monthMember = new Member("month", "int", "field");
    Member dayMember = new Member("day", "int", "field");
    Member toStringMember = new Member("toString", "String", "method");

    // Add members to classes
    carClass.add(numMember);
    carClass.add(gasMember);
    carClass.add(showMember);
    carClass.add(dateClass);

    dateClass.add(yearMember);
    dateClass.add(monthMember);
    dateClass.add(dayMember);
    dateClass.add(toStringMember);

    // Create tree model and view
    MyTreeModel m = new MyTreeModel(carClass);
    new MyTreeView(m);
  }
}
