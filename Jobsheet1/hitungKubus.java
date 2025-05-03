import java.util.Scanner;

public class hitungKubus {

    static int sisi = 0;
    static int hasil = 0;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Program Hitung Luas dan Keliling Kubus");
        System.out.println("--------------------------------");
        System.out.println("(1) Hitung Keliling Kubus");
        System.out.println("(2) Hitung Luas Kubus");
        System.out.println("(3) Hitung Volume Kubus");
        System.out.print("Pilih menu program : ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                kelilingKubus();
                break;
            
            case 2:
                luasKubus();
                break;

            case 3:
                volumeKubus();
                break;

            default:
                break;
        }
    }

    static void kelilingKubus() {
        Scanner input = new Scanner(System.in);

        System.out.println(" Program Hitung Keliling Kubus");
        System.out.println("--------------------------------");
        System.out.print("Masukkan Sisi Kubus : ");
        sisi = input.nextInt();
        hasil = 12 * sisi;
        System.out.println(" Keliling Kubus : " + hasil);
    }

    static void luasKubus() {
        Scanner input = new Scanner(System.in);

        System.out.println(" Program Hitung Luas Kubus");
        System.out.println("--------------------------------");
        System.out.print("Masukkan Sisi Kubus : ");
        sisi = input.nextInt();
        hasil = 6 * sisi * sisi;
        System.out.println("Luas Kubus : " + hasil);
    }

    static void volumeKubus() {
        Scanner input = new Scanner(System.in);

        System.out.println(" Program Hitung Volume Kubus");
        System.out.println("--------------------------------");
        System.out.print("Masukkan Sisi Kubus : ");
        sisi = input.nextInt();
        hasil = sisi * sisi * sisi;
        System.out.println("Volume Kubus : " + hasil);
    }
}