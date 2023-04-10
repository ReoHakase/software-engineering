// 4I36 Reo Hakuta

public class MyCalc {

  private int result1;

  private int result2;

  public MyCalc() {
    // Initialize both fields with -1
    this.result1 = -1;
    this.result2 = -1;
  }

  public void show() {
    // Print the current fields in following format:
    // result1: 310
    // result2: 3000
    System.out.println("result1: " + this.result1);
    System.out.println("result2: " + this.result2);
  }

  public void calc(int x, int y) {
    // Sum for result1
    this.result1 = x + y;
    // Product for result2
    this.result2 = x * y;
  }

  // Setters and getters for result1 and result2
  public int getResult1() {
    return this.result1;
  }

  public int getResult2() {
    return this.result2;
  }

  public void setResult1(int result1) {
    this.result1 = result1;
  }

  public void setResult2(int result2) {
    this.result2 = result2;
  }

}
