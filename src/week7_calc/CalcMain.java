package week7_calc;

class CalcMain {
  public static void main(String[] args) {
    // MVCのインスタンスを作る
    CalcView v = new CalcView();
    CalcModel m = new CalcModel();
    CalcController c = new CalcController();
    // ViewとControllerを相互に参照する
    v.setCalcController(c);
    c.setCalcView(v);
    // ViewとModelを相互に参照する
    v.setCalcModel(m);
    m.setCalcView(v);
    // ControllerからModelを参照する
    c.setCalcModel(m);
    // モデルの初期値を表示する
    v.update();
  }
}
