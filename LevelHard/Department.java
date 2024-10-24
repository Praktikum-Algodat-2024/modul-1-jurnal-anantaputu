public class Department {
  String namaDepartment;
  String namaProyek;
  String kepalaDepartment;
  Proyek head;
  Department next;
  Department prev;

  public Department(String namaDepartment, String namaProyek, String kepalaDepartment) {
    this.namaDepartment = namaDepartment;
    this.namaProyek = namaProyek;
    this.kepalaDepartment = kepalaDepartment;
    this.head = null;
    this.next = null;
    this.prev = null;
  }

  public void addProyek (String namaProyek, String namaManajer, int durasi, int banyakAnggota, int budget) {
    Proyek newProyek = new Proyek(namaProyek, namaManajer, durasi, banyakAnggota, budget);
    if (head == null) {
      head = newProyek;
    } else {
      Proyek temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = newProyek;
    }
  }

  public void addTahapanProyek (String nama, String tahapan, int durasi, int pengeluaran) {
    Proyek temp = head;
    while (temp != null) {
      if ((temp.namaProyek).equals(nama)) {
        temp.addTahapanProyek(tahapan, durasi, pengeluaran);
        return;
      }
      temp = temp.next;
    }
    System.out.println("PROYEK TIDAK DITEMUKAN!");
  }

  public void displayTahapanProyek () {
    Proyek temp = head;
    while (temp != null) {
      temp.TahapanProyekList();
      temp = temp.next;
    }
  }

  public void proyekList () {
    if (head == null) {
      System.out.println("DATA KOSONG!");
    } else {
      Proyek temp = head;
      System.out.println("==================================");
      System.out.println("Department Name : " + this.namaDepartment);
      System.out.println("Department Name : " + this.kepalaDepartment);
      System.out.println("==================================");
      System.out.println("PROJECT LIST : ");
      while (temp != null) {
        System.out.println("----------------------------------");
        System.out.println("Project Name: " + temp.namaProyek);
        System.out.println("Project Name: " + temp.namaManajer);
        System.out.println("Project Name: " + temp.durasi);
        System.out.println("Project Name: " + temp.banyakAnggota);
        System.out.println("Project Name: " + temp.budget);
        System.out.println("----------------------------------");
        temp = temp.next;
      }
    }
  }

}