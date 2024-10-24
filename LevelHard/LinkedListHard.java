public class LinkedListHard {
  Department head;

  public LinkedListHard() {
      this.head = null;
  }

  public void addDepartment(String namaDepartment, String namaProyek, String kepalaDepartment) {
      Department newDepartment = new Department(namaDepartment, namaProyek, kepalaDepartment);
      if (head == null) {
          head = newDepartment;
      } else {
          Department temp = head;
          while (temp.next != null) {
              temp = temp.next;
          }
          temp.next = newDepartment;
      }
  }

  public void addProyek(String nama, String namaProyek, String namaManajer, int durasi, int banyakAnggota, int budget) {
      Department temp = head;
      while (temp != null) {
          if ((temp.namaDepartment).equals(nama)) {
              temp.addProyek(namaProyek, namaManajer, durasi, banyakAnggota, budget);
              return;
          }
          temp = temp.next;
      }
      System.out.println("DEPARTMENT TIDAK DITEMUKAN!");
  }

  public void addTahapanProyek(String namaDepart, String namaProy, String tahapan, int durasi, int pengeluaran) {
      Department temp = head;
      while (temp != null) {
          if ((temp.namaDepartment).equals(namaDepart)) {
              temp.addTahapanProyek(namaProy, tahapan, durasi, pengeluaran);
              return;
          }
          temp = temp.next;
      }
      System.out.println("DEPARTMENT TIDAK DITEMUKAN!");
  }

  public void menampilkanProyek() {
      Department temp = head;
      while (temp != null) {
          temp.proyekList();
          temp = temp.next;
      }
  }

  public void menampilkanTahapanProyek() {
      Department temp = head;
      while (temp != null) {
          temp.displayTahapanProyek();
          temp = temp.next;
      }
  }

  public void departmentList() {
      Department temp = head;
      System.out.println("[AVENGERS COMPANY DEPARTMENT LIST]");
      while (temp != null) {
          System.out.println("----------------------------------");
          System.out.println("Nama  : " + temp.namaDepartment);
          System.out.println("Nama Proyek : " + temp.namaProyek);
          System.out.println("Kepala Department : " + temp.kepalaDepartment);
          System.out.println("==================================");
          temp = temp.next;
      }
  }
}
