import java.util.Scanner;

public class DemoSuratIzin21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackSurat21 stackSurat = new StackSurat21();
        int pilihan;
        do {
            System.out.println("\n=== MENU SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat      : ");
                    String id = sc.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas         : ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = sc.nextLine().toUpperCase().charAt(0);
                    System.out.print("Durasi (hari) : ");
                    int durasi = sc.nextInt();
                    sc.nextLine(); // buang newline
                    Surat21 surat = new Surat21(id, nama, kelas, jenis, durasi);
                    stackSurat.terimaSurat(surat);
                    break;
                case 2:
                    stackSurat.prosesSurat();
                    break;
                case 3:
                    stackSurat.lihatSuratTerakhir();
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cariNama = sc.nextLine();
                    stackSurat.cariSurat(cariNama);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);

        sc.close();
    }
}