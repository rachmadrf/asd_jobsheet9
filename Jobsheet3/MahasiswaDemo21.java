import java.util.Scanner;

public class MahasiswaDemo21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Mahasiswa21[] arrMahasiswa21 = new Mahasiswa21[3];
        String dummy;

        for (int i = 0; i < 3; i++) {
            arrMahasiswa21[i] = new Mahasiswa21();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            arrMahasiswa21[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrMahasiswa21[i].nama = sc.nextLine();
            System.out.print("Kelas   : ");
            arrMahasiswa21[i].kelas = sc.nextLine();
            System.out.print("IPK   : ");
            dummy = sc.nextLine();
            arrMahasiswa21[i].ipk = Float.parseFloat(dummy);
            System.out.println("------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrMahasiswa21[i].cetakInfo();
        }

    }
}