package week7_calc;

public class CalcModel {
  private CalcView calcView;
  private int result1;
  private int result2;

  public CalcModel() {
    result1 = 0;
    result2 = 0;
  }

  public CalcView getCalcView() {
    return calcView;
  }

  public void setCalcView(CalcView calcView) {
    this.calcView = calcView;
  }

  public int getResult1() {
    return result1;
  }

  public void setResult1(int result1) {
    this.result1 = result1;
  }

  public int getResult2() {
    return result2;
  }

  public void setResult2(int result2) {
    this.result2 = result2;
  }

  public void show() {
    System.out.printf("result1: %d\n", result1);
    System.out.printf("result2: %d\n", result2);
  }

  public void calc(int x, int y) {
    result1 = x + y;
    result2 = x * y;
    calcView.update();
  }
}

class CalcDouble extends CalcModel {
}

class CalcList {
  private CalcDouble[] calcDouble;

  public CalcList() {
    calcDouble = new CalcDouble[20];
  }
}
