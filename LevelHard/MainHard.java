public class MainHard {
  public static void main(String[] args) {
    LinkedListHard list = new LinkedListHard();

    list.addDepartment("Information Technology", "Pengembangan Aplikasi X", "Tony Stark");
    list.addDepartment("Human Resource", "Recruitment", "Natasha Romanov");
    list.addDepartment("Operational", "Pembuatan SOP", "Steve Rogers");
    list.addDepartment("Research and Developement", "Product Developement", "Bruce Banner");

    list.addProyek("Information Technology", "Pengembangan Aplikasi X", "Tom Holland", 90, 7, 30000);
    list.addProyek("Information Technology", "Pemeliharan Server", "Happy Hogan", 10, 2, 5000);
    list.addProyek("Human Resource", "Recruitment", "Clint Barton", 60, 6, 12000);
    list.addProyek("Operational", "Pembuatan SOP", "Bucky Barnes", 15, 4, 1500);
    list.addProyek("Research and Developement", "Product Developement", "Jenifer Walters", 75, 4, 8000);

    list.addTahapanProyek("Information Technology", "Pengembangan Aplikasi X", "Requirement Analysis", 5, 5000);
    list.addTahapanProyek("Information Technology", "Pengembangan Aplikasi X", "System Design", 20, 5000);
    list.addTahapanProyek("Information Technology", "Pengembangan Aplikasi X", "Implementation", 30, 10000);
    list.addTahapanProyek("Information Technology", "Pengembangan Aplikasi X", "Integration and Testing", 15, 2500);
    list.addTahapanProyek("Information Technology", "Pengembangan Aplikasi X", "Deployment", 5, 5500);
    
    list.addTahapanProyek("Human Resource", "Recruitment", "Sourcing", 30, 2000);
    list.addTahapanProyek("Human Resource", "Recruitment", "Screening", 10, 5000);
    list.addTahapanProyek("Human Resource", "Recruitment", "Interview", 15, 10000);
    list.addTahapanProyek("Human Resource", "Recruitment", "Offering", 5, 2500);
    
    list.addTahapanProyek("Research and Developement", "Product Developement", "Idea Generation", 10, 2000);
    list.addTahapanProyek("Research and Developement", "Product Developement", "Concept Developement", 20, 1000);
    list.addTahapanProyek("Research and Developement", "Product Developement", "Feasibility Study", 15, 500);
    list.addTahapanProyek("Research and Developement", "Product Developement", "Product Desain", 30, 2500);
    
    // MENAMPILKAN DEPARTMENT
    System.out.println("\n\n\n\n");
    list.departmentList();
    System.out.println("\n\n");
    
    // MENAMPILKAN PROYEK TIAP DEPARTMENT
    list.menampilkanProyek();
    System.out.println("\n\n");
    
    // MENAMPILKAN TAHAPAN PROYEK
    list.menampilkanTahapanProyek();
    
    System.out.println("\n\n");
    list.addTahapanProyek("Information Technology", "Pengembangan Aplikasi X", "Implementasi Lanjutan", 15, 2500);
    
    System.out.println("\n\n\n\n");
  }
}