package week12;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Observerクラス（棒グラフで表示するView）
class ObserverBarGraph implements Observer {
  // 【今日のPoint】Subjectへの参照
  private SubjectData subjectData;
  // 棒グラフを表示するViewのためのGUI部品
  private JFrame f1;
  private BarGraphPanel p1; // 下でJPanelを継承してクラス定義している

  public ObserverBarGraph() {
    // リスト表示するための部品を作る
    f1 = new JFrame("ObserverBarGraph");
    p1 = new BarGraphPanel();
    // Viewを表示する
    f1.add(p1, BorderLayout.CENTER);
    f1.setSize(300, 300);
    f1.setVisible(true);
  }

  public SubjectData getSubjectData() {
    return subjectData;
  }

  public void setSubjectData(SubjectData subjectData) {
    this.subjectData = subjectData;
  }

  // 【今日のPoint】自身のViewを更新するためのメソッド
  public void update() {
    // repaintメソッドを呼び出すと、下で定義したpaintメソッドが呼び出される
    p1.repaint();
  }

  // 棒グラフを描画するためのPanelを定義する
  public class BarGraphPanel extends JPanel {
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
        int m = 10;
        int s = 30;
        int w = (pw - s) / n;
        int h = 3;
        // SubjectDataが持つ値から1つずつ棒グラフを描く
        for (int i = 0; i < n; i++) {
          int v = data.get(i).intValue();
          // 棒の中を塗りつぶす
          g.setColor(Color.orange);
          g.fillRect((s / 2) + i * w, ph - v * h, w - m, v * h);
          // 棒の枠線を描く
          g.setColor(Color.black);
          g.drawRect((s / 2) + i * w, ph - v * h, w - m, v * h);
        }
      }
    }
  }
}
