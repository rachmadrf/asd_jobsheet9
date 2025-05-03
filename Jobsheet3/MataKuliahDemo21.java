import java.util.Scanner;

public class MataKuliahDemo21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        MataKuliah21[] arrMataKuliah21 = new MataKuliah21[jumlahMataKuliah];

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan Data Mata Kuliah Ke-" + (i+1));
            arrMataKuliah21[i] = new MataKuliah21();
            arrMataKuliah21[i].tambahData();
        }

        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            arrMataKuliah21[i].cetakInfo();
        }
    }
}