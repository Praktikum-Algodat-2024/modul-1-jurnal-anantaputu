public class Node {
  String nama;
  String skill;
  int umur;
  String hobi;
  Node next;

  public Node (String nama, String skill, int umur, String hobi) {
    this.nama = nama;
    this.skill = skill;
    this.umur = umur;
    this.hobi = hobi;
    this.next = null;
  }
}