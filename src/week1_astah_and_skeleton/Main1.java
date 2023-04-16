// 4I36 Reo Hakuta

package week1_astah_and_skeleton;

public class Main1 {
  public static void main(String[] args) {
    MyCalc mc1;
    mc1 = new MyCalc();

    mc1.calc(10, 300);
    System.out.println("----- show -----");
    mc1.show();

    mc1.setResult1(500);
    mc1.setResult2(20);
    System.out.println("----- getResult -----");
    System.out.println("Result1: " + mc1.getResult1());
    System.out.println("Result2: " + mc1.getResult2());
  }
}
