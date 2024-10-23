public class NodeEasy {
  String nama;
  String skill;
  int umur;
  String hobi;
  NodeEasy next;

  public NodeEasy (String nama, String skill, int umur, String hobi) {
    this.nama = nama;
    this.skill = skill;
    this.umur = umur;
    this.hobi = hobi;
    this.next = null;
  }
}