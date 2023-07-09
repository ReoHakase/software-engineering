package week7_calc;

import java.awt.*;
import java.awt.event.*;

public class CalcView implements ActionListener {
  private CalcModel calcModel;
  private CalcController calcController;
  private Frame f1;
  private TextField tf1;
  private TextField tf2;
  private Label l1;
  private Label l2;
  private Button calc;

  public CalcView() {
    f1 = new Frame("Calc App");
    tf1 = new TextField();
    tf2 = new TextField();
    l1 = new Label();
    l2 = new Label();
    calc = new Button("=");

    f1.setLayout(new GridLayout(5, 1));
    f1.add(tf1);
    f1.add(tf2);
    f1.add(calc);
    f1.add(l1);
    f1.add(l2);
    f1.pack();
    f1.setVisible(true);

    calc.addActionListener(this);
  }

  public CalcModel getCalcModel() {
    return calcModel;
  }

  public void setCalcModel(CalcModel calcModel) {
    this.calcModel = calcModel;
  }

  public CalcController getCalccontroller() {
    return calcController;
  }

  public void setCalcController(CalcController calcController) {
    this.calcController = calcController;
  }

  public void update() {
    int r1 = calcModel.getResult1();
    int r2 = calcModel.getResult2();
    l1.setText(String.valueOf(r1));
    l2.setText(String.valueOf(r2));
  }

  public void actionPerformed(ActionEvent e) {
    String s1 = tf1.getText();
    String s2 = tf2.getText();
    int n1 = Integer.parseInt(s1);
    int n2 = Integer.parseInt(s2);
    calcController.calc(n1, n2);
  }
}
