package week6_sequence;

class Item {
  private String name;
  private int price;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void show() {
    System.out.println(name);
    System.out.println(price);
  }
}

class ItemList {
  private Item list[];

  public ItemList() {
    list = new Item[3];
    for (int i = 0; i < list.length; i++) {
      list[i] = new Item();
    }
  }

  public void show() {
    for (int i = 0; i < list.length; i++) {
      list[i].show();
    }
  }
}

class Kadai1 {
  public static void main(String[] args) {
    Item i = new Item();
    i.setName("Coffee");
    i.show();
    i.setPrice(540);
    i.show();
    System.out.println("Name: " + i.getName());
  }
}

class Kadai2 {
  public static void main(String[] args) {
    ItemList il = new ItemList();
    il.show();
  }
}
