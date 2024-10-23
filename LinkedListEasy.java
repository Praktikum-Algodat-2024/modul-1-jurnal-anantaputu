public class LinkedListEasy {
  Node head;

  public LinkedListEasy() {
    this.head = null;
  }

  public void addFirst (String nama, String skill, int umur, String hobi) {
    Node newNode = new Node(nama, skill, umur, hobi);
    if (head == null) {
      head = newNode;
    } else {
      newNode.next = head;
      head = newNode;
    }
  }

  public void addLast (String nama, String skill, int umur, String hobi) {
    Node newNode = new Node(nama, skill, umur, hobi);
    if (head == null) {
      head = newNode;
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNode;
    }
  }

  public void deleteFirst () {
    if (head == null) {
      System.out.println("DATA KOSONG");
    } else {
      head = head.next;
    }
  }

  public void deleteLast () {
    if (head == null) {
      System.out.println("DATA KOSONG");
    } else {
      Node temp = head;
      while (temp.next.next != null) {
        temp = temp.next;
      }
      temp.next = null;
    }
  }

  public void display () {
    Node temp = head;
      while (temp != null) {
        System.out.println("Nama  : " + temp.nama);
        System.out.println("Skill : " + temp.skill);
        System.out.println("Umur  : " + temp.umur);
        System.out.println("Hobi  : " + temp.hobi);
        System.out.println("------------------------------");
        temp = temp.next;
      }
  }

}