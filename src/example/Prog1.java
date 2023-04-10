// 4I36 Reo Hakuta

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

enum State {
  DIVISIBLE_BY_5, NOT_DIVISIBLE_BY_5
}

public class Prog1 {

  String input;
  // 状態は、列挙型で表す
  State currentState = State.NOT_DIVISIBLE_BY_5;
  State[] finStates = {
      State.DIVISIBLE_BY_5
  };

  private void scan() {
    try {
      System.out.println("数字を入力してください。");
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      input = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void next() {
    for (char character : this.input.toCharArray()) {
      if (character == '0' || character == '5') {
        this.currentState = State.DIVISIBLE_BY_5;
      } else {
        this.currentState = State.NOT_DIVISIBLE_BY_5;
      }
      System.out.printf("読み込んだ数値 : %c 遷移先 : %s\n", character, currentState);
    }
  }

  private void check() {
    for (State finState : this.finStates) {
      if (this.currentState == finState) {
        System.out.println("受理する。");
        return;
      }
    }
    System.out.println("受理しない。");
  }

  public static void main(String[] args) {
    Prog1 pr = new Prog1();
    pr.scan();
    pr.next();
    pr.check();
  }
}