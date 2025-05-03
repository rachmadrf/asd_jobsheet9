import java.util.Scanner;

public class jadwalKuliah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] namaMataKuliah = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1) + ":");
            System.out.print("Nama Mata Kuliah: ");
            namaMataKuliah[i] = scanner.nextLine();
            System.out.print("SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan hari");
            System.out.println("3. Tampilkan jadwal berdasarkan semester");
            System.out.println("4. Cari mata kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tampilkanJadwal(namaMataKuliah, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalBerdasarkanHari(namaMataKuliah, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester: ");
                    int sem = scanner.nextInt();
                    scanner.nextLine();
                    tampilkanJadwalBerdasarkanSemester(namaMataKuliah, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah: ");
                    String nama = scanner.nextLine();
                    cariMataKuliah(namaMataKuliah, sks, semester, hariKuliah, nama);
                    break;
                case 5:
                    System.out.println("Terima kasih.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        }
    }

    public static void tampilkanJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\nJadwal Kuliah:");
        for (int i = 0; i < nama.length; i++) {
            System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i] + " | Hari: " + hari[i]);
        }
    }

    public static void tampilkanJadwalBerdasarkanHari(String[] nama, int[] sks, int[] semester, String[] hari, String targetHari) {
        System.out.println("\nJadwal Kuliah pada " + targetHari + ":");
        boolean found = false;
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(targetHari)) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Semester: " + semester[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada kuliah pada hari " + targetHari);
        }
    }

    public static void tampilkanJadwalBerdasarkanSemester(String[] nama, int[] sks, int[] semester, String[] hari, int targetSemester) {
        System.out.println("\nJadwal Kuliah untuk Semester " + targetSemester + ":");
        boolean found = false;
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == targetSemester) {
                System.out.println(nama[i] + " | SKS: " + sks[i] + " | Hari: " + hari[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada mata kuliah untuk semester " + targetSemester);
        }
    }

    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String targetNama) {
        boolean found = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(targetNama)) {
                System.out.println("\nDetail Mata Kuliah:");
                System.out.println("Nama: " + nama[i]);
                System.out.println("SKS: " + sks[i]);
                System.out.println("Semester: " + semester[i]);
                System.out.println("Hari Kuliah: " + hari[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }
}