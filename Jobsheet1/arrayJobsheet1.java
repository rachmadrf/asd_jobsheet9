import java.util.Scanner;

public class arrayJobsheet1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("====================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================");

        System.out.print("Masukkan jumlah mata kuliah yang diambil: ");
        int jmlMatkul = input.nextInt();
        input.nextLine();

        String[] namaMatkul = new String[jmlMatkul];
        int[] nilaiMatkul = new int[jmlMatkul];
        int[] bobotSKS = new int[jmlMatkul];
        double[] nilaiSetara = new double[jmlMatkul];
        String[] nilaiHuruf = new String[jmlMatkul];
        double totalSetara = 0;
        int totalSKS = 0;

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            namaMatkul[i] = input.nextLine();
            
            System.out.print("Masukkan bobot SKS mata kuliah ke-" + (i + 1) + ": ");
            bobotSKS[i] = input.nextInt();

            do {
                System.out.print("Masukkan nilai mata kuliah (0-100) ke-" + (i + 1) + ": ");
                nilaiMatkul[i] = input.nextInt();
                if (nilaiMatkul[i] < 0 || nilaiMatkul[i] > 100) {
                    System.out.println("Nilai mata kuliah harus antara 0 dan 100. Silakan ulangi input.");
                }
            } while (nilaiMatkul[i] < 0 || nilaiMatkul[i] > 100);

            input.nextLine();

            if (nilaiMatkul[i] > 80 && nilaiMatkul[i] <= 100) {
                nilaiSetara[i] = 4.0;
                nilaiHuruf[i] = "A";
            } else if (nilaiMatkul[i] > 73 && nilaiMatkul[i] <= 80) {
                nilaiSetara[i] = 3.5;
                nilaiHuruf[i] = "B+";
            } else if (nilaiMatkul[i] > 65 && nilaiMatkul[i] <= 73) {
                nilaiSetara[i] = 3.0;
                nilaiHuruf[i] = "B";
            } else if (nilaiMatkul[i] > 60 && nilaiMatkul[i] <= 65) {
                nilaiSetara[i] = 2.5;
                nilaiHuruf[i] = "C+";
            } else if (nilaiMatkul[i] > 50 && nilaiMatkul[i] <= 60) {
                nilaiSetara[i] = 2.0;
                nilaiHuruf[i] = "C";
            } else if (nilaiMatkul[i] > 39 && nilaiMatkul[i] <= 50) {
                nilaiSetara[i] = 1.0;
                nilaiHuruf[i] = "D";
            } else {
                nilaiSetara[i] = 0.0;
                nilaiHuruf[i] = "E";
            }

            totalSetara += nilaiSetara[i] * bobotSKS[i];
            totalSKS += bobotSKS[i];
        }

        double rerataIP = totalSetara / totalSKS;

        System.out.println("\n=====================================================================================");
        System.out.printf(" %-3s | %-45s | %-5s | %-3s | %-7s | %-5s \n", "No", "Nama Mata Kuliah", "Nilai", "SKS", "Setara", "Huruf");
        System.out.println("=====================================================================================");

        for (int i = 0; i < jmlMatkul; i++) {
            System.out.printf(" %-3d | %-45s | %-5d | %-3d | %-7.1f | %-5s \n", 
                              (i + 1), namaMatkul[i], nilaiMatkul[i], bobotSKS[i], nilaiSetara[i], nilaiHuruf[i]);
        }

        System.out.println("=====================================================================================");
        System.out.println("IP semester = :" + rerataIP);

        input.close();
    }
}