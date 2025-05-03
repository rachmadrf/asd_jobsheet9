import java.util.Scanner;

public class pemilihanJobsheet1 {

    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        String nama, kelas, nim, nilaiHuruf, keterangan;
        int noAbsen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan nomor absen: ");
        noAbsen = sc.nextByte();

        System.out.println("Program menghitung nilai akhir");
        System.out.println("=========================");

        do {
            System.out.print("Masukkan nilai tugas: ");
            nilaiTugas = sc.nextDouble();
            if (nilaiTugas < 0 || nilaiTugas > 100) {
                System.out.println("Nilai tugas harus antara 0-100");
            }
        } while (nilaiTugas < 0 || nilaiTugas > 100);

        do {
            System.out.print("Masukkan nilai kuis: ");
            nilaiKuis = sc.nextDouble();
            if (nilaiKuis < 0 || nilaiKuis > 100) {
                System.out.println("Nilai kuis harus antara 0-100");
            }
        } while (nilaiKuis < 0 || nilaiKuis > 100);

        do {
            System.out.print("Masukkan nilai UTS: ");
            nilaiUTS = sc.nextDouble();
            if (nilaiUTS < 0 || nilaiUTS > 100) {
                System.out.println("Nilai UTS harus antara 0-100");
            }
        } while (nilaiUTS < 0 || nilaiUTS > 100);

        do {
            System.out.print("Masukkan nilai UAS: ");
            nilaiUAS = sc.nextDouble();
            if (nilaiUAS < 0 || nilaiUAS > 100) {
                System.out.println("Nilai UAS harus antara 0-100");
            }
        } while (nilaiUAS < 0 || nilaiUAS > 100);

        System.out.println("=========================" + "\n=========================");

        nilaiAkhir = ((nilaiTugas * 0.20) + (nilaiKuis * 0.20) + (nilaiUTS * 0.30) + (nilaiUAS * 0.30));

        if (nilaiAkhir > 80 && nilaiAkhir <= 100 ) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        } else {
            nilaiHuruf = "null";
        }

        if (nilaiAkhir > 50 && nilaiAkhir <= 100 ) {
            keterangan = "Lulus";
        } else {
            keterangan = "Tidak lulus";
        }

        System.out.println("Nilai akhir: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("Keterangan: " + keterangan);

    }
}