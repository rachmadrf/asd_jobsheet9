import java.util.Stack;

public class StackSurat21 {
    Stack<Surat21> stackSurat = new Stack<>();

    public void terimaSurat(Surat21 surat) {
        stackSurat.push(surat);
        System.out.println("Surat telah diterima.");
    }

    public void prosesSurat() {
        if (!stackSurat.isEmpty()) {
            Surat21 surat = stackSurat.pop();
            System.out.println("Memproses surat dengan data:");
            surat.tampilkanSurat();
        } else {
            System.out.println("Tidak ada surat yang perlu diproses.");
        }
    }

    public void lihatSuratTerakhir() {
        if (!stackSurat.isEmpty()) {
            System.out.println("Surat terakhir:");
            stackSurat.peek().tampilkanSurat();
        } else {
            System.out.println("Belum ada surat.");
        }
    }

    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (Surat21 surat : stackSurat) {
            if (surat.namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat ditemukan:");
                surat.tampilkanSurat();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat atas nama " + nama + " tidak ditemukan.");
        }
    }
}