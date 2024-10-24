public class TahapanProyek {
  String tahapan;
  int durasi;
  int pengeluaran;
  TahapanProyek next;

  public TahapanProyek (String tahapan, int durasi, int pengeluaran) {
    this.tahapan = tahapan;
    this.durasi = durasi;
    this.pengeluaran = pengeluaran;
    this.next = this;
  }
}