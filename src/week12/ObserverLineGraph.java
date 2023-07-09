package week12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Observerクラス（折線グラフで表示するView）
public class ObserverLineGraph implements Observer {
  // 【今日のPoint】Subjectへの参照
  private SubjectData subjectData;
  // 棒グラフを表示するViewのためのGUI部品
  private JFrame f1;
  private LineGraphPanel p1; // 下でJPanelを継承してクラス定義している
  // コンストラクタ

  public ObserverLineGraph() {
    // リスト表示するための部品を作る
    f1 = new JFrame("ObserverLineGraph");
    p1 = new LineGraphPanel();
    // Viewを表示する
    f1.add(p1, BorderLayout.CENTER);
    f1.setSize(300, 300);
    f1.setVisible(true);
  }

  public SubjectData getSubjectData() {
    return subjectData;
  }

  public void setSubjectData(SubjectData sb) {
    this.subjectData = sb;
  }

  // 【今日のPoint】自身のViewを更新するためのメソッド
  public void update() {
    // repaintメソッドを呼び出すと、下で定義したpaintメソッドが呼び出される
    p1.repaint();
  }

  // 棒グラフを描画するためのPanelを定義する
  public class LineGraphPanel extends JPanel {
    // paintメソッドを上書きして棒グラフの描画処理を作る
    public void paint(Graphics g) {
      if (subjectData != null) {
        // SubjectDataが持つDataを取得する
        ArrayList<Integer> data = subjectData.getData();
        // 描画する棒グラフの大きさを決める
        if (data == null || data.size() == 0)
          return;
        int pw = p1.getWidth();
        int ph = p1.getHeight();
        int n = data.size();
        int s = 30;
        int w = (pw - s) / n;
        int h = 3;
        // SubjectDataが持つ値から1つずつ線を描く
        int vn = 0;
        int v = 0;
        for (int i = 0; i < n; i++) {
          v = data.get(i).intValue();
          // vnからvへの線を描く
          g.setColor(Color.red);
          g.drawLine((s / 2) + (i - 1) * w, ph - vn * h, (s / 2) + i * w, ph - v * h);
          vn = v;
        }
      }
    }
  }
}
