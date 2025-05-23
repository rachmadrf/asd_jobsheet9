import java.util.Scanner;

public class MahasiswaDemo21 {
  public static void main(String[] args) {
    StackTugasMahasiswa21 stack = new StackTugasMahasiswa21(5);
    Scanner scan = new Scanner (System.in);
    int pilih;

    do {
      System.out.println("\n Menu:");
      System.out.println("1. Mengumpulkan Tugas");
      System.out.println("2. Menilai Tugas");
      System.out.println("3. Melihat Tugas Teratas");
      System.out.println("4. Melihat Daftar Tugas");
      System.out.println("5. Melihat Tugas Pertama Dikumpulkan");
      System.out.println("6. Lihat Jumlah Tugas yang Dikumpulkan");
      System.out.print("Pilih: ");
      pilih = scan.nextInt();
      scan.nextLine();
      
      switch (pilih) {
        case 1:
          System.out.print("Nama: ");
          String nama = scan.nextLine();
          System.out.print("NIM: ");
          String nim = scan.nextLine();
          System.out.print("Kelas: ");
          String kelas = scan.nextLine();
          Mahasiswa21 mhs = new Mahasiswa21(nama, nim, kelas);
          stack.push(mhs);
          System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
          break;
        
        case 2:
          Mahasiswa21 dinilai = stack.pop();
          if (dinilai != null) {
            System.out.println("Menilai tugas dari " + dinilai.nama);
            System.out.print("Masukkan nilai (0-100): ");
            int nilai = scan.nextInt();
            dinilai.tugasDinilai(nilai);
            System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
            String biner = stack.konversiDesimalKeBiner(nilai);
            System.out.println("Nilai Bienr Tugas: " + biner);
          }
          break;

        case 3:
          Mahasiswa21 lihat = stack.peek();
          if (lihat != null) {
            System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
          }
          break;

        case 4:
          System.out.println("Daftar semua tugas: ");
          System.out.println("Nama\tNIM\tKelas\tNilai");
          stack.print();
          break;
        
        case 5:
          Mahasiswa21 bawah = stack.peekBottom();
          if (bawah != null) {
            System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
          }
        break;

        case 6:
          System.out.println("Jumlah tugas yang dikumpulkan: " + stack.jumlahTugas());
        break;
      
        default:
          System.out.println("Pilihan tidak valid.");
        break;
      }
    } while (pilih >= 1 && pilih <= 6);
  }
}