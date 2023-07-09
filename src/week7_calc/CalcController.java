package week7_calc;

public class CalcController {
  private CalcModel calcModel;
  private CalcView calcView;

  public CalcModel getCalcModel() {
    return calcModel;
  }

  public void setCalcModel(CalcModel calcModel) {
    this.calcModel = calcModel;
  }

  public void setCalcView(CalcView calcView) {
    this.calcView = calcView;
  }

  public void calc(int x, int y) {
    calcModel.calc(x, y);
  }
}
