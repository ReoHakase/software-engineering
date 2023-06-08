package week6_sequence;

class Number {
  private int num;

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public int square() {
    return num * num;
  }
}

class NumArray {
  private Number[] array;

  public NumArray() {
    array = new Number[3];
    for (int i = 0; i < array.length; i++) {
      array[i] = new Number();
      array[i].setNum(i + 10);
    }
  }

  public void even(int i, int n) {
    if (n % 2 == 0) {
      array[i].setNum(n);
    } else {
      array[i].setNum(n + 1);
    }
  }

  public int sum(int opt) {
    int result = 0;
    if (opt == 1) {
      for (int i = 0; i < array.length; i++) {
        result += array[i].getNum();
      }
    }
    if (opt == 2) {
      for (int i = 0; i < array.length; i++) {
        result += array[i].square();
      }
    }
    return result;
  }
}

class Kadai3 {
  public static void main(String[] args) {
    NumArray na = new NumArray();
    na.even(0, 5);
  }
}

class Kadai4 {
  public static void main(String[] args) {
    NumArray na = new NumArray();
    System.out.println("result: " + na.sum(1));
  }
}
