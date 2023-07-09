package week12;

//Observerインタフェース
interface Observer {
  // 【今日のPoint】Viewを更新するためのメソッド
  // このインタフェースをimplementsしたクラスは、必ずこのメソッドを定義しなければならない
  public void update();
}
