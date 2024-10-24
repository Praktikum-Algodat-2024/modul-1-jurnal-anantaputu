public class MainEasy {
  public static void main(String[] args) {
    LinkedListEasy list = new LinkedListEasy();

    list.addFirst("Vadel", "Dance Geter", 19, "Dance");
    list.addLast("Loli", "ATM Berjalan", 16, "Liat Vadel");
    list.addLast("Agus", "Agus Sakit", 35, "Donasi");
    list.addLast("Fufu Fafa", "Roasting", 30, "Buka Kaskus");
    list.addFirst("Kak Gem", "Kasi Faham", 32, "Bernafas");

    list.deleteLast();
    list.deleteFirst();

    list.display();
  }
}