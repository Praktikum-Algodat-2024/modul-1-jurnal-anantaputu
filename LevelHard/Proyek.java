public class Proyek {
  String namaProyek;
  String namaManajer;
  int durasi;
  int banyakAnggota;
  int budget;
  int totalPengeluaran;
  TahapanProyek head;
  Proyek next;
  Proyek prev;

  public Proyek(String namaProyek, String namaManajer, int durasi, int banyakAnggota, int budget) {
      this.namaProyek = namaProyek;
      this.namaManajer = namaManajer;
      this.durasi = durasi;
      this.banyakAnggota = banyakAnggota;
      this.budget = budget;
      this.totalPengeluaran = 0; // Inisialisasi totalPengeluaran
      this.head = null;
      this.next = null;
      this.prev = null;
  }

  public void addTahapanProyek(String tahapan, int durasi, int pengeluaran) {
      TahapanProyek newTahapanProyek = new TahapanProyek(tahapan, durasi, pengeluaran);
      if (head == null) {
          head = newTahapanProyek;
          newTahapanProyek.next = head; // Circular link
          totalPengeluaran += pengeluaran; // Update totalPengeluaran
      } else {
          TahapanProyek temp = head;
          while (temp.next != head) {
              temp = temp.next;
          }
          int sisaBudget = this.budget - this.totalPengeluaran - pengeluaran;
          if (sisaBudget < 0) {
              System.out.println("Budget kurang, tidak dapat menambahkan stage baru");
              System.out.println("Sisa budget yang dimiliki   : " + sisaBudget);
              return;
          }
          temp.next = newTahapanProyek;
          newTahapanProyek.next = head; // Circular link
          totalPengeluaran += pengeluaran; // Update totalPengeluaran
      }
  }

  public void TahapanProyekList() {
      System.out.println("==================================");
      System.out.println("Project Name : " + this.namaProyek);
      System.out.println("Project Manager : " + this.namaManajer);
      System.out.println("Duration : " + this.durasi);
      System.out.println("Total Member : " + this.banyakAnggota);
      System.out.println("Budget : " + this.budget);
      System.out.println("Total Expenses : " + this.totalPengeluaran); // Display totalPengeluaran
      System.out.println("==================================");
      System.out.println("STAGE LIST: ");
      if (head == null) {
          System.out.println("No stage available");
      } else {
          TahapanProyek temp = head;
          do {
              System.out.println("----------------------------------");
              System.out.println("Stage Name : " + temp.tahapan);
              System.out.println("Duration : " + temp.durasi);
              System.out.println("Cost : " + temp.pengeluaran);
              System.out.println("----------------------------------");
              temp = temp.next;
          } while (temp != head);
      }
  }
}
