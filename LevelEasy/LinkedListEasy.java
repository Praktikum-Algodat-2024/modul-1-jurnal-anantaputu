public class LinkedListEasy {
  NodeEasy head;

  public LinkedListEasy() {
    this.head = null;
  }

  public void addFirst (String nama, String skill, int umur, String hobi) {
    NodeEasy newNodeEasy = new NodeEasy(nama, skill, umur, hobi);
    if (head == null) {
      head = newNodeEasy;
    } else {
      newNodeEasy.next = head;
      head = newNodeEasy;
    }
  }

  public void addLast (String nama, String skill, int umur, String hobi) {
    NodeEasy newNodeEasy = new NodeEasy(nama, skill, umur, hobi);
    if (head == null) {
      head = newNodeEasy;
    } else {
      NodeEasy temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newNodeEasy;
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
      NodeEasy temp = head;
      while (temp.next.next != null) {
        temp = temp.next;
      }
      temp.next = null;
    }
  }

  public void display () {
    NodeEasy temp = head;
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