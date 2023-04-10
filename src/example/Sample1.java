// 4I36 Reo Hakuta

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample1 {

  // (1) 変数を宣言
  String input;
  // 状態は、0が奇数、1が偶数の状態を表す
  int current_state = 0; // 現在の状態（初期状態）
  int fin_state = 1; // 終了状態

  public void scan() {
    // (2) 文字列の入力
    try {
      System.out.println("数字を入力してください。");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      input = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void next() {
    /* (3) 先頭から順に読み込みながら状態遷移 */
    for (int i = 0; i < input.length(); i++) {
      char ch = input.charAt(i);
      switch (current_state) {
        case 0:
          if (ch == '0' || ch == '2' || ch == '4' || ch == '6' || ch == '8') {
            current_state = 1;
          } else {
            current_state = 0;
          }
          break;
        case 1:
          if (ch == '1' || ch == '3' || ch == '5' || ch == '7' || ch == '9') {
            current_state = 0;
          } else {
            current_state = 1;
          }
          break;
      }
      System.out.printf("読み込んだ数値 : %c 遷移先 : %d\n", ch, current_state);
    }
  }

  public void check() {
    /* (4) 終了状態にいるか判定 */
    if (current_state == fin_state) {
      System.out.println("受理する。");
    } else {
      System.out.println("受理しない。");
    }
  }

  public static void main(String[] args) {
    Sample1 ev = new Sample1();
    ev.scan();
    ev.next();
    ev.check();
  }
}